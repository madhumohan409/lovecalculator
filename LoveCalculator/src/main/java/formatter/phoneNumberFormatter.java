package formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.DTO.Phone;

public class phoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("print method is executing");
		return phone.getCountryCode()+ "-" +phone.getUserNumber();
	}

	@Override
	public Phone parse(String phoneNumberList, Locale locale) throws ParseException {
		Phone phone = new Phone();
		String[] phoneNumberArray = phoneNumberList.split("-");
		
	int index = phoneNumberList.indexOf('-');
	if(index == -1 && phoneNumberList.startsWith("-")) {
		phone.setCountryCode("91");
		phone.setUserNumber(phoneNumberArray[0]);
		
	}
		
	else {
	phone.setCountryCode(phoneNumberArray[0]);
	phone.setUserNumber(phoneNumberArray[1]);
		
	}
	return phone;

}
}

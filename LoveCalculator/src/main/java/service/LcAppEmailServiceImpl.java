package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LcAppEmailServiceImpl implements LCAppEmailService {

	@Autowired
	private JavaMailSender javaMailsender;
	
@Override
	public void sendEmail(String userName,String userEmail, String result) {
		// TODO Auto-generated method stub
		SimpleMailMessage newEmail = new SimpleMailMessage();
		newEmail.setTo(userEmail);
		newEmail.setSubject("LoveCalculator APPlication Results");
		newEmail.setText("HI" + userName +"your results are "+ result);
		
		javaMailsender.send(newEmail);
	}

}

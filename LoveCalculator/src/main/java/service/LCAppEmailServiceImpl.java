package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class LCAppEmailServiceImpl implements LCAppEmailService {
	@Autowired
private	JavaMailSender javaMailsenderImpl;

	@Override
	public void sendEmail(String userName, String userEmail, String result) {
		
		// TODO Auto-generated method stub
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

		simpleMailMessage.setTo(userEmail);
		simpleMailMessage.setSubject("love calculator predictions");
		simpleMailMessage.setText("HI "+userName+" LoveCalculator predicted results are "+result);
		
		javaMailsenderImpl.send(simpleMailMessage);
	}

}

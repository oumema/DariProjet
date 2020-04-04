package tn.esprit.spring;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entity.Annonce;
import tn.esprit.spring.entity.State;
import tn.esprit.spring.service.AchatServiceImpl;
import tn.esprit.spring.service.AnnServiceImpl;
import tn.esprit.spring.entity.*;
import tn.esprit.spring.entity.Type;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.UserSerivce;
import tn.esprit.spring.service.UserServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DariApplicationTests {
	@Autowired
	UserServiceImpl us;
	@Autowired
	AnnServiceImpl as;
	@Autowired
	AchatServiceImpl am;
	
	/* @Test
	 public void contextLoads() {
		us.retrieveAllUsers();
		
	}
	*/
	
	@Test
public void contextLoads() {
		User b=new User ((long)5,"ss","ddd",(long)111111,(long)222,"salsabil.bejaoui@esprit.tn",(long) 7000,"dfff", "ff","ff","nnn",new Date(),Type.SimpleUser);
	//	Achat a = new Achat((long) 9,new Date(),"dd",Payementmode.Easy_payement,"ccc","ffff");
	// am.addAchat(a);
//	am.retrieveAllAchats();
	//am.deleteAchat("4");
	//am.retrieveAchat("6");
	
	//am.updateAchat(a);
		us.addUser(b);
	}
	
}

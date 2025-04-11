package rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {
	
	@RequestMapping("/emp")
	public User name()
	{
		User user=new User();
		user.setId(75);
		user.setName("Viraj");
		return user;
	}
	
	@RequestMapping("/valid")
	public String special()
	{
		return "error";
	}
	

}

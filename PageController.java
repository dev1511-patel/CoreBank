package edu.jspider.springmvc.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.jspider.springmvc.DTO.Admin;
import edu.jspider.springmvc.DTO.BankDTO;

@Controller
public class PageController {
	
	@RequestMapping(path = "/sign-up-page")
	protected String getSignUpPage() {
		return "sign_up";
		
	}
	@RequestMapping(path = "/sign-up-page-user")
	protected String getSignUpPageUser() {
		return "sign_up_User";
		
	}
	
	@RequestMapping(path = "/login-page")
	protected String getLoginPage() {
		return "login";
	}
	@RequestMapping(path = "/login-page-user")
	protected String getLoginPageUser() {
		return "login_User";
	}
	
	@RequestMapping(path = "/home")
	protected String getHomePage(HttpSession httpSession) {
		Admin admin = (Admin) httpSession.getAttribute("authenticated_admin");
		if(admin != null)
		return "home";
		else
			return "login"; 
	}
	
	
	@RequestMapping(path = "/home_User")
	protected String getHomePageUser(HttpSession httpSession) {
		BankDTO user = (BankDTO) httpSession.getAttribute("authenticated_user");
		if(user != null)
		return "home_User";
		else
			return "login_User"; 
	}
	

	@RequestMapping(path = "/add-student-page")
		protected String getAddStudentPage() {
			
		return "add_student";
		}
	
	@RequestMapping(path = "/add-teacher")  //this path is use for send request on web browser
	protected String getAddTeacherPage() {
		return "add_teacher";
		
	}
	@RequestMapping(path = "/useers")  //this path is use for send request on web browser
	protected String getUseers() {
		return "useers";
		
	}
	
	@RequestMapping(path = "/deposit")  //this path is use for send request on web browser
	protected String getDeposite() {
		return "deposit_money";
		
	}
	
	@RequestMapping(path = "/withdraw")  //this path is use for send request on web browser
	protected String getWithdraw() {
		return "withdraw_money";
		
	}
	
	@RequestMapping(path = "/transaction-history")  //this path is use for send request on web browser
	protected String getTransactionHistory() {
		return "transaction-history";
		
	}
	
	@RequestMapping(path = "/add-user")
	protected String getAddUserPage() {
		return "add_user";
		
	}
}

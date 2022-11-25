package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.CustomerDao;
import dao.impl.CustomerDaoImpl;
import entity.Customer;
import service.CustomerService;
import service.service.impl.CustomerServiceImpl;

@Controller
	public class CustomerController {
	CustomerService ex = new CustomerServiceImpl();
	CustomerDao dao = new CustomerDaoImpl();
	
	@RequestMapping("/land")
	public String newaccount(HttpServletRequest request) throws IOException {
		
		String id = request.getParameter("customer_id");
		String password = request.getParameter("customer_password");
		String name = request.getParameter("customer_name");
		String type = request.getParameter("customer_type");
		String money = request.getParameter("customer_money");
		int iId = Integer.valueOf(id);
		int iPassword = Integer.valueOf(password);
		int iMoney = Integer.valueOf(money);
		
		Customer customerone = new Customer(iId, iPassword, name, type, iMoney);
		
		dao.insertUser(customerone);
		
		
		
		
		
		
		
		return null;
		
		
		
		
		
		
	}
	
}

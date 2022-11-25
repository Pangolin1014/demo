package service.service.impl;

import java.io.IOException;

import dao.CustomerDao;
import dao.impl.CustomerDaoImpl;
import entity.Customer;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	CustomerDao exampleDao = new CustomerDaoImpl();
	
	@Override
	//只判断是否存在用户名
	public boolean checkId(int id) throws IOException {
		boolean result = false;
		Customer ex = exampleDao.selectUserById(id);
		if(ex==null) {
			result = false;
		}else {
			result = true;
		}
		return result;
	}

	@Override
	//判断用户名密码是否正确
	public boolean checkPswd(int id,int password) throws IOException {
		if(checkId(id)) {
			Customer ex = exampleDao.selectUserById(id);
			if(password==(ex.getCustomer_password())) {
				return true;
			}
		};
		
		return false;
	}

}

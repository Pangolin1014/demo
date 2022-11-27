package service.service.impl;

import java.io.IOException;


import dao.CustomerDao;
import dao.impl.CustomerDaoImpl;
import entity.Customer;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	CustomerDao Dao = new CustomerDaoImpl();
	


	@Override
	//只判断是否存在用户名
	public boolean checkId(int id) throws IOException {
		boolean result = false;
		Customer ex = Dao.selectUserById(id);
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
			Customer ex = Dao.selectUserById(id);
			if(password==ex.getCustomer_password()) {
				return true;
			}
		};
		
		return false;
	}
	//根据用户的注册资金判断用户的VIP等级
	@Override
	public int checkvip(int iMoney) throws IOException {
		int vip;
		if(iMoney>=100000) {
			vip=1;
		}else vip=0;
			
		return vip;
	}

	@Override
	public int checkaccount(int id, int password) throws IOException {
		Customer ex = Dao.selectUserById(id);
		if(ex==null) {
			return 1;
		}else if (password != ex.getCustomer_password()) {
			return 2;
		}
		return 0;
	}

}

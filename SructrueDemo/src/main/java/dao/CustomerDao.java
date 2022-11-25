package dao;

import java.io.IOException;

import entity.Customer;

public interface CustomerDao {
	public void insertUser(Customer ex) throws IOException;
	public void deleteUserbyId(String id) throws IOException;
	public void updateUserById(Customer ex) throws IOException;
	public Customer selectUserById(int id) throws IOException;
}

package service;

import java.io.IOException;

public interface CustomerService {
	public boolean checkId(int id) throws IOException;
	public boolean checkPswd(int id,int password) throws IOException;
}

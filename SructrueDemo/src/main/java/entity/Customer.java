package entity;

public class Customer {
	
	private int customer_id; //顾客ID
	private int customer_password;//顾客密码",
	private String customer_name;//顾客姓名",
	private String customer_type;//法人或是个人
	private int customer_money;//注册资金
	
	
	
	
	public Customer(int customer_id, int customer_password, String customer_name, String customer_type,
			int customer_money) {
		super();
		this.customer_id = customer_id;
		this.customer_password = customer_password;
		this.customer_name = customer_name;
		this.customer_type = customer_type;
		this.customer_money = customer_money;
		
		
		
		
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(int customer_password) {
		this.customer_password = customer_password;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_type() {
		return customer_type;
	}
	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}
	public int getCustomer_money() {
		return customer_money;
	}
	public void setCustomer_money(int customer_money) {
		this.customer_money = customer_money;
	}
	
	
	
	
	
}
package com.bankingapplication;

public class CustomerDao {

	int CustId;
	long AccountNo;
	String Name;
	double Balance;
	public CustomerDao(int custId, long accountNo, String name, double balance, String passWord) {
		super();
		CustId = custId;
		AccountNo = accountNo;
		Name = name;
		Balance = balance;
		this.passWord = passWord;
	}
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int custId) {
		CustId = custId;
	}
	public long getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(long accountNo) {
		AccountNo = accountNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	String passWord;
	

}

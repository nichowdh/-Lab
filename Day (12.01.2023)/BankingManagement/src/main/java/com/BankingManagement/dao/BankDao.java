package com.BankingManagement.dao;

public interface BankDao {
	public void openAccount(); // open account in db

	public void fetchAccount();// fetch account from db

	public void depAccount();// deposit to account in db

	public void withAccount();// withdrawal from db

	public void pinChange();// pin change from db

	public void closeAccount();// delete account from db

}

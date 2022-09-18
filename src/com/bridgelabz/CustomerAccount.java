/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public interface  CustomerAccount {

	  public void stockAccount (String filename);  // create a new account from file
	    public double valueOf();  // total value of account dollars
	    public  void buy(int amount, String symbol); // add shares of stock to account
	    public void sell(int amount, String symbol); // subtract shares of stock from account
	    public void save(String filename);  //save account to file
	    public void printreport(); // print a detailed report of stocks and values  
	



}



/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;

/**Commercial data processing - StockAccount.java implements a data type that
might be used by a financial institution to keep track of customer information. 
The StockAccount class implements following methods

The StockAccount class also maintains a list of CompanyShares objects
which have Stock Symbol and Number of Shares as well as DateTime of the
transaction. When buy or sell is initiated StockAccount checks if
CompanyShares are available and accordingly update or create an Object.
 * @author ASUS
 *
 */
public class StockAccount implements CustomerAccount{

	/**
	 * @param args
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockAccount addStock = new StockAccount();
		addStock.buy(23, "Tata");
		addStock.printreport();
		
	}

	@Override
	public void stockAccount(String stockName) {
		// TODO Auto-generated method stub
		  // Add stock name
		stockName = "Tata";
		stockName = "Reliance";
        
	}

	@Override
	public double valueOf() {
		// TODO Auto-generated method stub
		  double val_stock = 0.0;
	  
	        return val_stock;
	}

	@Override
	public void buy(int amount, String symbol) {
		// TODO Auto-generated method stub
		amount = 2000;
		symbol = "tata";
		for(int i=0; i<=amount; i++) {
			if(symbol.equals(i)) {
				break;
			}
			else {
			System.out.println("You don't have shaes of this company.");
			}
		}
		
	}

	@Override
	public void sell(int amount, String symbol) {
		// TODO Auto-generated method stub
		amount = 5000;
		symbol = "reliance";
		
		int sell = -1;
		int stocks_rem = -1;
		for(int j=0; j<=amount; j++) {
			if(symbol.equals(j)) {
				break;
			}
			if(sell==-1) {
				System.out.println("Sorry , You dont own any shares of this company");
				break;
	        }
	        else if (stocks_rem<amount){
	            System.out.println("Sorry, You dont have enough shares of this company");
	            break;
	        }
			}
		
		
	}

	@Override
	public void save(String filename) {
		// TODO Auto-generated method stub
		filename = "Report";
		System.out.println("The file name is: " + filename);
	}

	@Override
	public void printreport() {
		// TODO Auto-generated method stub
		String stockName = "Tata";
		//System.out.println(stockName + );
	}
	
}

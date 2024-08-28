package javaEdu;

import java.io.IOException;

class Banking{
		int balance = 10000;
		void withdraw(int amt) throws IOException
		{
			int dif = balance - amt;
			if(dif<500) {
				IOException io = new IOException();
				throw io;
				//NullPointerException ne = new NullPointerException();
				//throw ne;
				//System.out.println("Balance is low");
				
				
			}else {
				balance = balance-amt;
				System.out.println("Amount left: " + balance);
			}
		}
	}



public class Except {

	public static void main(String[] args) {
		System.out.println("Banking has strarted");
		Banking b = new Banking();
		try {
		b.withdraw(2000);
		b.withdraw(3000);
		b.withdraw(3000);}
		catch(Exception e) {
			System.out.println("Exception for banking" +e);
		}
		
		System.out.println("Banking has ended");

	}

}

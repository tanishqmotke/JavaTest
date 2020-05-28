package assignment1;

import java.util.Scanner;

public class BankSoftware {

	public static void main(String[] args) {
		Details d = new Details();
		Scanner s = new Scanner(System.in);

		System.out.println("Entre Customer Details : 1.Name 2.Email-Id 3.Mobile Number");
		d.setName(s.nextLine());
		d.setMail(s.nextLine());
		String no = s.nextLine();
		int length = String.valueOf(no).length();
		if (length == 10) {
			d.setMobileno(no);
		} else {
			System.out.println("Entre 10 Dight Mobile Number");
		}

		System.out.println("Entre Bank Details : 1.Bank Name 2.IFSC 3.Acc Number 4.Main Balance");
		d.setBankname(s.nextLine());
		d.setIfsc(s.nextLine());
		d.setAccno(s.nextInt());
		d.setMainbalance(s.nextInt());

		System.out.println("1.View Details\n2.withdrawl\n3.Deposite\n4.Exit");
		int choice = s.nextInt();

		
		switch (choice) {
		case 1:
			System.out.println("Details of " + d.getName() + " are as follows:");
			System.out.println("Email-id : " + d.getMail() + "@gmail.com");
			System.out.println("Mobile Number : " + d.getMobileno());
			System.out.println("Bank Name :" + d.getBankname());
			System.out.println("IFSC Code :" + d.getIfsc());
			System.out.println("Acc Number :" + d.getAccno());
			System.out.println("Main Balance :" + d.getMainbalance());
			
			break;
		case 2:
			System.out.println("Entre Amout to Withdraw :");
			int withdraw = s.nextInt();
			if (d.getMainbalance() <= 2000) {
				System.out.println("Minimumn Balance should be 2000");
			} else {
				System.out.println("Main balance :" + (d.getMainbalance() - withdraw));
				d.setMainbalance(d.getMainbalance() - withdraw);
			}
			break;
		case 3:
			System.out.println("Entre Amout to Deposite :");
			int deposite = s.nextInt();
			System.out.println("Main balance :" + (d.getMainbalance() + deposite));
			d.setMainbalance(d.getMainbalance() - deposite);

		case 4:
			break;
		}
	}
}	

	class Bank {
		private int accno;
		private String ifsc;
		private String bankname;
		private int mainbalance;

		public int getAccno() {
			return accno;
		}

		public void setAccno(int accno) {
			this.accno = accno;
		}

		public String getIfsc() {
			return ifsc;
		}

		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}

		public String getBankname() {
			return bankname;
		}

		public void setBankname(String bankname) {
			this.bankname = bankname;
		}

		public int getMainbalance() {
			return mainbalance;
		}

		public void setMainbalance(int mainbalance) {
			this.mainbalance = mainbalance;
		}

	}

	class Details extends Bank {
		private String name;
		private String mail;
		private String mobileno;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getMobileno() {
			return mobileno;
		}

		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}

	}
	


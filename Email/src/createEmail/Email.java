package createEmail;

import java.util.Scanner;

public class Email {
	//folosim incapsularea (nu vrem ca cineva sa aiba acces)si le facem private
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String defaultPasswordLength = "10";
	private String  email;
	private String companySuffix = "company.com";
	
	
	
	// constructor pentru a primi firtName si lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//facem un syso
		System.out.println("Am cream email : " + this.firstName + " " + this.lastName);
		
		//cream o metoda cerand departamentul si returneaza departamentul
		
		this.department = setDepartment();
		System.out.println("Departament: " + this.department);
		
		// cream o metoda care creaza automat o parola
		
		this.password = randomPassword(8);
		System.out.println("Parola dvs. : " + this.password);
		
		//combinam elementele pentru a genera email
		
		email = firstName.toLowerCase() + " " + lastName.toLowerCase() + "@" + department + "."+companySuffix;
		System.out.println("Emailul tau: " + email);
	}
	
	//intrebam pentru departament 
	private String setDepartment() {
		System.out.println("Codul departamentului\n1 pentru vanzari\n2 pentru dezvoltare\n3 pentru contabilitate\n0 pentru nimic\n Introduceti codul departamentului : ");
		Scanner in = new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice == 1) {
			return "vanzari";
		}else if(depChoice == 2)
		{return "dezvoltare";
		}else if (depChoice == 3) {
			return "conta";
		}else {
			return " ";
		}
		
	}
	
	// generam o parola random
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#%*";
		char[] password = new char[length];
		for(int i =0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String (password);
	}
	
	//setam capacitatea la emailbox
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	// setam un email alternativ
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	// schimbam parola
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return " DISPLAY NUME " + firstName + " " + lastName +
				" EMAIL COMPANIE " + email + 
				" CAPACITATE MAILBOX " + mailboxCapacity + "mb";
	}
	
	
	
	
	
	
	
	
	
}

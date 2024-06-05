package emailapp;

import java.util.Scanner;
public class email {
private String firstname;
private String lastname;
private String password;
private String department;
private int mailBoxCapacity = 500;
private String alternateEmail;
private int defaultPasswordLength = 10;
private String email;
private String companySuffix = "aeycompany.com";
// constructor to receive the first name and last name

public email (String firstname, String lastname) {
	this.firstname = firstname;
	this.lastname = lastname;
	//System.out.println("Email Created " + this.firstname +" " + this.lastname);

	// call a method asking for the department - return the department
	this.department = setDepartment();
//	System.out.println("Department : " + this.department);
	
	// call a method that returns a random password
	
	this.password = randomPassword(defaultPasswordLength);
	 System.out.println("Your Password is : " + this.password);
	
	// combine elements to generate email
	
	email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" 
			+ department + "." + companySuffix;
//	System.out.println("Your email is : " + email);
}

// ask for the department

private String setDepartment() {
	System.out.println("new worker : " + firstname  + 
" Department codes : \n 1 for"
			+ " sales \n 2 for development \n 3 for accunting"
			+ " \n 4 for none \n enter department code : ");
	Scanner in = new Scanner(System.in);
	int depChoice = in.nextInt();
	if(depChoice == 1) return "sales";
	else if(depChoice == 2) return "dev";
	else if(depChoice == 3) return "acct";
	else return " ";
	 }



// generate a random password

private String randomPassword (int length) {
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^";
	char[] password = new char[length];
	for(int i=0;i<length;i++) {
		int rand = (int)(Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
	}
	return new String (password);
}

// set the mailbox capacity

public void setMailBoxCapacity(int capacity) {
	this.mailBoxCapacity = capacity;
}

//set the alternate email

public void setAlternateEmail(String altEmail) {
	this.alternateEmail = altEmail;
}

// Change the password

public void changePassword(String password) {
	this.password =password;
}

public int getMailBoxCapacity() { return mailBoxCapacity; }
public String getAlternateEmail() { return alternateEmail; }
public String getPassword() {return password; }

public String showInfo() {
	return "Display Name : " + firstname + " " + lastname+ " " +
			"\nCompany Email : " + email +
			"\nMailBox Capacity : " + mailBoxCapacity + "mb";
}


}


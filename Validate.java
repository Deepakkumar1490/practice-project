package EmailValidate;
import java.util.*;
import java.util.Scanner;
import java.lang.System;
public class Validate {
	public static void main(String[] args) {
	     
		ArrayList<String> Id=new ArrayList<String>();
		Id.add("deepak@gmail.com");
		Id.add("kumar@gmail.com");
		Id.add("mega@gmail.com");
		Id.add("varnan@gmail.com");
		Id.add("devi@gmail.com");
		Id.add("ramesh@gmail.com");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the User EmailId");
		String h=sc.next();
	
		 if(Id.contains(h)) {
		 System.out.println(h+" Email ID is found in Employee ID");
		 }
		 else {
		 System.out.println(h+" Email ID is not found in Employee ID");
		 }
}
}
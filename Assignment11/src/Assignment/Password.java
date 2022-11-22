package Assignment;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
	
	private static String numbers;
	private static char[] generatePassword(int length) {
		//Scanner sc=new Scanner(System.in);
	    //String st = sc.nextLine(); 
        String p = "ABCDEFGHIJKLMNOPQRSTUVWXYS1234567890abcdefghijklmnopqrstuvwxyz@#$&*";
        Random ran=new Random();
        char[] pswd=new char[length];
        for(int i=8;i<length;i++) {
        	
			pswd[i]=p.charAt(ran.nextInt(p.length()));
        }
        return pswd;
	}

	public static void main(String[] args) {
		System.out.println(generatePassword(18));
	}

}

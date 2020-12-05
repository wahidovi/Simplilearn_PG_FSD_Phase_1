package com.lockedme;


import java.util.Scanner;

public class InputValidator {
	
	/* * * * * * * * * * * * * * * * * * * * * * * * * * * * *  *
	 * using scanner as static so I can use it from anywhere    *
	 * 														    *
	 * closing the IO or scanner.close throws exception if      *
	 * I want to use scanner again in the program runtime.      *
	 * * * * * * * * * * *  * * * * * * * * * * * * * * * * * * */
	
static Scanner keyboardInput = new Scanner(System.in); 


	

 /* * * * * * * * * * * * * * * * * * * * * *
  * This function handle input validation   *
  * * * * * * * * * * *  * * * * * * * * * */
 
	public static short numOfOption(int i) {
		
		keyboardInput = new Scanner(System.in);
		short number;
		short numberOfOption = (short)i;
		do {
			
		   
		    
		    while (!keyboardInput.hasNextShort()) {
		        System.out.println("That's not a number!");
		        	
		        keyboardInput.next(); // this is important! for string input// clear stream 
		        
		        
		    }
		    
		     number = keyboardInput.nextShort();
		     
		    
		     
		    
		} while (number <= 0 || number>numberOfOption);
		
		
		return number;
	}

	
	
	 /* * * * * * * * * * * * * * * * * * * * * *
	  * This function handle File Extension
	  * Whether user type extension or not
	  * this will always create text file
	  * with .txt extension   *
	  * * * * * * * * * * *  * * * * * * * * * */
	public static String handleFileExtension(String fname) {
		
		if(fname.endsWith(".txt"))
		{
			//do nothing
		}
		else {
			fname = fname + ".txt";
			
		}
		return fname;
	}
	
	 /* * * * * * * * * * * * * * * * * * * * * *
	  * This function handle File name
	  * it prevents user from entering 
	  * incorrect or invalid filename   *
	  * * * * * * * * * * *  * * * * * * * * * */
	public static boolean isValidFilename(String s) {
		if(s.startsWith(".")) {
			return false;
		}
	    return s != null && s.matches("^[a-zA-Z0-9._-]*$");
	}

}

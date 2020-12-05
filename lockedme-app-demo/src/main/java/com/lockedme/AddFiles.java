package com.lockedme;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFiles {
	
	public static void createNewFile() {
		
		
		
		
	boolean userInput = false;
   
	String fileName = null;
 

		do {
			InputValidator.keyboardInput = new Scanner(System.in);
				System.out.println("\nEnter File Name : ");
				fileName = InputValidator.keyboardInput.nextLine();
				if(!InputValidator.isValidFilename(fileName)) {
					System.out.println("Invalid File Name. Start file name with AlphaNumeric");
				}
						
				userInput = InputValidator.isValidFilename(fileName);				
			 
			
		}while(!userInput); 
		
  
		
		
		fileName=InputValidator.handleFileExtension(fileName); 
		    
		File file = new File(fileName);
		     /*If file gets created then the createNewFile() 
		      * method would return true or if the file is 
		      * already present it would return false
		      */
	         boolean newFile;
			try {
				newFile = file.createNewFile();
				if (newFile){
			          System.out.println("File has been created successfully");
			     }
			     else if(file.exists()){
			          System.out.println("File already present at the specified location");
			     }
			} catch (IOException e) {
				
				System.out.println("Don't have permission to create a new File.");
				e.printStackTrace();
			}
		     
		     
	    	
		  }

	
		
	

}


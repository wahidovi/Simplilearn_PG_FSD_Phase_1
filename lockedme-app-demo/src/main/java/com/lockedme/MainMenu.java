package com.lockedme;

public class MainMenu {
	public static void main(String[] args) {
		
		short selectedOption=0;
		
		do {
			
			authorInfo();
			menuText();
			
			 selectedOption = InputValidator.numOfOption(3); // this function takes number of Option 
				
			//emptyLines();
			
			switch(selectedOption) {
			
			case 1:
				System.out.println(" \t** Retrieve the File names (Ascending Order) ** \n");
				FileNames.getFileNames();
				System.out.println("\n");
				pressEntertoContinue();
				break;
			case 2:
				System.out.println("Add, Delete, Search a user specified file");
				//Empty lines
				
				
				
				do {
					emptyLines();
					authorInfo();
					subMenuText();
					selectedOption = InputValidator.numOfOption(4);
					
					switch(selectedOption) {
					
					case 1: 
						System.out.println(" \n\t** Add a suer specified file **");
						AddFiles.createNewFile();
						pressEntertoContinue();
						break;
					case 2:
						//delete
						System.out.println("\t**Delete a file ** ");
						String filename = Find.getFiletoBeSerched();
						Delete.deleteFile(filename);
					
						pressEntertoContinue();
						
						break;
					case 3:
						//Search
						System.out.println("\t**Search a file ** ");
						boolean fileFound = false;
						String searchString = Find.getFiletoBeSerched();
						for (String filenames : FileNames.getFileList()) {
						    //get the all file names as a list
							if(filenames.endsWith(".txt")) {
						    
								if(Find.found(filenames, searchString)) {
									System.out.println("("+filenames+") Found");
									fileFound = true;
									break;
								}
								
							}
						}
						if(!fileFound) {
							System.out.println("file not found");
						}
						pressEntertoContinue();
						//Find.searchFor(source, toBeSearched);
						break;
					default:
						System.out.println("choose correct option");
					
					}
					
					
					
				}while(selectedOption!=4);
				emptyLines();
				break;
			
			case 3:
				System.out.println("Exit successfully. ");
				System.exit(0);
				
				default:
					System.out.println("Inside case default");
				}
			}while(true);
			
		}
	


 


public static void menuText() {
System.out.println("\n\tProgram Features - \n");
System.out.println("\t1. Retreivin the File names (Ascending Order) ");
System.out.println("\t2. Add, Delete, Search a user specified file ");
System.out.println("\t3. Close the Application ");
System.out.println("\nPlease choose an Option ( 1 - 3): ");



}

public static void subMenuText() {
System.out.println("\n\t1. Add Files  ");
System.out.println("\t2. Delete Files  ");
System.out.println("\t3. Search a user specified file ");
System.out.println("\t4. Back to Main Menu ");
System.out.println("\nPlease choose an Option ( 1 - 4): ");

}


public static void authorInfo() {
	System.out.println("\t\t LockedMe.com Prototype");
	System.out.println("\n\tPG FSD - Phase-1: Implement OOPS using JAVA");
	System.out.println("\t@Author: Mohammad Wahidur Rahman");
	System.out.println("\t e-mail: md.wahidovi@gmail.com");
	
	
}



public static void emptyLines() {
	for (int i = 0; i < 50; ++i) System.out.println();
}
public static void emptyLines(int x) {
	for (int i = 0; i < x; ++i) System.out.println();
}

private static void pressEntertoContinue()
{ 
       System.out.println("\nPress Enter or Reutrn key to continue...");
       try
       {
           System.in.read();
    	   
       }  
       catch(Exception e)
       {
    	   e.printStackTrace();
       }  
}
		
		
}
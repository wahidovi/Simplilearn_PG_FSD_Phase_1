package com.lockedme;

import java.io.File;



public class FileNames {
	

	
	public static void getFileNames() {
		
		boolean emptyDir = true;
		
		File file = new File(System.getProperty("user.dir"));
		
		String[] fileList = file.list();
		
		insertionSort(fileList);
		
		
		
		for (String filenames : fileList) {
	        // Print the names of files and directories
			
			if(filenames.endsWith(".txt")) { //Print File names that has .txt extension
				System.out.println(filenames);
			
				emptyDir = false;
				}
	    	}
		
		if(emptyDir) {
			System.out.println("Directory Empty. No *.txt files to Display");
		}
		
		}
	
public static String[]  getFileList() {
		
		//File file = new File(System.getProperty("user.dir")+"/src/"+MainMenu.class.getPackageName());
		
		File file = new File(System.getProperty("user.dir"));
		
		String[] fileList = file.list();
		
		insertionSort(fileList);
		
		
		return fileList;
		
		}
	
	public static void insertionSort(String[] array)
    {
         String temp;
         for(int i = 1; i < array.length; i++) 
         {
              temp = array[i];
              int j = 0;
              for(j = i; j > 0; j--)
                   if(temp.compareTo(array[j - 1]) < 0)
                        array[j] = array[j - 1];
                   else
                       break;
              array[j] = temp;
         }
    }
        
        
}

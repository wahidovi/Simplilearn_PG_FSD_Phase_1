package com.lockedme;

import java.io.File;

public class Delete {
	
	public static void deleteFile(String fname) {
		boolean found = false;
		String searchFile = fname;
		
		for (String filenames : FileNames.getFileList()) {
		    //get the all file names as a list
			if(filenames.endsWith(".txt")) {
		   
				if(Find.found(filenames, searchFile)) {
					File file = new File(System.getProperty("user.dir"));
					String filePath = file + File.separator + filenames;
					
					System.out.println(filePath);
					file = new File(filePath);
					
					file.delete();
					found = true;
					if(!file.exists())
						System.out.println("File has been deleted succussfully");
					
					
					break;
				}
				
			}
		}
		if(!found) {
			System.out.println("file not found");
		}
	}

	
}

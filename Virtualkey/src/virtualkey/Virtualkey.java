package virtualkey;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Virtualkey {
	List<String> fileList = new ArrayList<String>(List.of("demo1","demo2","demo3","demo4"));
	static final String path = "C:\\java";
	
	Virtualkey(){
		System.out.println("WELCOME TO COMPANY LOCKER’S VIRTUAL KEY FOR YOUR REPOSITORIES!!");
		System.out.println("DEVELOPED BY – Vimal raj");
		System.out.println();  
	}
	
	public void welcomeScreen(){    
		System.out.println("1. Show Files");
		System.out.println("2. More options");
		System.out.println("3. Exit");
		
	}
	
	public void showFiles() {     
		
		File file = new File(path);
		String[] ListofFiles = file.list();
		Arrays.sort(ListofFiles);
		
		System.out.println("Below is the file list - ");
		for(String i : ListofFiles) {
			System.out.println(i);
		}
	}
	
	
	public void moreOptions() {    
		
		int choice = displayOptions();
		
		switch(choice) {
			case 1:
				addFile();
				break;
			case 2:
				searchFile();
				break;
			case 3:
				deleteFile();
				break;
			case 4:
				welcomeScreen();
				break;
			default:
				System.out.println("Invalid input sub menu");
	    }
	}
	
	private int displayOptions() {
		
		System.out.println("1. Add file\n2. Search file\n3. Delete file\n4. Back ");
		System.out.println("\nEnter your choice: ");
		Boolean isValid = false;
		int choice = 0;
		while(!isValid) {
			try{
				Scanner userInput = new Scanner(System.in);
				choice = userInput.nextInt();
				isValid = true;
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input");
			}
		}
		
		return choice;
	}
	

	public void addFile() {        
		
		String Fname = getfileName();
		String location = path+Fname+".txt";
		
		File file = new File(location);
		
		try {
			Boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("File added successfully" );
			}
			else System.out.println("File already exists");
		} catch (IOException e) {
			System.out.println("File addition unsuccessful");
			e.printStackTrace();
		}

		moreOptions();
		
	}
	
	public void searchFile() {     
		 
		String Fname = getfileName();
		String location = path+Fname+".txt";
		
		File file = new File(location);
		
		
		
		if(!(file.exists())) {
			System.out.println("File not found");
		}
		else {
			System.out.println("File found at - " + file.getAbsolutePath());
		}
			moreOptions();
		
	}
	
	public void deleteFile() {   
		
		String Fname = getfileName();
		String location = path+Fname+".txt";
		
		File file = new File(location);
		
		if(file.delete()) {
			System.out.println("File removed successfully");
		}
		else System.out.println("File not found");
		moreOptions();
		
	}
	
	public String getfileName() {   
		
		System.out.println("Enter file name :");
		
		Boolean isValidInput = false;
		String Fname = null; 
		
		while(!isValidInput) {
			try{
				Scanner fileName = new Scanner(System.in);
				Fname =  fileName.nextLine();
				isValidInput = true;
 			}
			catch (InputMismatchException e) {
				System.out.println("Please enter valid file name");
			}
		}
		
		return Fname;
	}

}

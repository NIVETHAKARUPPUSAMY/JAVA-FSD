package Virtual_Key;

import java.util.List;
import java.util.Scanner;

public class Options {

	
	public static void WelcomeScreen() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				Option_call.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					Main_file.displayAllFiles("Main_Key");
					break;
				case 2:
					Options.FileMenu();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				WelcomeScreen();
			} 
		} while (running == true);
	}
	
	public static void FileMenu() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				Option_call.displayFileMenuOptions();
				Main_file.createMainFolderIfNotPresent("Main_Key");
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					// File Add
					System.out.println("Enter the name of the file to be added to the \"Main_Key\" folder");
					String fileToAdd = sc.next();
					
					Main_file.createFile(fileToAdd, sc);
					
					break;
				case 2:
					// File/Folder delete
					System.out.println("Enter the name of the file to be deleted from \"Main_Key\" folder");
					String fileToDelete = sc.next();
					
					Main_file.createMainFolderIfNotPresent("Main_Key");
					List<String> filesToDelete = Main_file.displayFileLocations(fileToDelete, "Main_Key");
					
					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);
				
					int idx = sc.nextInt();
					
					if (idx != 0) {
						Main_file.deleteFileRecursively(filesToDelete.get(idx - 1));
					} else {
						
						// If idx == 0, delete all files displayed for the name
						for (String path : filesToDelete) {
							Main_file.deleteFileRecursively(path);
						}
					}
					

					break;
				case 3:
					// File/Folder Search
					System.out.println("Enter the name of the file to be searched from \"Main_Key\" folder");
					String fileName = sc.next();
					
					Main_file.createMainFolderIfNotPresent("Main_Key");
					Main_file.displayFileLocations(fileName, "Main_Key");

					
					break;
				case 4:
					// Go to Previous menu
					return;
				case 5:
					// Exit
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				FileMenu();
			}
		} while (running == true);
	}
}


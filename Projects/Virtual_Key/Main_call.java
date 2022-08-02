package Virtual_Key;

public class Main_call {
	
public static void main(String[] args) {
		
		// Create "Main_Key" folder if not present in current folder structure
		Main_file.createMainKeyFolderIfNotPresent("Main_Key");
		
		Option_call.printWelcomeScreen("Main_file", "Nivetha Karuppusamy");
		
		Options.WelcomeScreen();
	}

}

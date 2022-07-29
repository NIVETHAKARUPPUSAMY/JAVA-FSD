import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Virtual_Key {


    public static void main(String[] args) {
       
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to Virtual Key for Your Repositories \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1. I wish to review my repositories",
                "2. I wish to add new file to the repository",
                "3. I wish to delete my repository",
                "4. I wish to sort the repository",
                "5. I wish to search for a particular repository",
                "6. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
        }
        ArrayList<String> arrlist = new ArrayList<String>();
        ArrayList<String> files = new ArrayList<String>();
        files.add("abc.java");
        files.add("files.java");
        files.add("strings.java");
        files.add("array.java");
        files.add("repo.java");
        files.addAll(arrlist);
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("Your saved repository files are listed below: \n");
                        System.out.println(files+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the String to be added to your Repository: \n");
                        String repo = sc.next();
                        files.add(repo);
                        System.out.println("Your file is updated\n");
                        files.addAll(arrlist);
                        System.out.println(files+"\n");
                        optionsSelection();
                        files.addAll(arrlist);
                        break;
                        
                    case 3:
                        System.out.println("You are about the delete all your files! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                        	files.clear();
                            System.out.println(files+"\n");
                            System.out.println("All your files are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortFiles(files);
                        optionsSelection();
                        break;
                    case 5:
                        searchFiles(files);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchFiles(ArrayList<String> files) {
       // int length = arrayList.size();
        System.out.println("Enter the file name you need to search in the repository:\t");
        Scanner scanner=new Scanner(System.in);
        String file=scanner.next();
      //  int result=Collections.binarySearch(arrayList,file);
        for (String element : files){
            if (element.contains(file)){
                  System.out.println("Search result " +element+" Found ");}
           
        }
}
        
       // System.out.println("Search result = " + arrayList.get(file));
    
   
	
   


	
	private static void sortFiles(ArrayList<String> arrayList) {
        int arrlength =  arrayList.size();
       Collections.sort(arrayList);
       System.out.println("Sort result = " +arrayList);
       System.out.println("");
    }
}
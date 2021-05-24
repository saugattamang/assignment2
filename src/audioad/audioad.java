package audioad;


import java.util.Scanner;

public class audioad {
	
public static void amin(String[] args){
	
	int choice;
	
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in); 
	
	choice = scanner.nextInt();
	
	while(choice != 4){
		
	    if (choice == 1) {
			System.out.println("Soundwork");
		    }
			else if (choice == 2) {
	        System.out.println("Artwork");
			}
	        else if (choice == 3) {
	        System.out.println("videos");
	        }
	         	
	    System.out.println("MENU");
		System.out.println("-----------");
		System.out.println("1. Soundwork ");
		System.out.println("2. Artwork");
		System.out.println("3. Videos");
		System.out.println("4. Exit");
		System.out.println("-----------");
		System.out.print("Enter Choice");
		
		choice = scanner.nextInt();
		System.out.println("Thank you for viewing. Goodbye");
		
	}
}
}


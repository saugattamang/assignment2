package audioad;

	import java.util.Scanner;

	public class audiojava2 {
	
		public static void displayMenu(int options[], String menuitems[]){
			System.out.println("MENU");
			System.out.println("-----------");
			for (int i = 0; i < options.length; i++) {
					System.out.printf("%d. %s\n",options[i], menuitems[i]);
			}
			System.out.println("-----------");
			System.out.print("Enter Choice");
		}
	public static void amin(String[] args){
		
		int choice;
		
		int options[] = {1,2,3,4};
		String menuitems[] = {"Soundwork", "Artwork", "Videos", "Exit"};
		
		
		displayMenu(options, menuitems);
		
		
		Scanner in = new Scanner(System.in); 
		
		choice = in.nextInt();
		
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
			
			choice = in.nextInt();
			System.out.println("Thank you for viewing. Goodbye");
			
			
			
				
				
				
				
			    }
			
			
		}
	
	}
	


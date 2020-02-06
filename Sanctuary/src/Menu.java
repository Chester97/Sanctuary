import java.util.Scanner;

public class Menu {
	public void initMenu() {
		int option;
		Scanner scanner = new Scanner(System.in);
		Animal animal = new Animal();
		
		showMenu();
		
		do {
			System.out.println("\n");
			System.out.println("======================================================================");
			System.out.println("Enter an option");
			option = scanner.nextInt();
			
			switch(option) {
				case 0:
					showMenu();
					break;
				case 1: 
					animal.getAnimals();
					break;
				case 2:
					System.out.println("Animal name is");
					scanner.nextLine();
					String animalName = scanner.nextLine();
					System.out.println("Animal ige is");
					int animalAge = scanner.nextInt();
					animal.addAnimal(animalName, animalAge);
					break;
				case 3:
					System.out.println("Type a number of animal: ");
					int animalID = scanner.nextInt();
					animal.removeAnimal(animalID);
					System.out.println("Animal in id: "+animalID+" has beedn adopted!");
					break;
				default:
					System.out.println("Invalid option!");
					break;
			}
		}while(option != 4);
		
		System.out.println("See you again :)");
	}
	
	public void showMenu() {
		System.out.println("Welcome to our Sanctuary");
		System.out.println("\n");
		System.out.println("0. Show Menu Again.");
		System.out.println("1. View list of our animals.");
		System.out.println("2. Give an animal to us.");
		System.out.println("3. Take an animal from us.");
		System.out.println("4. Exit");
	}
}

import java.util.ArrayList;

public class Animal {
	private String name;
	private int age;
	private int idCounter = 0;
	private ArrayList<Animal> animalList = new ArrayList<Animal>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void addAnimal(String name, int age) {
		Animal newAnimal = new Animal();
		newAnimal.setName(name);
		newAnimal.setAge(age);
		newAnimal.setIdCounter(idCounter);
		this.idCounter++;
		animalList.add(newAnimal);
		System.out.println("Animal has been added!");
	}
	public void removeAnimal(int id) {
		animalList.remove(id-1);
	}
	public void getAnimals() {
		if(animalList.size() > 0) {
			for(int i = 0; i < animalList.size(); i++) {
				int animalListNumber = i+1;
				String animalName = animalList.get(i).name;
				int animalAge = animalList.get(i).age;
				int animalID = animalList.get(i).idCounter;
				System.out.println(animalListNumber+". "+"Name: "+animalName+", "+"Age: "+animalAge+", "+"ID: "+animalID);
			}			
		}else {
			System.out.println("We dont have any animal at the moment.");
		}
	}
	public int getIdCounter() {
		return idCounter;
	}
	public void setIdCounter(int idCounter) {
		this.idCounter = idCounter;
	}

}

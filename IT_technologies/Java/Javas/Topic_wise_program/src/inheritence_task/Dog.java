package inheritence_task;



	class Animal
	{
		public void eat() {
			System.out.println("Animal is eating");
		}
	}
	
	class Mammal extends Animal
	{
		public void walk() {
			System.out.println("Mammal is walking");
		}
	}
	
	public class Dog extends Mammal
	{
	
		public void bark() {
			System.out.println("Dog is barking");
		}

	}


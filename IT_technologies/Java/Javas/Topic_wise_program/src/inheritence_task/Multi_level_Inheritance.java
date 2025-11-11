package inheritence_task;

public class Multi_level_Inheritance {
//	Animal => Mammal => Dog [Multi-level Inheritance]

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
	
	class Dog extends Mammal
	{
	
		public void bark() {
			System.out.println("Dog is barking");
		}
	}

}

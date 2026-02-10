Create a Employee Salary calculation Application project by using Method Overriding Concept to display different kinds of salary for PartTimeEmployee and FullTimeEmployee.
Validate all the inputs properly and generate error message, if any input is not appropriate. 

Create a BLC class called Employee
Fields :
 id  int  protected
 name String protected
	
Use a parameterized constructor to initialize all the fields, 

 Methods :
 
 1) Method Name 	: calculateSalary()
    Parameter  		: No Parameter
    Return Type 	: double
    Access modifier	: public
    In this method return 0.0 for generic salary

 Create another BLC class FullTimeEmployee which is sub class of Employee.

  
  Field :
  protected double salary;
  
  Take a parameterized constructor to initialize super class and sub class properties.
  Validate all the inputs properly and generate error message, if any input is not appropriate. 
  [See the Test cases for Input Validation]

 Method :
  
 2) Method Name 	: calculateSalary()
    Parameter   	: No Parameter
    Return Type 	: double
    Access modifier	: public
    
    In this overridden method return the salary of employee as a non static variable

    
Create another BLC class PartTimeEmployee which is sub class of Employee
  
  Field :
  protected double hourlyRate;
  protected int hoursWorked; 
  
  Take a parameterized constructor to initialize super class and sub class properties.
  Validate all the inputs properly and generate error message, if any input is not appropriate. 
  [See the Test cases for Input Validation]
  
 Method :
  
 1) Method Name 	: calculateSalary()
    Parameter   	: No Parameter
    Return Type 	: double
    Access modifier	: public
    In this overridden method return the salary of employee as based on number of hours, he has
    worked in the Organization.
        
    Create an ELC class EmployeeSalary with main method to test this application.
    
Test Cases for Output :
------------------------
Test Case 1 :
-------------
		***Salary Calculation Menu***		
		 1) FullTime Employees 
		 2) PartTime Employees  
Please select the Employee type
1
Enter Fulltime Employee Id :101
Enter Fulltime Employee Name :Scott
Enter the Salary :90000
Scott Salary is :90000.0

Test Case 2 :
-------------
		***Salary Calculation Menu***		
		 1) FullTime Employees 
		 2) PartTime Employees  
Please select the Employee type
2
Enter PartTime Employee Id :102
Enter PartTime Employee Name :Alen
Enter your hourly rate:1000
Enter your total works hour in the month :90
Alen Salary is :90000.0

Test Cases for Input Validation :
 ---------------------------------
Test Cases 1:
-------------
		***Salary Calculation Menu***		
		 1) FullTime Employees 
		 2) PartTime Employees  
Please select the Employee type
1
Enter Fulltime Employee Id :101
Enter Fulltime Employee Name :Scott
Enter the Salary :-9000
Salary can't be negative!!!

Test Cases 2:
-------------
 		***Salary Calculation Menu***		
		 1) FullTime Employees 
		 2) PartTime Employees  
Please select the Employee type
2
Enter PartTime Employee Id :102
Enter PartTime Employee Name :Alen
Enter your hourly rate:-12
Enter your total works hour in the month :90
Employee hourly rate can't be zero OR Negative

Test Cases 3:
-------------
		***Salary Calculation Menu***		
		 1) FullTime Employees 
		 2) PartTime Employees  
Please select the Employee type
2
Enter PartTime Employee Id :102
Enter PartTime Employee Name :Alen
Enter your hourly rate:1000
Enter your total works hour in the month :-10
Employee hours of work can't be Negative

=========================================================================================
MCQ :
-----
Q1)

class Vehicle
{
	public int fuelCapacity()
	{
		return 40;
	}	
	
	public void printTankCapacity()
	{
		System.out.println(this.fuelCapacity());
	}
}
class Car extends Vehicle
{
	@Override
	public int fuelCapacity()
	{
		return 18;
	}	
}

public class Test
{

	public static void main(String[] args)
	{
		Vehicle v1 = new Car();
		v1.printTankCapacity();

	}

}
--------------------------------------------------------------------
Q2) In this Program add code to print value 40.

class Vehicle
{
	public int fuelCapacity()
	{
		return 40;
	}	
	
	public void printTankCapacity()
	{
		System.out.println(this.fuelCapacity());
	}
}
class Car extends Vehicle
{
	@Override
	public int fuelCapacity()
	{
		return 18;
	}	
}

public class Test
{

	public static void main(String[] args)
	{
		Vehicle v1 = new Car();
		v1.printTankCapacity();

	}

}
---------------------------------------------------------------------
Q3)

class Bird
{
	public void fly()
	{
		System.out.println("Genric Bird is flying");
	}
	
	public void roam()
	{
		System.out.println("Generic Bird is roamig");
	}	
	
}
class Parrot extends Bird
{
	
	public int fly(double height)
	{
		System.out.println("Parrot is flying with :"+height+" height");
		return 0;
	}
	
	public void roam()
	{
		System.out.println("Parrot Bird is roamig");
		
	}
}
public class MethodOverridingDemo1 {

	public static void main(String[] args) 
	{
		Parrot p = new Parrot();
		p.fly(15.6);
		p.roam();
	}

}
----------------------------------------------------------------------
Q4)

class Base
	{
        int value=0;
        Base()
		{
        addValue();
        }
        void addValue(){
        value += 10;
        }
       int getValue(){
         return value;
       }
     }
    class Derived extends Base{
      Derived()
	  {
       addValue();
      }
     void addValue(){
		 super.addValue();
     value +=  30;
      }
    }
    public class Test5 {
      public static void main(String[] args){
          Derived b = new Derived();		  
          System.out.println(b.getValue());
      }
    }
-----------------------------------------------------------------------
Q5)
class Mammal 
 { 
 String name = "furry "; 
 String makeNoise() 
 { 
  return "generic noise"; 
 } 
} 
class Zebra extends Mammal 
{ 
 String name = "stripes "; 
 
 String makeNoise() 
 { 
  return "bray"; 
 } 
} 
public class ZooKeeper { 
 public static void main(String[] args)
 { 
  new ZooKeeper().go(); 
 } 
 void go()
 { 
  Mammal m = new Zebra(); 
  System.out.println(m.name + m.makeNoise()); 
 } 
}
-----------------------------------------------------------------------
Q6)
public class Test11
{
	public static void main(String [] args)
	{
		Animal a = new Animal();
		Animal b = new Horse();
		a.eat();
		b.eat();
		b.buck();
	}
}
class Animal
{
	public void eat()
	{
		System.out.println("Generic Animal eating");

	}
	
}
class Horse extends Animal
{
	public void eat()
	{
		System.out.println("Horse Eating");
	}
		public void buck()
	{
			System.out.println("Printing");
	}
}
-----------------------------------------------------------------------
Q7)

class A 
{
static void foo()
{
System.out.println("A");
}
}

class B extends A
{
static int foo()
{
System.out.println("B");
return 1;
}
}
-----------------------------------------------------------------------
Q8)

class A 
{
void foo() 
{
System.out.println("A");
}
}

class B extends A 
{
void foo() 
{
System.out.println("B");
}
}	

class Test15
{
public static void main(String[] args)
{
A obja;
B objb = new B();
objb.foo();
obja = objb;
obja.foo();
}
}
----------------------------------------------------------------------
Q9) Find the compilation errors

public class Test19 extends Singer
 {
  public static String sing() 
  {
    return "fa";
  }

  public static void main(String[] args) 
  {
    Test19 t = new Test19();
    Singer s = new Test19();
    System.out.println(t.sing() + " " + s.sing());
  }
}

class Singer 
{
  public static String sing() 
  {
    return "la";
  }
}

-----------------------------------------------------------------------
Q10)
class A 
{
private void printName(){
System.out.println("Value-A");
}
}
class B extends A
{
public void printName(){
System.out.println("Name-B");
}
}
public class Test23
{
public static void main (String[] args) 
{
A b = new B();
b.printName();
}
}
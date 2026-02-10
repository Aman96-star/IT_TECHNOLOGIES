--An interface defines a set of methods that a class must implement, ensuring a common behavior across different classes.
--“Interface is a contract that defines methods which a class must implement.”
--


**1) Write a java program to calculate the curved surface area of a cube?

     Formula = 6*side Square.

  
2) Write a java program to calculate the total surface area of a cylinder? 

   Formula = 2 pi square r * 2 pi r h (take the pi as 3.14 with final modifier).

  
3) Write a Java program to calculate compound interest for 3 years? 

   Formula = amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));

  
4) write Java Program Convert Fahrenheit To Celsius | Vice Versa

 Formula =
  Celsius=(Fahrenheit-32)*5/9;

 Fahrenheit=((9*Celsius)/5)+32;

 Note [ Write two seprate program for converting celsius into 

 Fahrenheit and Fahrenheit into celsius ]

  
5) What will be the output of the following program. 

public class Test 

 {

 public static void main (String args[])

 {

 int decimal_int=1234;

 int octal_int=077;

 int hexadec_int=0x1ff2;

 int binary_int=0b1010101;

 System.out.println("This is a Decimal Literal: "+decimal_int);

 System.out.println("This is an Octal Literal: "+octal_int);

 System.out.println("This is a Hexa Decimal Literal: "+hexadec_int);

 System.out.println("This is a Binary Literal: "+binary_int);

 }

 }

--------------------------------------------------------------

6) What will be the output of the following program

public class Test

{

 public static void main (String args[])

 {

 float val_float=1.7732f;

 double val_double=1.7732d;

 float val_exponent=123E4f;

 System.out.println("This is a Floating Point Literal"+val_float);

 System.out.println("This is a Decimal Literal"+val_double);

 System.out.println("This is an Exponential 

Literal"+val_exponent);

 }

} 

--------------------------------------------------------------

7) What will be the output of the following program

public class AutomaticTypeConversion

{

 public static void main (String args[])

 {

 int intVariable = 100;

 long longVariable = intVariable;

 float floatVariable = longVariable;

 System.out.println ("Integer Value is : " + intVariable);

 System.out.println ("Float Value is : " + floatVariable);

 System.out.println ("Long Value is : " + longVariable);

 }

}

--------------------------------------------------------------

8) What will be the output of the following program

public class ExplicitTypeCasting

{

 public static void main (String[]args)

 {

 double doubleVariable = 100.04;

 long longVariable = (long) doubleVariable;

 int intVariable = (int) longVariable;

 System.out.println ("Double Value is : " + doubleVariable);

 System.out.println ("Long Value is : " + longVariable);

 System.out.println ("Integer Value is : " + intVariable);

 }

}

--------------------------------------------------------------

9) What will be the output of the following program

public class Sample

{

 public static void main(String[] args) 

 {

 int a=10;

 float b=4.5f;

 double c=5.2;

 long d=(long)-8.98;

System.out.println(a);

System.out.println(b); 

System.out.println(c); 

System.out.println(d);

}

}

--------------------------------------------------------------

10) What will be the output of the following program

public class Sample 

{

public static void main(String[] args) 

{

int a=10;

float b=4.5f;

double c=5.2;

long d=378293L;

long e=(long)-8.98;

System.out.println(a);

System.out.println(b); 

System.out.println(c); 

System.out.println(d);

System.out.println(e);

}

}**

day-18[new keyword]
src
 └── com
      └── ravi
           ├── blc
           │     └── Employee.java
           └── elc
                 └── EmployeeDemo.java


package com.ravi.blc;

public class Employee {
    int employeeId;
    String employeeName;
    double employeeSalary;
    char employeeGrade; // Calculated internally

    // Method to set data
    public void setEmployeeData(int id, String name, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeSalary = salary;
    }

    // Method to calculate employee grade
    public void calculateGrade() {
        if (employeeSalary >= 75000) {
            employeeGrade = 'A';
        } else if (employeeSalary >= 50000) {
            employeeGrade = 'B';
        } else if (employeeSalary >= 40000) {
            employeeGrade = 'C';
        } else {
            employeeGrade = 'D';
        }
    }

    // Method to display employee data
    public void getEmployeeData() {
        System.out.println("Employee Id is: " + employeeId);
        System.out.println("Employee Name is: " + employeeName);
        System.out.println("Employee Salary is: " + employeeSalary);
        System.out.println("Employee Grade is: " + employeeGrade);
    }
}


package com.ravi.elc;

import com.ravi.blc.Employee;

public class EmployeeDemo {
    public static void main(String[] args) {

        // --- Employee 1: Scott ---
        Employee scott = new Employee();
        scott.setEmployeeData(101, "Scott", 90000);
        scott.calculateGrade();
        scott.getEmployeeData();

        System.out.println("........................");

        // --- Employee 2: Smith ---
        Employee smith = new Employee();
        smith.setEmployeeData(102, "Smith", 55000);
        smith.calculateGrade();
        smith.getEmployeeData();
    }
}

output:--------------------------------
Employee Id is: 101
Employee Name is: Scott
Employee Salary is: 90000.0
Employee Grade is: A
........................
Employee Id is: 102
Employee Name is: Smith
Employee Salary is: 55000.0
Employee Grade is: B

--------------------------------------------------------------
1.# Multilevel Inheritance
## 1. ZooManagement

**Difficulty:** Easy  
**Points:** 100  
**Suggested Time:** 130 minutes

---

## Problem Description

In a virtual zoo management system, you need to organize and categorize various types of animals to efficiently manage their characteristics and behaviors.

To achieve this, implement a **class hierarchy using multilevel inheritance** in Java.

You need to create the following classes:

---

## 1. `Animal` Class

### Requirements:

- Define a **private `String` attribute** named `name`.
    
- Implement a **parameterized constructor** to initialize `name`.
    
- Implement **getter and setter** methods for `name`.
    

---

## 2. `Mammal` Class

### Requirements:

- The `Mammal` class should **extend** the `Animal` class.
    
- Add a **private `boolean` attribute** named `hasFur`.
    
- Implement a **parameterized constructor** to initialize:
    
    - `name` (using the `Animal` class constructor)
        
    - `hasFur`
        
- Implement **getter and setter** methods for `hasFur`.
    

---

## 3. `Dog` Class

### Requirements:

- The `Dog` class should **extend** the `Mammal` class.
    
- Add a **private `String` attribute** named `breed`.
    
- Implement a **parameterized constructor** to initialize:
    
    - `name`
        
    - `hasFur`
        
    - `breed`
        
- Implement **getter and setter** methods for `breed`.
    
- Override the `toString()` method to display all the details in the following format:
    

`Dog [getName()=<name>, isHasFur()=<hasFur>, breed=<breed>]`

---

## 4. `Main` Class (ELC - End-User Logic Class)

In the `main` method:

1. Display a menu:
    

`Choose the type of object to create: 1. Animal 2. Mammal 3. Dog Enter your choice:`

2. Based on user choice:
    

### If choice = 1 (Animal):

- Prompt:
    
    `Enter Animal Name:`
    
- Create an `Animal` object.
    
- Print its details using `toString()` in this format:
    
    `Animal [getName()=<name>]`
    

### If choice = 2 (Mammal):

- Prompts:
    
    `Enter Mammal Name: Does the Mammal have fur? (true/false):`
    
- Create a `Mammal` object.
    
- Print its details using `toString()` in this format:
    
    `Mammal [getName()=<name>, isHasFur()=<hasFur>]`
    

### If choice = 3 (Dog):

- Prompts:
    
    `Enter Dog Name: Does the Dog have fur? (true/false): Enter Dog Breed:`
    
- Create a `Dog` object.
    
- Print its details using `toString()` in this format:
    
    `Dog [getName()=<name>, isHasFur()=<hasFur>, breed=<breed>]`
    

### For any other choice:

- Print:
    
    `Invalid choice.`
    

---

## Additional Test Case (Direct Object Creation)

If you directly create the object:

`Dog dog = new Dog("Tommy", true, "Bulldog"); System.out.println(dog);`

The expected output is:

`Dog [getName()=Tommy, isHasFur()=true, breed=Bulldog]`

---

## Input Format

- First line: An **integer choice** → `1`, `2`, or `3`
    
- Next lines: Input values depending on the choice:
    

### If input choice = 1:

- Next line: `name` (String)
    

### If input choice = 2:

- Next line: `name` (String)
    
- Next line: `hasFur` (`true` / `false`)
    

### If input choice = 3:

- Next line: `name` (String)
    
- Next line: `hasFur` (`true` / `false`)
    
- Next line: `breed` (String)
    

---

## Output Format

- Print a **single line** describing the created object using its `toString()` method in one of the following formats:
    

`Animal [getName()=<name>] Mammal [getName()=<name>, isHasFur()=<hasFur>] Dog [getName()=<name>, isHasFur()=<hasFur>, breed=<breed>]`

- Or, if the choice is invalid:
    

`Invalid choice.`

---

## Examples

### Example 1

**Input:**

`1 Lion`

**Output:**

`Animal [getName()=Lion]`

2.--------------------------------------------------------------------------------------------------

[MultilevelInheritance]
## **Problem Description**

You are required to implement a simple Java program demonstrating **multilevel inheritance**:

`Animal  →  Mammal  →  Dog`

Follow the instructions below to create the classes and behavior.

---

## **1. Class: Animal (BLC)**

### **Properties:**

- No properties
    

### **Constructor:**

- No constructor
    

### **Methods:**

- `public void eat()`
    
    - Prints:
        
        `Animal is eating`
        

---

## **2. Class: Mammal (BLC)**

Mammal must **extend Animal**.

### **Properties:**

- No properties
    

### **Constructor:**

- No constructor
    

### **Methods:**

- `public void walk()`
    
    - Prints:
        
        `Mammal is walking`
        

---

## **3. Class: Dog (BLC)**

Dog must **extend Mammal**.

### **Properties:**

- No properties
    

### **Constructor:**

- No constructor
    

### **Methods:**

- `public void bark()`
    
    - Prints:
        
        `Dog is barking`
        

---

## **4. Class: MultilevelInheritance (ELC)**

In the `main` method:

1. Display the menu:
    

`Choose an action: 1. Animal eats 2. Mammal walks 3. Dog barks Enter your choice (1-3):`

2. Take user input using `Scanner`.
    
3. Based on the choice:
    
    - **1 →** Create an `Animal` object and call `eat()`.
        
    - **2 →** Create a `Mammal` object and call `walk()`.
        
    - **3 →** Create a `Dog` object and call `bark()`.
        
4. For any other choice, nothing is printed (invalid case).
    

---

## **Test Cases**

---

### **Test Case 1**

**Input:**

`1`

**Output:**

`Animal is eating`

---

### **Test Case 2**

**Input:**

`2`

**Output:**

`Mammal is walking`

---

### **Test Case 3**

**Input:**

`3`

**Output:**

`Dog is barking`

---

### **Test Case 4**

**Input:**

`4`

_(No output — invalid choice)_

---

## **Example 1**

**Input:**

`1`

**Output:**

`Animal is eating`

3.--------------------------------------------------------------------------------------------------

## **Requirements**

### 🔹 **1. Create a BLC class `Employee`**

### **Attributes (protected):**

- `employeeId` – `int`
    
- `employeeName` – `String`
    
- `employeeSalary` – `double`
    

### **Constructor:**

- Create a **parameterized constructor** to initialize all fields.
    

---

### 🔹 **2. Create `PermanentEmployee` class extending `Employee`**

### **Attributes (protected):**

- `providentfund` – `double`
    

### **Constructor:**

- Create a **parameterized constructor** to initialize only the **superclass properties**  
    (Do NOT initialize providentfund through constructor)
    

### **Rules:**

- Initialize **providentfund = 12% of employeeSalary**
    
- Override **toString()** to print details of both superclass + subclass
    

### **Method:**

`Method Name : netSalary() Modifier    : public Arguments   : none Return type : void`

- This method must print **salary + providentfund**
    

---

### 🔹 **3. Create `ContractEmployee` class extending `Employee`**

### **Attributes (protected):**

- `contractDuration` – `int`
    

### **Constructor:**

- Create a **parameterized constructor** to initialize all fields (super + sub class)
    

### **Override toString()**

Print details of both superclass + subclass.

---

### 🔹 **4. Create an ELC class `EmployeeSystem` with main method**

- Create **one PermanentEmployee object**
    
- Create **one ContractEmployee object**
    
- Display all results using the toString() and netSalary() methods.
    

---

## ⭐ **Example Input**

`101 John 50000 102 Mike 30000 12`

## ⭐ **Expected Output**

`PermanentEmployee [employeeId=101, employeeName=John, employeeSalary=50000.0, providentfund=6000.0] Net Salary: 56000.0 ContractEmployee [employeeId=102, employeeName=Mike, employeeSalary=30000.0, contractDuration=12]`

4--------------------------------------------------------------------------------------------------
## **Problem Description**

You are given a base class **`Student`** with the following details:

### **Student Class**

#### **Instance Variables**

- `studentId : int`
    
- `name : String`
    
- `examFee : double`
    

#### **Methods**

- `displayDetails() : String`
    
- `payFee() : double`
    

You must define:

- A **parameterized constructor**
    
- A **toString() method**
    

---

## **Subclasses**

Create two subclasses:

---

### **1️⃣ DayScholar**

#### **Additional Instance Variable**

- `transportFee : double`
    

#### **Constructor**

- Parameterized constructor to initialize all values.
    

---

### **2️⃣ Hosteller**

#### **Additional Instance Variable**

- `hostelFee : double`
    

#### **Constructor**

- Parameterized constructor to initialize all values.
    

---

## **Common Methods to Implement in BOTH Subclasses**

### **1. `displayDetails()`**

Return details in this format:

`Student[name=John Smith,studentId=123,examFee=100.0] DayScholar[TransportFee=5000.0,name=Brian Lara,studentId=2,examFee=25000.0] Hosteller[HostelFee=8000.0,name=Virat,studentId=3,examFee=25000.0]`

---

### **2. `payFee(double amount)`**

- Calculate **total fee**  
    (examFee + transportFee OR hostelFee)
    
- Subtract _amount paid_
    
- Return the **remaining amount**
    

If returning amount is:

- `0` → All fees clear
    
- Positive → Remaining amount to pay
    
- Negative → Excess amount paid
    

---

## **Main Class**

A class **TesterDayScholarHosteller** is provided.  
Use it to test all your classes.

---

## **Example Output**

`Student[name=John Smith,studentId=1,examFee=25000.0] DayScholar[TransportFee=5000.0,name=Brian Lara,studentId=2,examFee=25000.0] Remaining amount to pay is: 12000.0 Hosteller[HostelFee=8000.0,name=Virat Kohli,studentId=3,examFee=25000.0] All Fees are clear`

---

# ✅ **Test Cases**

---

### **Test Case 1**

**Input**

`1 23 James 8000 2500 10500`

**Expected Output**

`DayScholar[TransportFee=2500.0,name=James,studentId=23,examFee=8000.0] All Fees are clear`

---

### **Test Case 2**

**Input**

`1 45 Kim 5000 2000 6000`

**Expected Output**

`DayScholar[TransportFee=2000.0,name=Kim,studentId=45,examFee=5000.0] Remaining amount to pay is: 1000.0`

---

### **Test Case 3**

**Input**

`2 45 uma 5000 4500 8000`

**Expected Output**

`Hosteller[HostelFee=4500.0,name=uma,studentId=45,examFee=5000.0] Remaining amount to pay is: 1500.0`

---

### **Example**

**Input**

`1 22 James 5000 2500 7500`

**Output**

`DayScholar[TransportFee=2500.0,name=James,studentId=22,examFee=5000.0] All Fees are clear`

5--------------------------------------------------------------------------------------------------
well-structured version of your module details and introductory notes, so it looks like proper training documentation:


---

Module: JSE (Java Standard Edition)

Duration & Sessions

Total Sessions: 101 (Approx. 4 Months)

Core Coverage: 80% Core Java → Advanced Java

Sunday Classes: Online (9–10 sessions) → Helping Topics / Common Topics

Java Version: Up to Java 17


Lab & Assignments

Lab Work: Mandatory → Without lab, permission not granted for Core Java classes

Assignments Provided:

MCQs

Sample Coding

Scenario-based Questions


Task Validity: 1 day (till 11 AM next day)


After Course Outcome

Knowledge equivalent to 3+ years developer experience

Notes will be shared via Google Classroom



---

Conceptual Understanding

What is a Language?

A language is a medium of communication through which humans can express and understand ideas.

What is a Programming Language?

A programming language is a medium through which a user communicates with a computer system.
It allows us to submit instructions to get the desired output.

Characteristics of a Programming Language

1. Syntax → The rules defined by that language


2. Semantics → The meaning / structure conveyed by the code



Example (English):

Syntax Rule: Subject + Verb + Object

✅ He is a boy. (Valid)

❌ He is a box. (Invalid in meaning)


Security in Java Programming

Java provides two levels of verification:

1. Compiler Level

Checks syntax (rules).

Reports syntax errors but does not care about execution meaning.



2. Execution Level (Runtime Environment)

Checks semantics (meaning).

If code is meaningless, throws Runtime Error.




👉 Final Conclusion:

Compiler → verifies Syntax

Runtime Environment (JVM) → verifies Semantics



---

What is Java?

Java is a high-level, platform-independent, secure, robust, multithreaded, object-oriented programming language.

Developed By: Sun Microsystems (1995)

First Release: JDK 1.0 on 23rd January 1996

Acquired By: Oracle Corporation (2010)



---

Applications of Java

By using Java, we can build:
a) Stand-alone Applications (Desktop / Software)
b) Web Applications (Websites)
c) Enterprise Applications
d) Gaming Applications (using Multithreading)
e) Mobile Applications
f) Distributed Applications


Day_2

 Pass Parameters to a Function?

We pass parameters (arguments) to functions in order to provide complete information required by the function to perform its task.

👉 If we don’t pass parameters, the function may not have enough data to work with (incomplete / partial information).

Examples in Java:

public void doSum(int x, int y)   // x and y are parameters
public void deposit(double amount) // amount is parameter
public void sleep(int hours)       // hours is parameter

Here, each function requires external data to work properly.


---

Why Functions are Called Methods in Java?

In C and C++, functions can be written:

Inside a class

Outside a class (using scope resolution operator ::)


Example in C++:

class Test {
   void m1();   // Function declaration inside class
};

void Test::m1() {
   // Function definition outside class using ::
}

👉 But in Java, every function must be written inside a class.
That’s why functions are called Methods in Java.

Example in Java:

class Test {
    public void m1() {
        System.out.println("This is a method in Java");
    }
}

So, in Java there is no concept of global functions outside classes.


---

What is Platform Independence in Java?

C / C++ Case (Platform Dependent)

A program compiled on one machine may not run on another machine with different configuration.
Example:

Demo.c → Compiled → Demo.exe (Windows 32-bit)

This .exe may not run on Windows 64-bit or Linux.


This happens because .exe files are machine code generated for a specific OS and hardware.


---

Java Case (Platform Independent)

1. Write Program: Test.java (Source Code)


2. Compile Program (javac): Generates Test.class (Bytecode)

Compiler checks syntax

Ensures compatibility (LHS = RHS type checks)

Converts source code → Bytecode



3. Execute with JVM:

Test.class is submitted to Java Virtual Machine (JVM)

JVM interprets bytecode line by line into machine instructions

Each OS has its own JVM implementation:

Windows JVM

Linux JVM

Mac JVM





👉 Conclusion:

Java Language = Platform Independent (because bytecode can run anywhere).

JVM = Platform Dependent (each OS has its own JVM implementation).



---

Flow of Execution in Java

Java Source Code (.java)
          |
          v
Java Compiler (javac)
          |
          v
Bytecode (.class file)
          |
          v
JVM (Platform-specific)
          |
          v
Machine Code → Output


---

⚡ Key Points to Remember:

C/C++ → Compiled into machine code → Platform Dependent

Java → Compiled into Bytecode → Runs on JVM → Platform Independent

JVM is written in C language, and it contains an interpreter for executing bytecode.


Day_3

Bit Code vs Byte Code

Aspect	Bit Code (C / C++)	Byte Code (Java)

Meaning	Native machine code (0s & 1s) generated directly by the compiler.	Intermediate code generated by the Java compiler (javac).
Execution	Runs directly on the Operating System (no intermediate layer).	Runs on the JVM (Java Virtual Machine), which then converts it into native machine code.
Portability	Not portable – compiled separately for each OS.	Portable – same bytecode runs on any OS with JVM.
Example	C / C++ compiled .exe (Windows) or binary (Linux).	Java .class file.


👉 So,

C / C++ → Compiler → Machine Code (Bit Code) → OS executes directly.

Java → Compiler (javac) → Bytecode (.class) → JVM → Machine Code → OS executes.



---

🔹 JDK vs JRE vs JVM vs Compiler

1. JDK (Java Development Kit)

Developer version (for writing + compiling + running Java programs).

Includes:

Compiler (javac) → Converts source code → bytecode

Java launcher (java) → Runs bytecode

Debugger, Profiler, Documentation tools, etc.


Contains JRE inside it.



---

2. JRE (Java Runtime Environment)

Client version (only for running Java programs, not for development).

Includes:

JVM

Class libraries (e.g., java.lang, java.util)


Does not include compiler (javac).

From Java 11 onwards, JRE folder is removed (JDK is enough).



---

3. JVM (Java Virtual Machine)

Software engine that executes Java bytecode.

Platform-dependent (Windows JVM, Linux JVM, etc.) but bytecode is platform-independent.

Responsibilities:

Class loading

Bytecode verification

Memory allocation

Garbage collection

Security




---

4. Compiler (javac) vs Interpreter (inside JVM)

Feature	Compiler (javac)	Interpreter (JVM)

Input	Java Source Code (.java)	Bytecode (.class)
Output	Bytecode (.class)	Machine Code
Execution Style	Translates entire program once.	Executes line-by-line (bytecode → native).
Speed	Compilation is slower, but execution is faster.	Execution is slower (line-by-line).
Errors	Shows all errors at once (compile-time).	Shows one error at runtime.
Portability	Depends on JVM later.	Directly OS dependent (through JVM).


🔹 Note: Java uses both:

Compiler (javac) → source → bytecode

Interpreter (JVM) → bytecode → machine code


Modern JVMs also use JIT (Just-In-Time) Compiler for faster execution (it converts frequently used bytecode into native machine code at runtime).


---

✅ Quick Example:

// Source Code
public class Demo {
   public static void main(String[] args) {
      System.out.println("Hello, Welcome to Java!");
   }
}

Execution steps:

1. javac Demo.java → Demo.class (Bytecode)


2. java Demo → JVM interprets bytecode → Native machine code → Output.



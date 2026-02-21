# 🔷 Storage in Java

## ✅ What is Storage?

A **storage** is a place where we can store data and reuse the data even after closing the application.

---

# 🔷 Types of Storage (4 Types)

## 1️⃣ Field Storage

- Field storage refers to storing data directly in **class fields (variables)**.
    
- Data is stored inside object variables.
    
- It is useful for keeping **simple and temporary data**.
    
- Data exists only while the object exists.
    

### Example:

class Student {  
    String name;  // field storage  
}

✔ Temporary  
❌ Not persistent after program ends

---

## 2️⃣ Object Storage

- Object storage involves **serializing objects** to store them permanently.
    
- Achieved using **Serialization**.
    
- Used to store entire object into a file.
    

### Example:

ObjectOutputStream oos = new ObjectOutputStream(  
        new FileOutputStream("data.ser"));  
oos.writeObject(obj);

✔ Stores complete object  
✔ Used for backup  
✔ Persistent storage

---

## 3️⃣ File Storage

- Refers to reading and writing data into files using **IO Streams**.
    
- Used to store:
    
    - Text files
        
    - Logs
        
    - Binary data
        
- Suitable for **small to medium-sized data**.
    

### Example:

FileWriter fw = new FileWriter("data.txt");  
fw.write("Hello Java");  
fw.close();

✔ Simple  
✔ Easy to manage  
❌ Not suitable for complex queries

---

## 4️⃣ Database Storage

- Uses **JDBC (Java Database Connectivity)**.
    
- Interacts with relational databases like:
    
    - MySQL
        
    - Oracle
        
- Used to store:
    
    - Large structured data
        
    - Complex queries
        
    - Transactions
        
    - Relationships
        

✔ Large data  
✔ Secure  
✔ Supports transactions

---

# 🔷 Understanding Persistence Terminologies

1️⃣ **Persistence**  
→ Storing data for long-lasting use.

2️⃣ **Persistence Store**  
→ Place where data is stored (File/DB).

3️⃣ **Persistence Data**  
→ Which data should be stored permanently.

4️⃣ **Persistence Operations**  
→ CRUD Operations

- Create
    
- Read
    
- Update
    
- Delete
    

5️⃣ **Persistence Logic**  
→ Performing logic on data using JDBC for desired output.

---

# 🔷 Memory Types (4 Types)

1. Stack Memory
    
2. Heap Memory
    
3. Method Area
    
4. PC Register
    

---

# 🔷 JDBC – First Program Connection Flow

## Why These Imports?

import java.sql.Connection;  
import java.sql.DriverManager;

### Connection

→ Represents connection object between Java and Database.

### DriverManager

→ Used to establish connection using:

- Database URL
    
- Username
    
- Password
    

These classes belong to **java.sql package (JDBC API)**.

---

# 🔷 JDBC Program Flow

main()  
   ↓  
jdbcPro1 object created  
   ↓  
connect() called  
   ↓  
Driver loaded  
   ↓  
Database connected  
   ↓  
Connection closed

---

# 🔷 JDBC Architecture

1️⃣ **JDBC API**  
→ Provides interfaces and classes for database interaction.

2️⃣ **DriverManager Class**  
→ Manages database drivers and establishes connection.

3️⃣ **JDBC Drivers**  
→ Translate JDBC calls into database-specific calls.

4️⃣ **Connection Interface**  
→ Represents a connection to database.

5️⃣ **Statements (3 Types)**

- Statement
    
- PreparedStatement
    
- CallableStatement
    

6️⃣ **ResultSet Interface**  
→ Represents result of query and retrieves data.

7️⃣ **SQLException Class**  
→ Handles database access errors.

---

# 🔷 JDBC Drivers (4 Types)

## 1️⃣ Type 1 – JDBC-ODBC Bridge Driver

JDBC Code  
   ↓  
JDBC–ODBC Bridge  
   ↓  
ODBC Driver  
   ↓  
Database

❌ Not used now (removed after Java 8)

---

## 2️⃣ Type 2 – Native API Driver

JDBC Code  
   ↓  
Native API Driver  
   ↓  
Native Database API  
   ↓  
Database

❌ Platform dependent

---

## 3️⃣ Type 3 – Network Protocol Driver

JDBC Code  
   ↓  
Network Protocol Driver  
   ↓  
Middleware (Application Server)  
   ↓  
Database

✔ Uses middleware  
✔ Suitable for enterprise apps

---

## 4️⃣ Type 4 – Thin Driver (Pure Java)

JDBC Code  
   ↓  
Thin Driver  
   ↓  
Database

✔ Platform independent  
✔ High performance  
✔ Most commonly used

Example:

Class.forName("oracle.jdbc.OracleDriver");

---

# 🔷 Steps to Connect Database

1. Load Driver
    
2. Create Connection
    
3. Create Statement
    
4. Execute Query
    
5. Process ResultSet
    
6. Close Connection
    

---

# 🔷 Establishing Database Connection

## Step 1: Load Driver

Class.forName("oracle.jdbc.OracleDriver");

## Step 2: Create Connection

Connection con = DriverManager.getConnection(url, user, pass);

## Step 3: Prepare Statement

Statement stmt = con.createStatement();

## Step 4: Execute Query

ResultSet rs = stmt.executeQuery("SELECT * FROM emp");

## Step 5: Close Connection

con.close();

---

# 🔷 Statement Types

1️⃣ Statement  
→ Simple SQL queries

2️⃣ PreparedStatement  
→ Precompiled SQL  
→ Prevents SQL Injection

3️⃣ CallableStatement  
→ Used for Stored Procedures

---

# 🔷 Connection Interface Methods

`java.sql.Connection` interface methods:

- createStatement()
    
- prepareStatement()
    
- prepareCall()
    
- setAutoCommit()
    
- setSavepoint()
    
- releaseSavepoint()
    
- commit()
    
- rollback()
    
- close()
    

---

# 🔷 java.sql Package

- Provides JDBC API
    
- Used for accessing and processing database data
    
- Contains:
    
    - Connection
        
    - Statement
        
    - ResultSet
        
    - SQLException
        
    - DriverManager
        

---

# 🔷 Example (Anonymous Inner Class Code Corrected)

package com.pack1;  
  
interface InterfaceA {  
    void msg1();  
    void msg2();  
}  
  
public class ClassA {  
  
    static InterfaceA display(String s1, String s2, String s3) {  
  
        System.out.println("display() called");  
  
        return new InterfaceA() {  
  
            @Override  
            public void msg1() {  
                System.out.println("Java is awesome");  
            }  
  
            @Override  
            public void msg2() {  
                System.out.println("Java Programming");  
            }  
        };  
    }  
}

---

# ✅ Final Summary

You covered:

✔ Storage Types  
✔ Persistence Concepts  
✔ Memory Types  
✔ JDBC Architecture  
✔ JDBC Drivers (4 Types)  
✔ Connection Steps  
✔ Statement Types  
✔ Connection Interface Methods
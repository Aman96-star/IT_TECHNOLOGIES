# 🔷 JDBC – getConnection() Method

- We use **getConnection()** method from `java.sql.DriverManager` class to get implementation object for **Connection Interface**.
    

---

## ✅ METHOD SIGNATURE:

public static Connection getConnection(String url, String user, String password)   
        throws SQLException

---

## ✅ Method Syntax:

Connection con = DriverManager.getConnection("DBurl","Uname","Upwd");

---

### 🔹 DBurl :

→ Database URL (Location of database)

### 🔹 Uname :

→ Username of database

### 🔹 Upwd :

→ Password of database

---

# 🔷 JDBC Statement

- By using JDBC **Statement**, we can execute SQL queries and commands to interact with database.
    
- There are 3 types of Statements:
    

1. Statement
    
2. PreparedStatement
    
3. CallableStatement
    

---

# 🔷 Understanding Statement

- Statement is a part of JDBC API.
    
- It is used to execute **simple SQL queries**.
    
- They do not need to be executed repeatedly.
    
- A Statement object is created using `createStatement()` method.
    
- `createStatement()` is a **non-static method**, so we access it using Connection object.
    

---

## ✅ Creating Statement

Connection con = DriverManager.getConnection("DBurl","Uname","Upwd");  
  
Statement stm = con.createStatement();

---

# 🔷 Methods Present in Statement Interface

There are 3 main methods:

---

## 1️⃣ executeQuery(String sql)

- Used to execute **Selection group SQL queries** (SELECT).
    
- Returns data in the form of **ResultSet object**.
    
- Return type → `ResultSet`
    

### Example:

ResultSet rs = stm.executeQuery("SELECT * FROM emp");

---

## 2️⃣ executeUpdate(String sql)

- Used to execute **Non-Selection group SQL queries**  
    (INSERT, UPDATE, DELETE)
    
- Returns an **int value**
    
- Represents number of rows affected.
    
- Return type → `int`
    

### Example:

int rowCount = stm.executeUpdate("INSERT INTO emp VALUES(101,'Ravi')");

---

## 3️⃣ execute(String sql)

- Used to execute SQL queries that may return different types of result.
    
- Used for **dynamic SQL execution**.
    
- Return type → `boolean`
    
- Returns:
    
    - true → if ResultSet is returned
        
    - false → if update count is returned
        

### Example:

boolean flag = stm.execute("Dynamic SQL query");

---

# 🔷 ResultSet Interface (From Your Page 2 & 3)

## Understanding ResultSet Interface

- ResultSet is an interface provided by **java.sql package**.
    
- It represents the result obtained by executing SELECT query.
    
- By using ResultSet object we can:
    
    - Retrieve data from database
        
    - Navigate rows
        
    - Manipulate data
        

---

## 🔹 Instantiation Using Statement

ResultSet rs = stm.executeQuery("SELECT * FROM employee");

---

## 🔹 Instantiation Using PreparedStatement

ResultSet rs = ps.executeQuery();

---

# 🔷 Types of ResultSet

Based on control and navigation:

1️⃣ Non-Scrollable ResultSet  
2️⃣ Scrollable ResultSet

---

## 1️⃣ Non-Scrollable ResultSet

- Moves only in forward direction.
    
- Cannot jump to specific row.
    
- Cannot move backward.
    
- Used when reading data sequentially.
    

Example Constant:

ResultSet.TYPE_FORWARD_ONLY

---

## 2️⃣ Scrollable ResultSet

- Can move in forward and backward direction.
    
- Can jump to specific row.
    

Constants:

ResultSet.TYPE_SCROLL_INSENSITIVE  
ResultSet.TYPE_SCROLL_SENSITIVE

---

# 🔷 Mode (Concurrency) Parameters

- Specify action to be performed on ResultSet.
    

ResultSet.CONCUR_READ_ONLY  
ResultSet.CONCUR_UPDATABLE

---

# 🔷 Important ResultSet Methods

## afterLast()

Moves cursor after the last row.

## beforeFirst()

Moves cursor before the first row.

## first()

Moves to first row.

## last()

Moves to last row.

## next()

Moves to next row.

## previous()

Moves to previous row.

## absolute(int row)

Moves to specific row number.

## relative(int row)

Moves relative to current position.

---

# ✅ Final Summary

✔ getConnection() is used to establish database connection  
✔ Statement is used for simple SQL execution  
✔ 3 Important methods:

- executeQuery()
    
- executeUpdate()
    
- execute()  
    ✔ ResultSet is used to retrieve and navigate data  
    ✔ Two types of ResultSet:
    
- Non-Scrollable
    
- Scrollable  
    ✔ Concurrency Modes:
    
- Read Only
    
- Updatable
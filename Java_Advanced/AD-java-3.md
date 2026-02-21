# 🔷 ResultSet Navigation Methods

## 1️⃣ first()

- Moves the cursor to the **first row** in the ResultSet.
    
- Useful for accessing the first record directly.
    

---

## 2️⃣ previous()

- Moves the cursor to the **previous row**.
    
- Used for iterating backward through rows.
    

---

## 3️⃣ next()

- Moves the cursor to the **next row** in the ResultSet.
    
- Commonly used to iterate forward.
    

while(rs.next()){  
    // process data  
}

---

## 4️⃣ absolute(int row)

- Moves the cursor to a **specific row number**.
    
- Positive number → count from beginning.
    
- Negative number → count from end.
    
- Jumps directly to specific row by position.
    

---

## 5️⃣ relative(int rows)

- Moves the cursor by a **relative number of rows**.
    
- Positive → forward.
    
- Negative → backward.
    
- Useful for moving specific number of rows from current position.
    

---

# 🔷 Understanding RowSet

- RowSet interface is a **child interface of ResultSet**.
    
- It is an enhanced version of ResultSet.
    
- Works in both:
    
    - Connected mode
        
    - Disconnected mode
        

---

## 🔹 Types of RowSet (5 Types)

1. JdbcRowSet
    
2. CachedRowSet
    
3. WebRowSet
    
4. FilteredRowSet
    
5. JoinRowSet
    

---

# 🔷 Understanding RowSetFactory Interface

- RowSetFactory is an interface that provides a way to create different types of RowSet objects.
    
- To obtain RowSetFactory object, we use RowSetProvider class.
    

### Example:

RowSetFactory rsf = RowSetProvider.newFactory();  
  
rsf.createJdbcRowSet();  
rsf.createCachedRowSet();  
rsf.createWebRowSet();  
rsf.createFilteredRowSet();  
rsf.createJoinRowSet();

---

# 🔷 CallableStatement Interface

- CallableStatement is a part of JDBC API.
    
- Used for executing:
    
    - Stored Procedures
        
    - Functions
        
- Created using `prepareCall()` method of Connection interface.
    
- Since prepareCall() is non-static, we access it using connection reference.
    

---

## 🔹 Example:

Connection con = DriverManager.getConnection("DBurl","Uname","Upwd");  
  
CallableStatement cstmt = con.prepareCall("{call procedure_name(?)}");

---

# 🔷 Procedure vs Function

|Feature|Procedure|Function|
|---|---|---|
|Return Value|Does not return value|Returns a value|
|Structure|CREATE OR REPLACE PROCEDURE|CREATE OR REPLACE FUNCTION|
|Parameters|IN, OUT, INOUT|Only IN|
|Purpose|Perform task|Compute and return value|

---

# 🔷 registerOutParameter()

- Used to register output parameters for CallableStatement.
    
- Allows JDBC driver to know expected data type of OUT parameter.
    

### Syntax:

void registerOutParameter(int parameterIndex, int sqlType)  
        throws SQLException

### Example:

cstmt.registerOutParameter(1, Types.INTEGER);

- After execution, retrieve value using:
    
    - getString()
        
    - getInt()
        
    - etc.
        

---

# 🔷 Transaction Management

The process of combining related operations into a single unit and executing them using "all or nothing" principle is called **Transaction Management**.

---

## 🔹 Steps in Transaction Management

1. Begin Transaction
    
    con.setAutoCommit(false);
    
2. Execute Logic
    
3. Commit or Rollback
    
    con.commit();  
    con.rollback();
    

---

# 🔷 ACID Properties

## 1️⃣ Atomicity

- All operations in a transaction must complete successfully.
    
- If any operation fails, entire transaction is rolled back.
    

---

## 2️⃣ Consistency

- Database remains in a consistent state before and after transaction.
    

---

## 3️⃣ Isolation

- Changes made in one transaction are not visible to other transactions until committed.
    

---

## 4️⃣ Durability

- Once transaction is committed, changes are permanent.
    
- Data will not be lost even after system failure.
    

---

# 🔷 Important Transaction Methods

## getAutoCommit()

- Returns current state of auto-commit mode.
    
- If true → SQL statements committed automatically.
    

---

## setAutoCommit(boolean autoCommit)

- Enables or disables auto-commit mode.
    
- If set to false → manual commit required.
    

---

## setSavepoint()

- Creates a savepoint in current transaction.
    
- Allows partial rollback to that point.
    

---

## releaseSavepoint(Savepoint sp)

- Deletes the specified savepoint.
    

---

## commit()

- Saves all changes made in current transaction permanently in database.
    

---

## rollback()

- Undoes all changes made after last commit.
    
- Restores previous state.
    

---

# ✅ Final Covered Topics

✔ ResultSet Navigation Methods  
✔ RowSet Interface  
✔ RowSetFactory  
✔ CallableStatement  
✔ Stored Procedure vs Function  
✔ registerOutParameter()  
✔ Transaction Management  
✔ ACID Properties  
✔ Transaction Control Methods
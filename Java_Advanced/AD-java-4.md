# 🔷 Step-by-Step Implementation for Transaction Management

### Step 1:

Create database table in Oracle.

### Step 2:

Create a Java project and setup JDBC.

### Step 3:

Define the JDBC connection properties.

### Step 4:

Create a database connection and disable auto-commit.

con.setAutoCommit(false);

### Step 5:

Lock a seat in transaction availability table → SQL query.

### Step 6:

Create a savepoint and commit the transaction.

### Step 7:

Insert a new booking record → SQL query.

### Step 8:

Check payment status of the customer → SQL query.

### Step 9:

Update booking status and commit / rollback the transaction → SQL query.

### Step 10:

Handle exceptions and close the connection.

---

# 🔷 Connection Pooling

- Connection Pooling is used in JDBC to improve application performance.
    
- It efficiently manages database connections.
    

Instead of:

- Creating a new connection for every database interaction,
    

Connection pool:

- Maintains a collection of pre-established connections.
    
- Connections are ready to use.
    

✔ Reduces overhead of connection creation and termination.  
✔ Leads to significant performance improvement.

---

# 🔷 How Connection Pooling Works?

(Connection Pooling Lifecycle)

1. Initialization
    
2. Acquisition
    
3. Usage
    
4. Return
    
5. Invalidation
    

---

# 🔷 Metadata

- Data about data is called **Metadata**.
    
- In JDBC, we use metadata to gather more information about:
    
    - Underlying database
        
    - Tables
        
    - Columns
        

JDBC supports 4 types of Metadata:

1. DatabaseMetaData
    
2. ParameterMetaData
    
3. ResultSetMetaData
    
4. RowSetMetaData
    

---

# 🔷 DatabaseMetaData

Provides metadata about:

- Entire database
    
- Tables
    
- Other database objects
    

### Important Methods:

getDatabaseProductName()

→ Returns the name of database product.

getDatabaseProductVersion()

→ Returns version of database product.

getDriverName()

→ Returns name of JDBC driver used.

supportsStoredProcedures()

→ Checks if database supports stored procedures.

---

# 🔷 ParameterMetaData

Provides information about parameters used in PreparedStatement.

### Methods:

getParameterCount()

→ Returns number of parameters.

getParameterType(int param)

→ Returns SQL data type of specified parameter.

getParameterMode(int param)

→ Returns mode of parameter (IN, OUT, INOUT).

isNullable(int param)

→ Checks whether parameter accepts NULL value.

---

# 🔷 ResultSetMetaData

Provides details about columns of ResultSet.

### Methods:

getColumnCount()

→ Returns number of columns in ResultSet.

getColumnName(int column)

→ Returns name of specified column.

getColumnDisplaySize(int column)

→ Returns maximum width of column.

isAutoIncrement(int column)

→ Checks whether column is auto-incremented.

---

# 🔷 RowSetMetaData

Provides details about columns of RowSet.

### Methods:

getColumnCount()

→ Returns number of columns in RowSet.

getColumnName(int column)

→ Returns name of specified column.

getColumnType(int column)

→ Returns SQL data type of specified column.

---

# 🔷 Understanding Servlet

- A Servlet is a platform-independent Java program.
    
- Runs inside a server environment.
    
- Interacts with users via a web browser.
    
- Processes client requests and generates dynamic responses.
    

---

# 🔷 Servlet Lifecycle (Handled by Servlet Container)

1. init()
    
2. service()
    
3. destroy()
    

---

# 🔷 Servlet Request-Response Workflow

Client Request  
↓  
Servlet Processing  
↓  
Response Generation

1. User sends request via web browser (HTTP request).
    
2. Servlet processes request (for example, querying a database).
    
3. Servlet generates HTTP response and sends back to user.
    

---

# 🔷 Web Application

- A software application that runs in a web environment.
    
- Accessed through a web browser.
    
- Deployed on web container or servlet container.
    
- Responsible for handling requests and generating responses.
    

---

# 🔷 Server

- A server is third-party software designed by vendors according to specifications.
    
- Accepts request from client and provides appropriate response.
    

Servers are classified into 2 types:

---

## 1️⃣ Web Server

- Designed specifically to host and execute web applications.
    
- Handles HTTP requests.
    
- Has only web container.
    
- Accepts requests via HTTP protocol.
    

Example:

- Apache Tomcat
    

---

## 2️⃣ Application Server

- More comprehensive than web server.
    
- Can handle:
    
    - Web applications
        
    - Enterprise applications
        

Application server has 2 containers:

1. Web container
    
2. Enterprise Bean container (EJB)
    

Examples:

- WebSphere
    
- JBoss
    
- IIS
    
- WebLogic
    

---

# ✅ Topics Covered

✔ Transaction Management Implementation  
✔ Connection Pooling  
✔ Metadata (4 Types)  
✔ DatabaseMetaData  
✔ ParameterMetaData  
✔ ResultSetMetaData  
✔ RowSetMetaData  
✔ Servlet  
✔ Web Application  
✔ Web Server vs Application Server
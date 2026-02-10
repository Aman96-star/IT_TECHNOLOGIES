java subsiquently releases such as:
1. JDK 1.2 introduced vector, stack ,hastable .
2. JDK 5.0 introduced Genrics
3. java 8 added Stream Api integration

DSA-> IT IS  way to store, organize and manage the data and it uses to reduced the time complexity 

* collection framework is the java-implementation of data structure
* two types of object in collection interface
*1 . individual  object[no key is involved  + obj are stored one by one  ]
	they are handeled by collection interface:  list ,Set Queue
	 classes : ==ArrayList, LinkedList, Hashset==, Prireority queue
		ex- Collection<String> n =new ArrayList<>(); // this is a single obj

	In this dublicate keys are Not/Available[n/a] And Dublicate values are allowed 
2. group of objects [in a key-value pair + each key  is unique] 
	they are handeled by Map interface  
	classes : hashMap, Hashtable , linkedHasMap, TreeMap
		ex- Map<Integer,String> stu =new Hashmap<>();

	In this dublicate keys are not allowed   and Dublicate values are allowed  

	-- to store the multiple object in one refernce variable in jdk 1.0 introduce the vector class
	--collections like `Vector` could store ''only single objects'' and there was ''no Map interface''.  So, related data '' (like username and password) had to be stored in ''separate collections''. //No Direct Relationship Between Data //relationship is assumed only by ''index position''
	--JDK 1.2 Map Interface  is introduced  --> no index dependency, direct relationship, better security
	-- it act as early version of todays map
	--it is implemented by concrete class only like hashtable
	
	----Hashtable--
	--it is a concrete class+ implements dictionary + use hashing algorithm +stores data in key-value pair
	--Key → Hash Function → Bucket → Value
    --[features] thread-safe(Sycroniyzed) + it does not allow null key or null value + legacy classes-(Legacy classes are the classes introduced before JDK 1.2
and still usable in Java (not deprecated).
ex- for single -stack,vector   and key-value pair storage-dictionary,hashtable,properties) 

--NOTE:--
synchronization meant only one thread can access and obj and method at a time 
legacy class- classes inteoduced before 1.2 and still used
--leagacy component -single object storage -vectore,Stack  & grp of object -dictionary,hastable,properties

	--due to the thread-safe it is a  slower in performance bcz only single thread is work at a time to do the work and it contains lock release feature which take time
-- collection framework is introduced in jdk 1.2
--architecture layers-[1.interfaces 2.abstract classes 3.concrete classes]
--collection hierachy -[itertable] ->[collection 1.list 2.set 3.queue]
--story of iterable interface -intro in jdk 1.5 ,used to iterate collections, supports  iterator and for-each loop 

                ┌──────────────────────────┐
                │        JDK 1.2            │
                │  Collections Framework   │
                └─────────────┬────────────┘
                              │
                    ┌─────────▼─────────┐
                    │    Iterable        │   (JDK 1.5, java.lang)
                    │  (Iteration base)  │
                    └─────────┬─────────┘
                              │
                 ┌────────────▼────────────┐
                 │      Collection<E>       │   (JDK 1.2, java.util)
                 │   Root Interface         │
                 │ add(), remove(), size()  │
                 └────────────┬────────────┘
                              │
          ┌───────────────────┼───────────────────┐
          │                   │                   │
 ┌────────▼────────┐  ┌───────▼────────┐  ┌───────▼────────┐
 │     List<E>      │  │      Set<E>     │  │    Queue<E>    │
 │ (Duplicates ✔)   │  │ (No Duplicates) │  │    (FIFO)     │
 │ Index-based ✔    │  │ No Index ❌     │  │ (JDK 1.5)     │
 │ Order ✔          │  │ Hashing used    │  │               │
 └────────┬────────┘  └────────┬────────┘  └────────┬────────┘
          │                   │                   │
   ┌──────▼──────┐     ┌───────▼───────┐     ┌───────▼───────┐
   │ ArrayList   │     │ HashSet       │     │ PriorityQueue │
   │ LinkedList  │     │ LinkedHashSet │     └───────────────┘
   │ Vector*     │     │ TreeSet       │
   └─────────────┘     └───────────────┘
        (*legacy)

------------------------------------------------------------

        ┌─────────────────────────────┐
        │      Collections Class      │
        │ (Utility Class, java.util)  │
        │ Static methods only         │
        │ Private Constructor         │
        └─────────────────────────────┘

------------------------------------------------------------

               ┌────────────────────┐
               │    Iterator<E>     │  (JDK 1.2)
               │ Forward only →     │
               │ hasNext(), next()  │
               └─────────┬──────────┘
                         │
               ┌─────────▼──────────┐
               │  ListIterator<E>   │
               │ Forward & Backward │
               │ Index-based        │
               └────────────────────┘

------------------------------------------------------------

⭐ INTERVIEW QUICK FLOW

Collection  → Single Objects
Map         → Key–Value pairs
List        → Duplicates + Index
Set         → No Duplicates
Queue       → FIFO
Iterator    → Forward only
ListIterator→ Forward & Backward
Vector/Hashtable → Legacy

Story-
 https://dev.to/aman04/the-story-of-java-collections-1m1c

package org.example.corejava.collection;

import java.util.*;

public class CollectionInJava {
    /*
   1. What is a Collection in Java?
       1.It is an interface.
       2.It stores serveral an object as single entily.
       3.Collection gives us radimate data structure.
       4.Size of collection is dynamics.
       5.store both homogeneous and heterogeneous data.
       6.memory more efficient.
       7.He got underlying data structure to simplify our work.
       8.java.util.collection(jdk1.2)

  2.Explain the Collection framework in Java.
The Java Collections Framework (JCF) is a comprehensive architecture to store and manipulate a group of objects.
 It provides various classes and interfaces to deal with data structures, such as lists, sets, and maps, in a much easier and optimized way.
 The Collection Framework is part of the java.util package.

Key Components of the Java Collection Framework
Interfaces:

Collection: The root interface of the collection hierarchy.
List: An ordered collection (also known as a sequence). Allows duplicate elements.
Set: A collection that does not allow duplicate elements.
Queue: A collection used to hold multiple elements prior to processing. Usually orders its elements in FIFO (First-In-First-Out).
Map: An object that maps keys to values. It does not extend the Collection interface.
Concrete Classes: These classes implement the collection interfaces and provide standard implementations:

ArrayList: Implements the List interface; resizable array.
LinkedList: Implements both List and Deque; elements are doubly linked.
HashSet: Implements the Set interface; uses a hash table.
TreeSet: Implements NavigableSet; stores elements in a sorted order.
HashMap: Implements the Map interface; stores data as key-value pairs.
TreeMap: Implements SortedMap; stores keys in sorted order.
Algorithms: The Collections Framework provides algorithms such as sorting, searching, shuffling, and others, which are implemented as static methods in the Collections utility class.

Collection
├── List
│   ├── ArrayList
│   ├── LinkedList
│   └── Vector
├── Set
│   ├── HashSet
│   ├── LinkedHashSet
│   └── TreeSet
└── Queue
    ├── PriorityQueue
    └── LinkedList

Advantages of the Collection Framework
Unified architecture: The Collection Framework provides a standard way to work with collections.
Reusability: It allows developers to reuse data structures and algorithms.
Performance: The collection classes are optimized for performance.
Thread-Safety: Some classes, such as Vector and ConcurrentHashMap, provide thread-safe implementations for concurrent environments.
What are the main interfaces in the Java Collections Framework?


3.How to Use the `Collections` Utility Class in Java?

The `Collections` class in Java is part of the **Java Collections Framework** and provides various static methods that operate on or return collections. It includes utility methods for sorting, searching, reversing, shuffling, and more. These methods work with any collection that implements the `Collection` interface, such as `List`, `Set`, or `Map`.

#### Commonly Used Methods in the `Collections` Class

1. **Sorting Collections:**
   - `Collections.sort(List<T> list)`: Sorts the specified list into ascending order, according to the natural ordering of its elements.
   - `Collections.sort(List<T> list, Comparator<? super T> c)`: Sorts the specified list according to the order induced by the comparator.
   ```java
   List<String> names = Arrays.asList("Moni", "John", "Alice");
   Collections.sort(names); // Natural order sorting
   ```

2. **Searching:**
   - `Collections.binarySearch(List<? extends T> list, T key)`: Searches the specified list for the specified object using the binary search algorithm.
   ```java
   int index = Collections.binarySearch(names, "John");
   ```

3. **Reversing Elements:**
   - `Collections.reverse(List<?> list)`: Reverses the order of the elements in the specified list.
   ```java
   Collections.reverse(names);
   ```

4. **Shuffling Elements:**
   - `Collections.shuffle(List<?> list)`: Randomly permutes the elements of the specified list.
   ```java
   Collections.shuffle(names);
   ```

5. **Minimum and Maximum:**
   - `Collections.min(Collection<? extends T> coll)`: Returns the minimum element in the given collection.
   - `Collections.max(Collection<? extends T> coll)`: Returns the maximum element in the given collection.
   ```java
   String minName = Collections.min(names); // Returns the minimum element
   String maxName = Collections.max(names); // Returns the maximum element
   ```

6. **Thread-Safe Collections:**
   - `Collections.synchronizedList(List<T> list)`: Returns a synchronized (thread-safe) list backed by the specified list.
   ```java
   List<String> syncList = Collections.synchronizedList(new ArrayList<>());
   ```

7. **Unmodifiable Collections:**
   - `Collections.unmodifiableList(List<? extends T> list)`: Returns an unmodifiable view of the specified list. Any attempt to modify the collection will throw an `UnsupportedOperationException`.
   ```java
   List<String> unmodifiableList = Collections.unmodifiableList(names);
   ```

8. **Filling Collections:**
   - `Collections.fill(List<? super T> list, T obj)`: Replaces all elements of the specified list with the specified element.
   ```java
   Collections.fill(names, "Unknown");
   ```

4. Different Types of Collections in Java

The Java Collections Framework includes several types of collections, each designed for different use cases. These collections are broadly divided into three categories: **List**, **Set**, and **Queue**, along with the special **Map** collection.

#### 1. **List:**
   - A **List** is an ordered collection that allows duplicate elements. Lists maintain the insertion order, which means elements can be accessed by their position (index).
   - Implementations:
     - **ArrayList**: Resizable array, fast random access.
     - **LinkedList**: Doubly-linked list, efficient insertion/deletion.
     - **Vector**: Synchronized, resizable array.

   **Example:**
   ```java
   List<String> names = new ArrayList<>();
   names.add("Moni");
   names.add("Shanker");
   ```

#### 2. **Set:**
   - A **Set** is an unordered collection that does not allow duplicate elements. It is primarily used for unique elements.
   - Implementations:
     - **HashSet**: Stores elements in a hash table, does not maintain order.
     - **LinkedHashSet**: Maintains the insertion order.
     - **TreeSet**: Stores elements in a sorted (ascending) order.

   **Example:**
   ```java
   Set<String> uniqueNames = new HashSet<>();
   uniqueNames.add("Moni");
   uniqueNames.add("John");
   ```

#### 3. **Queue:**
   - A **Queue** is a collection used to hold multiple elements prior to processing, typically in a FIFO (First-In-First-Out) order.
   - Implementations:
     - **PriorityQueue**: Orders elements according to their natural ordering or by a comparator.
     - **LinkedList**: Can also be used as a queue.

   **Example:**
   ```java
   Queue<Integer> queue = new LinkedList<>();
   queue.add(10);
   queue.add(20);
   ```

#### 4. **Map:**
   - A **Map** is not part of the `Collection` interface but is included in the Java Collections Framework. It maps keys to values and does not allow duplicate keys.
   - Implementations:
     - **HashMap**: Stores key-value pairs in a hash table.
     - **LinkedHashMap**: Maintains the insertion order.
     - **TreeMap**: Stores key-value pairs in sorted order based on keys.

   **Example:**
   ```java
   Map<Integer, String> map = new HashMap<>();
   map.put(1, "Moni");
   map.put(2, "Shanker");
   ```

#### 5. **Deque (Double-Ended Queue):**
   - A **Deque** is a linear collection that allows elements to be inserted and removed from both ends. It can function both as a queue and a stack.
   - Implementations:
     - **ArrayDeque**: Resizable array for storing elements.
     - **LinkedList**: Can also function as a deque.

   **Example:**
   ```java
   Deque<String> deque = new ArrayDeque<>();
   deque.addFirst("Start");
   deque.addLast("End");
   ```

     */
    /*
     5. Difference between Collection and Collections.
       Collection
       1.It is an interface.
       2.It stores serveral an object as single entily.

       Collections
       1.It is a class.
       2.It is a utility class that's helps us to perform operations like sorting,searching on object present inside collection.

       6. Difference between Array and Collections.
       Array
       1.It is fixed size.
       2.Store only homogeneous data.
       3.Memory usage it is less efficient.
       4.No underlying data structure.

       Collection
       1.Size of collection is dynamics.
       2.store both homogeneous and heterogeneous data.
       3.memory more efficient.
       4.He got underlying data structure to simplify our work.

     */

    /*
    LIST
    7.Difference between Array and ArrayList.
       Array:
       1. fixed sized. 2. not inside build method. 3. Contained both primitive datatype as well as object class.
       4. can be multi-dimensional. 5. part of core java program.

       ArrayList:
       1. Size dynamics. 2. many build method. 3. Support only object entities. 4. One dimensional 5. Part of Collection framework.

      List-ArrayList,LinkedList,vector,stack
       Index based data structure.
       allow to store duplicate element
       List can store any value of null elements.
       Peformance is low
                        implement                   extends
       ArrayList(class)----------->List(Interface)------------>Collection

              5. ArrayList:
       1. It can contains duplicate elements.
       2. It maintains insertion order.
       3. Allows Random access of data.
       4. Internally it is implemented as dynamics arrays.
       5. Used Wrapper class.
       6. ArrayList can not used for perimitive type. order


  8. Difference between ArrayList and LinkedList?
       ArrayList
       1. ArrayList internally used a dynamic array to store the elements.
       2. Manipulation with ArrayList is slow.
       3. ArrayList consumes less memory than linked list.
       4. An arrayList class can acts as a list only.
       5. ArrayList better for sorting and accessing data.

       LinkedList
       1. LinkedList internally used a double LinkedList  to store the elements.
       2. Manipulation with ArrayList is fast.
       3. LinkedList consumes more memory than Arraylist.
       4. An LinkedList class can acts as a list and queue.
       5. LinkedList better for Manipulation data.




     */
    /*

       6. Use for retrieving of data in collection.
       for-each,iterator,listiterator,EnumerationIterator,cursor.
     */
    public static class ForEach {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("A", "B", "C", "D");
            for (String item : list) {
                System.out.println(item);
            }
        }
    }
    // 2. Iterator
    //The Iterator interface provides methods to iterate over a collection and allows safe removal of elements during iteration.


//    List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
//    Iterator<String> iterator = list.iterator();
//       while (iterator.hasNext()) {
//        String item = iterator.next();
//        System.out.println(item);
//        // Remove element during iteration
//         iterator.remove();
//    }

    // 3. ListIterator
    //       The ListIterator interface extends Iterator and allows bidirectional traversal of the list. It also allows modification of elements.

//    List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
//    ListIterator<String> listIterator = list.listIterator();
//       while (listIterator.hasNext()) {
//        String item = listIterator.next();
//        System.out.println(item);
//        // Modify element during iteration
//        // listIterator.set("E");
//    }
//       while (listIterator.hasPrevious()) {
//        String item = listIterator.previous();
//        System.out.println(item);
//    }

    /*
      4. Enumeration
       The Enumeration interface is used with legacy classes like Vector and Hashtable. It's similar to Iterator but does not allow element removal.


       Vector<String> vector = new Vector<>(Arrays.asList("A", "B", "C", "D"));
       Enumeration<String> enumeration = vector.elements();
       while (enumeration.hasMoreElements()) {
           String item = enumeration.nextElement();
           System.out.println(item);
       }
       5. Cursor
       In Java, a cursor typically refers to database cursors used in JDBC for database operations. For list traversal, this is not applicable.

       However, if you are looking at cursors in the context of database operations, here's an example using JDBC:


       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "user", "password");
       Statement statement = connection.createStatement();
       ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");

       while (resultSet.next()) {
           String data = resultSet.getString("column_name");
           System.out.println(data);
       }

       resultSet.close();
       statement.close();
       connection.close();
       Summary
       For-each Loop: Simple and readable, no modification during iteration.
       Iterator: Safe removal of elements during iteration.
       ListIterator: Bidirectional traversal and element modification.
       Enumeration: Used with legacy classes, no element removal.
       Cursor: Generally used for database operations, not for lists.

  7. Method to sort collection?
       Collections.sort()
       -java.util.package
       -sort in assecending

       Array.sort()
       -java.util.Arrays.sort()
       -also used for sorting Comparator and comparable interface.

       8. How to reverse list in collection.
       Three ways.
       1. Recursively
       2. Collections.reverse()
       3.using list add() and list.removemethods.
       9. How do you make arraylist as synchronised?
       Two ways
       1. Collections.synchronisedList() method
       2. using copyOneWriteArrayList

     */
    // 1. WAP to traverse(ot iterate) ArrayList.
    public static class A {
        public static void main(String[] args) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(3);
            a.add(17);
            a.add(6);
            a.add(9);
            a.add(7);
            System.out.println(a);
        }
    }//op:[3, 17, 6, 9, 7]

    public static class A1 {
        public static void main(String[] args) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(3);
            a.add(17);
            a.add(6);
            a.add(9);
            a.add(7);

            for (Integer num : a) {
                System.out.print(" " + num);
            }
        }//o/p  3 17 6 9 7

    }
    public static class A2 {
        public static void main(String[] args) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i <= 5; i++) {
                a.add(i);
                System.out.println(a);
            }

            // Removing element at index 3
            a.remove(3);

            System.out.println(a);
            for (int i=0;i<a.size();i++){
                System.out.println(a.get(i)+" ");
            }
        }
    }//op:[0, 1, 2, 3, 4, 5]
//       [0, 1, 2, 4, 5]
//               0 1 2 4 5
//
//    add(object):used to add an object to the collection
//    size():used to return the number of elements in the collection.
//            remove():remove only one elements.


//     4. Given an element write a program check if element(value)
//    exist in elements.

    public static class B {
        public static void main(String[] args) {
            ArrayList<Integer>a=new ArrayList<>();
            a.add(1);
            a.add(4);
            a.add(2);
            a.add(3);
            System.out.println(a);
            if(a.contains(2)){
                System.out.println("Found");
            } else{
                System.out.println("Not found");
            }
        }
    }
//       [1, 4, 2, 3]
//    Found
//    contains(object o);
//    This method returns true if the collection contains the specified elements.


   //  5. Reverse An ArrayList
    public static class  ReverseElements {
        public static void main(String[] args) {
            ArrayList<Integer>a=new ArrayList<>();
            a.add(4);
            a.add(3);
            a.add(1);
            a.add(2);
            System.out.println("OriginalList:"+a);
            Collections.reverse(a);
            System.out.println("ReverseNumber:"+a);
        }
    }
//    OriginalList:[4, 3, 1, 2]
//    ReverseNumber:[2, 1, 3, 4]

          //  6.
    public static class ComPareElements {
              public static void main(String[] args) {
                  ArrayList<Integer> a = new ArrayList<>();

                  a.add(4);
                  a.add(3);
                  a.add(1);
                  a.add(2);
                  a.add(5);
                  a.add(8);
                  int min = Collections.min(a);
                  int max = Collections.max(a);
                  if (min == max) {
                      System.out.println("All Elements are Equal");
                  } else {
                      System.out.println("Minimum Elements");
                      System.out.println("max");
                  }
              }
          }
//    }Minimum Elements
//    max
     //  7. WAP to add elements at the specified index in the list using add(index,elements) method.
    public static class D {
        public static void main(String[] args) {
            ArrayList<Integer>a=new ArrayList<>();
            //add method for integer arraylist
            a.add(1);
            a.add(2);
            // index is zero based
            a.add(1,3);
            a.add(2,4);
            System.out.println(a);
        }
    }
     //  [1, 3, 4, 2]

          //     8.
    public static class Student {
        private String name;
        private String rollNo;

        public Student(String name, String rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollNo='" + rollNo + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            ArrayList<Student> a=new ArrayList<>();
            Student student1=new Student("abc","12");
            Student student2=new Student("abcd","13");
            Student student3=new Student("abcde","14");
            a.add(student1);
            a.add(student2);
            a.add(student3);
            for (Student C:a){
                System.out.println(C);
            }


        }
    }
    // 9. WAP to sort ArrayList in descending order.
    public static class DescendingOrder {
        public static void main(String[] args) {
            ArrayList<String>a=new ArrayList<>();
            a.add("pqr");
            a.add("mno");
            a.add("abc");
            a.add("str");
            System.out.println(a);//unsorted
            Collections.sort(a,Collections.reverseOrder());
            System.out.println(a);//reverse
        }
    }
//    All Elements::
//            [pqr, mno, abc, str]
//    Descending Order::
//            [str, pqr, mno, abc]

          //  10. WAP to convert List to Array.
    public static class ListToArray {
              public static void main(String[] args) {
                  ArrayList<String> a = new ArrayList<>();
                  a.add("Apple");
                  a.add("Banana");
                  a.add("Pear");
                  a.add("Mango");
                  String[] str = new String[a.size()];
                  for (int i = 0; i < a.size(); i++) {
                      str[i] = a.get(i);
                  }
                  for (String s : str) {
                      System.out.println(s);
                  }
              }
          }
//    }Apple
//            Banana
//    Pear
//            Mango

      // 11.WAP to convert Array to List.
    public static class ArrayToList {
        public static void main(String[] args) {
            String[] str={"Dog","cat","Elephant"};
            for (String value:str){
                System.out.println("All Elements:"+value);
            }
            ArrayList arrayList=new ArrayList<>(Arrays.asList(str));
            System.out.println("List Elements:"+arrayList);
        }
    }


//    All Elements:Dog
//    All Elements:cat
//    All Elements:Elephant
//    List Elements:[Dog, cat, Elephant]


/*    9. Difference between ArrayList and Vector?
       ArrayList
       1. ArrayList gives better Performance.
       2. non.synchronised.
       3. non-Thread safe.
       4. ArrayList can use Iterator for traversing its elements.

    Vector
       1. poor performance.
       2. Synchronised.
       3. Thread safe.
       4. Vector can use both Enumeration and Iterator for traversing over elements.

       Vector
       1. The vector can implement a growable array of objects.
       2. Vector falls in legacy class.
       3. java.util package and implement the list interface.
       4. vector implements a dynamic array.
       5. similar to arrayList
       6. synchronized and thread safe
       7. maintains insertion order.
       8. poor performance


 */
     //  1. Adding and Accessing Elements:
          public static class VectorExample {
        public static void main(String[] args) {
            // Creating a Vector of Integers
            Vector<Integer> vector = new Vector<>();

            // Adding elements to the Vector
            vector.add(10);
            vector.add(20);
            vector.add(30);
            System.out.println(vector);
            // Accessing elements using index
            System.out.println("Element at index 0: " + vector.get(0));
            System.out.println("Element at index 1: " + vector.get(1));
            System.out.println("Element at index 2: " + vector.get(2));
        }
    }
      // 2. Vector with Initial Capacity:

    public static class VectorExample3 {
        public static void main(String[] args) {
            // Creating a Vector with initial capacity of 3
            Vector<Integer> vector = new Vector<>(3);

            // Adding elements to the Vector
            vector.add(10);
            vector.add(20);
            vector.add(30);

            // Accessing elements using index
            System.out.println("Element at index 0: " + vector.get(0));
            System.out.println("Element at index 1: " + vector.get(1));
            System.out.println("Element at index 2: " + vector.get(2));
        }
    }
     //  3. Copying Elements from Another Collection:


         public static class VectorExample2 {
        public static void main(String[] args) {
            // Creating an ArrayList
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(10);
            arrayList.add(20);
            arrayList.add(30);

            // Creating a Vector and copying elements from ArrayList
            Vector<Integer> vector = new Vector<>(arrayList);

            // Accessing elements using index
            System.out.println("Element at index 0: " + vector.get(0));
            System.out.println("Element at index 1: " + vector.get(1));
            System.out.println("Element at index 2: " + vector.get(2));
        }
    }



    public static class VectorExample1{
        public static void main(String[] args) {
            // Creating a Vector of Strings
            Vector<String> vector = new Vector<>();

            // Adding elements to the Vector
            vector.add("Apple");
            vector.add("Banana");
            vector.add("Orange");

            // Accessing elements using index
            System.out.println("Element at index 0: " + vector.get(0));
            System.out.println("Element at index 1: " + vector.get(1));
            System.out.println("Element at index 2: " + vector.get(2));

            // Size of the Vector
            System.out.println("Size of Vector: " + vector.size());

            // Iterating over the Vector
            System.out.println("Iterating over the Vector:");
            for (String fruit : vector) {
                System.out.println(fruit);
            }

            // Removing an element
            vector.remove(1);
            System.out.println("Vector after removing element at index 1: " + vector);

            // Checking if Vector contains an element
            System.out.println("Does Vector contain 'Apple'? " + vector.contains("Apple"));

            // Clearing the Vector
            vector.clear();
            System.out.println("Vector after clearing: " + vector);
        }
    }


}

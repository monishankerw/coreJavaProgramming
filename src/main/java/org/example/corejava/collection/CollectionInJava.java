package org.example.corejava.collection;

import org.example.corejava.collection.set.hashSet.logicquestion.CheckDuplicate;
import org.example.corejava.collection.set.hashSet.logicquestion.LongestSubstring;

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
            for (int i = 0; i < a.size(); i++) {
                System.out.println(a.get(i) + " ");
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
            ArrayList<Integer> a = new ArrayList<>();
            a.add(1);
            a.add(4);
            a.add(2);
            a.add(3);
            System.out.println(a);
            if (a.contains(2)) {
                System.out.println("Found");
            } else {
                System.out.println("Not found");
            }
        }
    }
//       [1, 4, 2, 3]
//    Found
//    contains(object o);
//    This method returns true if the collection contains the specified elements.


    //  5. Reverse An ArrayList
    public static class ReverseElements {
        public static void main(String[] args) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(4);
            a.add(3);
            a.add(1);
            a.add(2);
            System.out.println("OriginalList:" + a);
            Collections.reverse(a);
            System.out.println("ReverseNumber:" + a);
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
            ArrayList<Integer> a = new ArrayList<>();
            //add method for integer arraylist
            a.add(1);
            a.add(2);
            // index is zero based
            a.add(1, 3);
            a.add(2, 4);
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
            ArrayList<Student> a = new ArrayList<>();
            Student student1 = new Student("abc", "12");
            Student student2 = new Student("abcd", "13");
            Student student3 = new Student("abcde", "14");
            a.add(student1);
            a.add(student2);
            a.add(student3);
            for (Student C : a) {
                System.out.println(C);
            }


        }
    }

    // 9. WAP to sort ArrayList in descending order.
    public static class DescendingOrder {
        public static void main(String[] args) {
            ArrayList<String> a = new ArrayList<>();
            a.add("pqr");
            a.add("mno");
            a.add("abc");
            a.add("str");
            System.out.println(a);//unsorted
            Collections.sort(a, Collections.reverseOrder());
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
            String[] str = {"Dog", "cat", "Elephant"};
            for (String value : str) {
                System.out.println("All Elements:" + value);
            }
            ArrayList arrayList = new ArrayList<>(Arrays.asList(str));
            System.out.println("List Elements:" + arrayList);
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


    public static class VectorExample1 {
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

    /*----------------------------------------------SET-------------------------------------------------------*/
   /*
     SET
       https://www.geeksforgeeks.org/set-in-java/
          extends            extends                implement
       set--------->SortedSet---------->NavigableSet----------->TreeSet


       Set:
       ---> HashSet, TreeSet,LinkedHashSet
       ----> It is an interface
       ----->java.util package
       ----->Does not maintain any insertion order
       ---->Can not allow to duplicate value.
       ---->Set can store only one null value.
       ---->Not index based data structure store the data HashCode values.

1. **What is the difference between a List and a Set in Java?

List vs Set
List:
1. ArrayList and LinkedList
2. allow to store duplicate value.
3. Index based data structure.
4. List can store any value of null value.

Set

1. HashSet and TreeSet
2. not allow to store duplicate value.
3. not index based data structure store the data Hashcode value.
4. Set can store any one null value.


 2. **Explain the different types of Set implementations in Java.**
- **Answer**:
    - **HashSet**: It uses a hash table for storing elements, which makes it faster in accessing elements. It does not maintain the order of elements.
    - **LinkedHashSet**: It is similar to `HashSet` but maintains the insertion order.
    - **TreeSet**: It stores elements in sorted order (ascending by default). It is based on a Red-Black tree.

#### 3. **When would you use a Set over a List?**
- **Answer**: Use a **Set** when you need to ensure that there are no duplicate elements in the collection and order is not a concern (or when you want a specific order, like in `TreeSet`). Use a **List** if you need to maintain duplicates or care about positional access to the elements.

#### 6. **What happens if you try to add a duplicate element to a `Set`?**
- **Answer**: If you try to add a duplicate element, the `Set` will simply ignore the new element and retain the existing one. No error will be thrown.

#### 7. **Can a `null` element be added to a `Set`?**
- **Answer**: It depends on the implementation:
    - **HashSet** and **LinkedHashSet** allow a single `null` element, since they are based on `HashMap`, which allows one `null` key.
    - **TreeSet** does not allow `null` elements because it tries to sort elements and throws a `NullPointerException` when comparing `null` with other elements.


10. **How would you remove duplicate elements from a `List` using a `Set`?**
- **Answer**: Since `Set` doesn’t allow duplicates,
you can simply pass the `List` to a `Set` constructor and then convert it back to a `List` if needed.

 */


    public static class RemoveDuplicates {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana");
            Set<String> set = new HashSet<>(list);  // Removes duplicates
            List<String> uniqueList = new ArrayList<>(set);  // Converts back to List

            System.out.println(uniqueList); // Output: [Apple, Banana, Orange]
        }

        public static class A {
            public static void main(String[] args) {
                Set<Integer> set = new HashSet<>();
                set.add(23);
                set.add(12);
                set.add(34);
                set.add(54);
                System.out.println("HashSet not maintain insertion order:" + set);
            }
        }

        public static class B {
            public static void main(String[] args) {
                Set<Integer> set = new HashSet<>();
                set.add(12);
                set.add(null);
                set.add(23);
                set.add(43);
                set.add(54);
                set.add(null);
                System.out.println("HashSet used only one null value: " + set);
            }
        }

    }
    public static class C {
        public static void main(String[] args) {
            Set<String> a=new HashSet<>();
            a.add("India");
            a.add("Australia");
            a.add("South Africa");
            System.out.println(a);
            a.remove("Australia");
            System.out.println(a);
            System.out.println("Iterating over set:");
            Iterator<String> i=a.iterator();
            while (i.hasNext())
                System.out.println(i.hasNext());
        }
    }
    public static class D1 {
        public static void main(String[] args) {
            Set<String>set=new HashSet<>();
            set.add("A");
            set.add("B");
            set.add("C");
            set.add("A");
            set.add("C");
            System.out.println("Not allow duplicate Elements:"+set);
        }
    }
    public static class E {
        public static void main(String[] args) {
            Set<Integer>a=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
            Set<Integer>b=new HashSet<>(Arrays.asList(2,3,4,5,7,8));
            System.out.println("Elements in a: " + a);
            System.out.println("Elements in b: " + b);

            //union
            Set<Integer>union=new HashSet<>(a);
            union.addAll(b);
            System.out.println("UNION:"+union);

            //intersection
            Set<Integer>intersection=new HashSet<>(a);
            intersection.retainAll(b);
            System.out.println("intersection:"+intersection);

            //SYMMETRIC DIFFERENCE
            Set<Integer>symmetricDifference=new HashSet<>(union);
            symmetricDifference.removeAll(intersection);
            System.out.println("symmetricDifference:"+symmetricDifference);




        }
    }

    /*
    _________________________
HashSet vs LinkedHashSet

HashSet
1. HashSet does not maintain insertion order.
2. HashSet internally map HashMap.

LinkedHashSet
1. LinkedHashSet maintain insertion order.
2. LinkedHashSet internally map LinkedHashMap.

Q. How to HashSet internally work?
Internally, it uses a HashMap to store its elements.
     1. The HashSet uses a HashMap internally where each element is stored as a key with a constant dummy value.
     2. The hash code of an element determines the index of the bucket where it will be stored.
     3. Collisions are handled by using linked lists or balanced trees within the buckets.
     4. Before adding a new element, HashSet checks for duplicates using the equals() method to ensure all elements are unique.



  **HashSet Internals:**

     1. **Hash Table Structure**:
        - **HashSet** uses a hash table to store elements.
        - Internally, it’s backed by a `HashMap`, where each element is stored as a key in the `HashMap`.

     2. **Hash Code**:
        - When you add an element to a `HashSet`, its `hashCode()` method is called to compute a hash value.
        - This hash value determines the bucket index where the element will be stored.

     3. **Buckets**:
        - The hash table consists of an array of buckets (or slots).
        - Each bucket can hold a linked list of elements (or a balanced tree in case of many collisions).

     4. **Collision Handling**:
        - If two elements hash to the same bucket, they are stored in a linked list within that bucket.
        - From Java 8 onwards, if a bucket contains many elements, the linked list may be converted to a balanced tree for better performance.

     5. **Equality Check**:
        - To ensure no duplicates, `HashSet` uses the `equals()` method to check if the new element is already present in the bucket.

     ### Diagram

     Here’s a simplified diagram illustrating how a `HashSet` is organized:

     ```
     HashSet
       |
       |-- Hash Table (Array of Buckets)
             |
             |-- Bucket 0
             |     |
             |     |-- [Element1, Element2] (Linked List or Tree)
             |
             |-- Bucket 1
             |     |
             |     |-- [Element3] (Single Element)
             |
             |-- Bucket 2
                   |
                   |-- [Element4, Element5] (Linked List or Tree)


     */
   public static class Person {
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return id == person.id && Objects.equals(name, person.name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static class HashSetDemo {
        public static void main(String[] args) {
            Set<Person> set = new HashSet<>();

            Person p1 = new Person(1, "Alice");
            Person p2 = new Person(2, "Bob");
            Person p3 = new Person(1, "Alice"); // Duplicate

            set.add(p1);
            set.add(p2);
            set.add(p3); // Will not be added

            System.out.println(set); // Output: [Person{id=1, name='Alice'}, Person{id=2, name='Bob'}]
        }
    }

    public static class CheckDuplicate {
        public static void main(String[] args) {
            org.example.corejava.collection.set.hashSet.logicquestion.CheckDuplicate checkDuplicate=new org.example.corejava.collection.set.hashSet.logicquestion.CheckDuplicate();
            int num[]={1,2,3,4,1};
            Boolean r =checkDuplicate.duplicateCheck(num);
            System.out.println(r);
        }

        private Boolean duplicateCheck(int[] num) {
            Set<Integer> set=new HashSet<>();
            for (Integer nums:num) {
                if (set.contains(nums)) {
                    return true;
                }
                set.add(nums);
            }
            return false;
        }
    }

    /*
 Longest Substring Without
Repeating Characters
Given a string s, find the length of the longest
substring without repeating characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc"
, with a length of 3.
 */




    public static class LongestSubstring {
        public static void main(String[] args) {
            org.example.corejava.collection.set.hashSet.logicquestion.LongestSubstring longestSubstring = new org.example.corejava.collection.set.hashSet.logicquestion.LongestSubstring();
            String str = "abcabcbb";
            int maxLength = longestSubstring.longestSubstring(str);
            System.out.println("Length of the longest substring without repeating characters: " + maxLength);
        }

        private int longestSubstring(String str) {
        /*
 Set<Character> set: This HashSet is used to store characters of the current window.
 It helps in checking whether a character is repeated within the current window.
int left: This pointer indicates the start of the current window of characters.
int right: This pointer indicates the end of the current window of characters (inclusive).
int maxLength: This variable keeps track of the maximum length of substrings found that do not contain repeating characters.

         */
            Set<Character> set = new HashSet<>();
            int left = 0, right = 0, maxLength = 0;

        /*
        This loop continues as long as right is within the bounds of the string.
         The right pointer expands the window to include new characters.
         */
            while (right < str.length()) {

            /*
            If the character at the right pointer is not already in the set,
            it means the current substring is still unique.
            The character can be added to the current window.
             */
                if (!set.contains(str.charAt(right))) {
                    set.add(str.charAt(right));
                    right++;
                    maxLength = Math.max(maxLength, right - left);


                /*
                If the character at the right pointer is already in the set (i.e., the window contains a duplicate character):
set.remove(str.charAt(left)): Remove the character at the left pointer from the set. This is because the left pointer will move to the right, effectively shrinking the window from the left side.
left++: Move the left pointer to the right to shrink the window and remove the duplicate character, ensuring the substring is unique.
                 */
                } else {
                    set.remove(str.charAt(left));
                    left++;
                }
            }
            return maxLength;
        }
    }

}



























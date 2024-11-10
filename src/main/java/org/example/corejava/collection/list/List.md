1. **Difference Between Collection and Collections?**
2. **Difference Between Arrays and Collections?**
3. **Collections Hierarchically?**
4. **List Hierarchically?**
5. **Difference Between Arrays and ArrayList?**
6. **Difference Between ArrayList and LinkedList?**
7. **Difference Between ArrayList and Vector?**



### Basic ArrayList Operations

1. **How do you initialize an ArrayList in Java?**
    - Example: `ArrayList<Integer> list = new ArrayList<>();`

2. **How can you add elements to an ArrayList?**
    - Example: `list.add(10); list.add(20);`

3. **How do you access an element in an ArrayList by its index?**
    - Example: `Integer element = list.get(0);`

4. **How do you remove an element from an ArrayList by its index or value?**
    - Example: `list.remove(0);` or `list.remove(Integer.valueOf(10));`

5. **How do you update or replace an element at a specific index in an ArrayList?**
    - Example: `list.set(0, 30);`

6. **How can you check if an ArrayList contains a specific element?**
    - Example: `boolean exists = list.contains(10);`

### Advanced ArrayList Operations

7. **How do you sort an ArrayList in ascending or descending order?**
    - Example for ascending: `Collections.sort(list);`
    - Example for descending: `Collections.sort(list, Collections.reverseOrder());`

8. **How can you convert an ArrayList to an array?**
    - Example: `Integer[] array = list.toArray(new Integer[0]);`

9. **How can you convert an array to an ArrayList?**
    - Example: `ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));`

10. **What is the difference between `ArrayList` and `LinkedList` in Java?**
    - `ArrayList` is backed by a dynamic array, while `LinkedList` is backed by a doubly linked list, which affects their performance in operations like insertions and deletions.

### Performance and Capacity Management

11. **How does ArrayList manage its capacity, and how can you optimize it?**
    - `ArrayList` grows dynamically, usually doubling its size when full. Use `ArrayList(int initialCapacity)` for optimization if size is known.

12. **What is the default capacity of an ArrayList?**
    - The default capacity is 10 when an ArrayList is created with the no-argument constructor.

13. **How can you trim an ArrayList's size to match the number of elements in it?**
    - Example: `list.trimToSize();`

14. **What is the complexity of various ArrayList operations?**
    - For example: `get` and `set` have `O(1)`, while `add` and `remove` have `O(n)` in the worst case.

### ArrayList Manipulations and Functional Programming

15. **How can you iterate over an ArrayList using different methods?**
    - Examples: `for` loop, `forEach` loop, iterator, `forEach` with lambda expressions.

16. **How can you filter elements of an ArrayList based on a condition using Streams?**
    - Example: `list.stream().filter(x -> x > 10).collect(Collectors.toList());`

17. **How do you remove all elements from an ArrayList?**
    - Example: `list.clear();`

18. **How to merge two ArrayLists into a single ArrayList?**
    - Example: `list1.addAll(list2);`

### Concurrency and Synchronization

19. **Is ArrayList synchronized, and how can you make it thread-safe?**
    - `ArrayList` is not synchronized. You can use `Collections.synchronizedList(list);` to make it thread-safe.

20. **What is `CopyOnWriteArrayList`, and how is it different from `ArrayList`?**
    - `CopyOnWriteArrayList` is a thread-safe variant of `ArrayList` that creates a new copy of the list for every write operation.

### Interview Scenarios and Problem-Solving

21. **How would you remove duplicates from an ArrayList?**
    - Solution: Convert to a `Set` or use a `Stream` with `distinct()`.

22. **How can you reverse an ArrayList?**
    - Example: `Collections.reverse(list);`

23. **How do you find the index of the first and last occurrence of an element?**
    - Example: `list.indexOf(10);` and `list.lastIndexOf(10);`

24. **How do you find the maximum and minimum values in an ArrayList?**
    - Example: `Collections.max(list);` and `Collections.min(list);`

25. **Write a method to check if two ArrayLists are equal.**
    - Example: `list1.equals(list2);`




```markdown
# Map in Java

- **Definition**: 
  - `Map` is an interface that represents a collection of key-value pairs, where each key is unique.
  - It provides an efficient way to store and retrieve values based on keys.
  - The most commonly used implementations of the `Map` interface are `HashMap`, `TreeMap`, and `LinkedHashMap`.

## Key Characteristics of a Map:

- **Key-Value Pair Storage**:
  - A `Map` stores data in pairs (`key`, `value`). You can retrieve a value by its key.
  
- **Unique Keys**:
  - Each key in a `Map` must be unique. If a duplicate key is added, it replaces the previous entry with the same key.
  
- **No Indexing**:
  - A `Map` does not maintain order in the way that a `List` does.
  - Some implementations like `LinkedHashMap` maintain insertion order, and `TreeMap` maintains sorted order.
  
- **Null Keys and Values**:
  - Some `Map` implementations like `HashMap` allow one null key and multiple null values.
  - `TreeMap` does not permit null keys.

## Example Code:

```java
Map<String, Integer> map = new HashMap<>();
map.put("Apple", 1);
map.put("Banana", 2);
map.put("Orange", 3);

// Retrieve value by key
int value = map.get("Banana");  // Returns 2
```
2.What are the commonly used Map implementations in Java?
Answer:
HashMap: A hash table-based implementation of Map, which provides constant-time performance for basic operations like get() and put(), assuming the hash function disperses the elements properly.
TreeMap: A Map that is sorted by its keys in natural order or by a comparator.
LinkedHashMap: A Map that maintains the insertion order of elements.
ConcurrentHashMap: A thread-safe version of HashMap.
``` 


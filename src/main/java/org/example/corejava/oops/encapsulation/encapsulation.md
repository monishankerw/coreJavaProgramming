```markdown
# Encapsulation in Java

## 1. What is Encapsulation?
Encapsulation is the concept of wrapping data (attributes) and methods (functions) that operate on the data into a single unit,
typically a class. This helps to restrict direct access to some of the object's components, which is a means of preventing unintended interference and misuse.

- **Key Points:**
  - Data is made private to prevent direct access.
  - Public methods, known as **getters** and **setters**, are provided to operate on the data.

## 2. Advantages of Encapsulation
- **Control Access to Data:** It allows for validation of values before they are set, ensuring that the object maintains a valid state.
- **Read-Only or Write-Only Access:** You can create read-only or write-only properties by only providing a getter or a setter method, respectively.

## 3. Data Hiding
- Data hiding is a principle that makes the class's variables private, restricting access from outside the class.
- **Note:** Data hiding applies to variables, not methods. Methods can still be public while their underlying data remains hidden.

## 4. How to Achieve Encapsulation in Java
To achieve encapsulation in Java, follow these steps:
1. Declare the variables of a class as private.
2. Provide public setter and getter methods to modify and view the variable values.

### Example
```java
public class Employee {
    private String name; // Private variable

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}
```

## 5. What are Get and Set Methods?
- **Get Method:** The getter method is used to retrieve the value of a private variable.
- **Set Method:** The setter method is used to set or update the value of a private variable.

### Example
```java
Employee emp = new Employee();
emp.setName("John Doe"); // Using setter
String empName = emp.getName(); // Using getter
```

## 6. Benefits of Encapsulation
- **Data Hiding:** Protects the internal state of the object from unintended interference.
- **Increased Flexibility:** You can change the internal implementation without affecting other parts of the code.
- **Reusability:** Encapsulated code is easier to reuse in other programs or projects.
```
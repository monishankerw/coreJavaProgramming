
---

### **Java 1.0 (1996)**
Initial release of Java. Key feature: the creation of applets.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

### **Java 1.2 (1998) – "Java 2"**
Introduced Swing, Collections Framework.

```java
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java 2");
        list.add("Collections");

        System.out.println(list);
    }
}
```

---

### **Java 1.4 (2002)**
Added `assert` keyword, NIO (New Input/Output).

```java
public class AssertExample {
    public static void main(String[] args) {
        int x = 5;
        assert x > 10 : "X is less than 10";
        System.out.println(x);
    }
}
```

---

### **Java 5 (2004) – "Tiger"**
Features: Generics, enhanced for-loop, autoboxing, varargs, annotations, and enums.

```java
public class GenericsExample {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.set(123);
        System.out.println(box.get());
    }
}

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
```

---

### **Java 6 (2006)**
Improvements in performance, scripting via `javax.script` package, and `Web Services`.

```java
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class ScriptExample {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        engine.eval("print('Hello from JavaScript')");
    }
}
```

---

### **Java 7 (2011)**
Introduced try-with-resources, `diamond operator`, and switch on `String`.

```java
public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (AutoCloseableResource resource = new AutoCloseableResource()) {
            resource.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class AutoCloseableResource implements AutoCloseable {
    public void doSomething() {
        System.out.println("Doing something...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing resource...");
    }
}
```

---

### **Java 8 (2014)**
Introduced Lambdas, Streams, `Optional`, and `default` methods in interfaces.

```java
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");

        list.stream()
            .filter(s -> s.equals("b"))
            .forEach(System.out::println);

        Optional<String> opt = list.stream()
            .filter(s -> s.equals("e"))
            .findFirst();
        
        System.out.println(opt.orElse("Not Found"));
    }
}
```

---

### **Java 9 (2017)**
Introduced the **module system**, `JShell`, and enhancements to Streams and Optional.

```java
public class Java9Example {
    public static void main(String[] args) {
        var list = List.of("Java", "9", "Modules");
        list.forEach(System.out::println);
    }
}
```

---

### **Java 10 (2018)**
Introduced `var` for local variables and improvements to garbage collection.

```java
public class Java10Example {
    public static void main(String[] args) {
        var message = "Hello from Java 10!";
        System.out.println(message);
    }
}
```

---

### **Java 11 (2018)**
Introduced the `HttpClient` API, `var` in lambda expressions, and `String` enhancements.

```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class HttpClientExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
```

---

### **Java 12 (2019)**
Introduced switch expressions (preview) and improvements to garbage collection.

```java
public class SwitchExample {
    public static void main(String[] args) {
        String day = "MONDAY";
        var result = switch (day) {
            case "MONDAY" -> "Start of work week";
            case "FRIDAY" -> "End of work week";
            default -> "Midweek";
        };
        System.out.println(result);
    }
}
```

---

### **Java 13 (2019)**
Introduced text blocks (preview).

```java
public class TextBlocksExample {
    public static void main(String[] args) {
        var textBlock = """
            This is a text block in Java 13.
            It supports multi-line strings.
            """;
        System.out.println(textBlock);
    }
}
```

---

### **Java 14 (2020)**
Enhanced `NullPointerExceptions` and records (preview).

```java
public class RecordExample {
    public static void main(String[] args) {
        var person = new Person("John", 30);
        System.out.println(person.name());
    }
}

record Person(String name, int age) {}
```

---

### **Java 15 (2020)**
Sealed classes (preview) and text blocks became standard.

```java
sealed class Shape permits Circle, Square {}

final class Circle extends Shape {}
final class Square extends Shape {}

public class SealedClassExample {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println("Shape created: " + shape.getClass().getSimpleName());
    }
}
```

---

### **Java 16 (2021)**
Made records and pattern matching for `instanceof` standard.

```java
public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello, Pattern Matching!";
        
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}
```

---

### **Java 17 (2021) – Long-Term Support (LTS)**
Introduced sealed classes (standard), `switch` pattern matching (preview).

```java
public class SwitchPatternMatching {
    public static void main(String[] args) {
        Object obj = 123;

        String result = switch (obj) {
            case Integer i -> "Integer " + i;
            case String s -> "String " + s;
            default -> "Unknown";
        };

        System.out.println(result);
    }
}
```

---


---

### **Java 18 (March 2022)**
**Key Features**:
1. **UTF-8 as default charset**: All `String` operations use UTF-8 by default.
2. **Simple Web Server**: Java 18 introduces a simple, minimal web server for prototyping.
3. **Vector API (Third Incubator)**: Provides an API for expressing vector computations.

**Code Example: Simple Web Server**

```java
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class SimpleWebServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", exchange -> {
            String response = "Welcome to the Simple Web Server in Java 18!";
            exchange.sendResponseHeaders(200, response.length());
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });
        server.start();
        System.out.println("Server started at http://localhost:8000");
    }
}
```

---

### **Java 19 (September 2022)**
**Key Features**:
1. **Virtual Threads (Preview)**: Introduced virtual threads as part of Project Loom to simplify concurrent programming.
2. **Structured Concurrency (Incubator)**: Helps treat a group of related tasks running in different threads as a single unit of work.
3. **Pattern Matching for `switch` (Preview)**: Further enhancements for pattern matching in `switch` statements.

**Code Example: Virtual Threads**

```java
public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Running in a virtual thread!");
        });

        virtualThread.join(); // Wait for the virtual thread to finish
    }
}
```

---

### **Java 20 (March 2023)**
**Key Features**:
1. **Pattern Matching for `switch` (Second Preview)**: Expanded functionality for pattern matching in `switch` statements.
2. **Record Patterns (Preview)**: Allows matching components of records directly in pattern matching.
3. **Scoped Values (Incubator)**: This feature is introduced to improve the handling of local state when using threads.
4. **Foreign Function & Memory API (Third Preview)**: Provides an API to interact with native code and memory efficiently.

**Code Example: Pattern Matching for `switch`**

```java
public class PatternMatchingSwitch {
    public static void main(String[] args) {
        Object obj = 123;

        String result = switch (obj) {
            case Integer i when i > 100 -> "Large Integer: " + i;
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}
```

---

### **Java 21 (Expected September 2023)**
**Planned Features**:
1. **Virtual Threads (Second Preview)**: Further improvements to virtual threads.
2. **Sequenced Collections**: Java 21 introduces interfaces for sequenced collections, providing order-preserving operations.
3. **String Templates (Preview)**: Allows easier string interpolation with embedded expressions.
4. **Pattern Matching for `switch` (Final)**: Pattern matching for `switch` is expected to become a standard feature.
5. **Structured Concurrency (Preview)**: To enhance the coordination of threads working on related tasks.

**Code Example: String Templates (Preview)**

```java
public class StringTemplateExample {
    public static void main(String[] args) {
        String name = "Java 21";
        int year = 2023;

        String message = STR."Welcome to {name}, released in {year}.";
        System.out.println(message);
    }
}
```

---

### **Java 22 (Expected March 2024)**

Java 22 is expected to build on the ongoing improvements in Project Loom (Virtual Threads and Structured Concurrency), Project Panama (Foreign Memory & Function API), and Project Valhalla (value types and primitive classes).

---


package org.example.corejava.exception;

public class Exceptions {
/*
    1. What is an exception in Java?
    invalid user input given program it will be hold the program execution abruptly
    check(Compile Time) and unchecked Exception(Run time)

 */
    private String x;

    public static void main(String[] args) {
        int x = 1, y = 0, z;
        z = x / y;
        System.out.println(z);
    }

    /*
    2. What is the difference between Exception and Error?
     */

    public static class Throwables {
        public static void main(String[] args) {
            try {
                throw new java.lang.Exception("eee");
            } catch (Throwable throwable) {
                System.out.println("Throwable::" + throwable.getMessage());
            }
        }
    }

    /*
   3.  What are checked and unchecked exceptions?
    1. Checked (Compile Time Exception):When u run .java file compile to .class file is called exception.
    IOException,SQL Exception,Class Cast Exception
    2. Unchecked Exception:When you Run .class file
    Arithmetic Exception,Null Pointer Exception, Number Format Exception,ArrayOutOf Bound Exception

    4. Can you explain the exception hierarchy in Java?
                          Throwable
                          |
         -----------------------------------
         |                                 |
     Exception                           Error
         |                                 |
 ---------------------------       ------------------------
 |                         |       |                      |
IOException        RuntimeException  StackOverflowError  OutOfMemoryError
     |                      |
FileNotFoundException   NullPointerException
SQLException            ArrayIndexOutOfBoundsException
IOException             Arithmetic Exception
Class Cast Exception    Number Format Exception,ArrayOutOf Bound Exception
     */



    /*


  5.What are some examples of checked exceptions in Java?

1. **IOException**
   Thrown when there is an input/output failure, such as when reading from a file or network resource.

   try {
       FileReader file = new FileReader("example.txt");
   } catch (IOException e) {
       e.printStackTrace();
   }

2. **SQLException**
   Thrown when there is a database access error or other issues related to SQL operations.
   ```java
   try {
       Connection conn = DriverManager.getConnection(url, user, password);
   } catch (SQLException e) {
       e.printStackTrace();
   }

3. **ClassNotFoundException**
   Thrown when an application tries to load a class through its name but the class cannot be found.
   ```java
   try {
       Class.forName("com.example.MyClass");
   } catch (ClassNotFoundException e) {
       e.printStackTrace();
   }

4. **FileNotFoundException**
   A subclass of `IOException`, thrown when a file with the specified pathname does not exist.
   ```java
   try {
       FileInputStream file = new FileInputStream("notfound.txt");
   } catch (FileNotFoundException e) {
       e.printStackTrace();
   }

5. **InterruptedException**
   Thrown when a thread is interrupted while it's waiting, sleeping, or performing another blocking operation.
   ```java
   try {
       Thread.sleep(1000);
   } catch (InterruptedException e) {
       e.printStackTrace();
   }

6. **NoSuchMethodException**
   Thrown when a particular method cannot be found in a class.
   ```java
   try {
       Method method = MyClass.class.getMethod("nonExistentMethod");
   } catch (NoSuchMethodException e) {
       e.printStackTrace();
   }
   */

    //6. What are some examples of unchecked exceptions in Java?
    public static class ArthmiticssExp {
        //number divided by zero
        public static void main(String[] args) {


            try {
                System.out.println(1);
                int x = 1, y = 0, z;
                z = x / y;
                System.out.println(z);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            System.out.println(2);

        }
    }

    public static class NullPointerexp {
        //when you access non-static member with null reference variable
        private String x;

        public static void main(String[] args) {


            try {
                Exceptions e1 = null;
                int x = Integer.parseInt("abl");
                System.out.println(e1.x);

            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public static class NumberFormatExp {
        //When an invalid string to number conversion is done we get number format in the exception.
        public static void main(String[] args) {
            try {
                String x = "aa";
                int s = Integer.parseInt("qqq");
                System.out.println(s);

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            System.out.println("wwwww");
        }


    }
    /*
    Q7. Can exceptions be used for debugging?
    Yes, exceptions can be used for debugging purposes.
    When an exception is thrown, it provides useful information in the form of a stack trace,
    which helps in identifying where the error occurred.
    This can be helpful during development and debugging to trace the exact point of failure in the code.


*/

    public static class Test {
        public static void main(String[] args) {
            try {
                int[] arr = new int[3];
                arr[5] = 10;  // This will cause ArrayIndexOutOfBoundsException
            } catch (java.lang.Exception e) {
                e.printStackTrace();  // Prints stack trace for debugging
            }
        }
    }

    /*
    Q8. Can we throw an exception from a constructor?
     Yes, we can throw an exception from a constructor.
      When an exception is thrown from a constructor, object creation fails, and control passes to the calling code.
     */

    public static class Constructorss {
        public Constructorss() throws java.lang.Exception {
            System.out.println("Inside Constructor:");
            throw new java.lang.Exception("Exception in Constructor::");
        }

        public static void main(String[] args) {
            try {
                Constructorss test = new Constructorss();
            } catch (java.lang.Exception e) {
                System.out.println("Caught in Exception:" + e.getMessage());
            }
        }
    }
/*. 9. How does the try-catch-finally block work in Java?
The try block contains the code that might throw an exception. The catch block catches and handles the exception.
The finally block executes regardless of whether an exception occurred, often used for resource cleanup.
 */
    public static class Finally {
        int x = 10;

        public static void main(String[] args) {
            try {
                System.out.println(2);
                Integer.parseInt("eee");
                System.out.println("wwwwwwwwww");
            } finally {
                System.out.println(1);
            }
            System.out.println(3);
        }
    }
/*
10. What is the purpose of the finally block?
Finally block is extension of try-catch block ,if extension occurs or not finally block continuous execute
 */
    public static class FinallyWithCatch {
        int x = 10;

        public static void main(String[] args) {
            try {
                System.out.println(2);
                Integer.parseInt("eee");
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                System.out.println("EEEE" + e.getMessage());
            } finally {
                System.out.println(1);
            }
            System.out.println(3);
        }
    }
    /*
 11. Can a finally block be skipped?
yes, some case finally block not execute
a. In try and catch block used system.exist() method finally block not execute.
b. Jvm crash, out of memory.
c. forced fully killed java program.
d. deadlock condition not used finally.
e. shutdown system due to power failure.

12.What happens if an exception is thrown in the finally block?
Explain the behavior if an exception occurs in the finally block.
Answer: If an exception is thrown in the finally block,
it will override any exception thrown in the try or catch block.
The new exception will be propagated.

13.What happens if System.exit() is called in a try block?
When System.exit() is called inside a try block,
the program terminates immediately, bypassing any remaining code in the current method, including:

The rest of the try block.
The catch and finally blocks, even if they are present.
Any remaining code in the call stack.


The finally block will not be executed, even though it usually runs whether an exception occurs or not.
In summary, when System.exit() is called, the JVM shuts down immediately, and no further blocks (catch, finally, or subsequent code) are executed
     */
    public class TestExit {
        public static void main(String[] args) {
            try {
                System.out.println("In try block");
                System.exit(0);  // Terminates the program here
            } catch (java.lang.Exception e) {
                System.out.println("In catch block");
            } finally {
                System.out.println("In finally block");
            }
        }
    }

    public static class FinallyBlockSkip {


        public static void main(String[] args) {
            try {
                System.out.println(2);

                System.exit(0);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                System.out.println("EEEE" + e.getMessage());
            } finally {
                System.out.println(1);
            }
            System.out.println(3);
        }
    }
    /*
 14.   Difference Between final, finally, and finalize()
    final
A final variable can't be changed once initialized.
A final method cannot be overridden by subclasses.
A final class cannot be subclassed or inherited.
   */

    public final static class Finals {
        private final int x = 10;

        public final void test() {
            System.out.println("eeeee");
        }

        public final static class Main {

            Finals finals = new Finals();
            //  finals.test();

        }
    }

    /*
    finalize()
    The finalize() method is called by the garbage collector before an object is destroyed.
    It is used to perform cleanup actions before an object is collected by the garbage collector.


    public static class FinalizeExample {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Finalize method called");
        }

        public void main(String[] args) {
            FinalizeExample obj = new FinalizeExample();
            obj = null;  // Dereference the object so it becomes eligible for GC

            // Suggest garbage collection
            System.gc();

            System.out.println("End of the program");
        }
    }
*/

/*
15. What is try-with-resources in Java?
Introduced in Java 7, try-with-resources is a try statement that automatically closes resources such as files, network connections, etc.,
that implement the AutoCloseable interface.
 It ensures that resources are closed even if an exception is thrown.

 try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    // Code
}
 */

    /*
        Q16. Can we throw an exception from a static block?
        Yes, exceptions can be thrown from a static block.
                However, only unchecked exceptions can be thrown directly from a static block
        because checked exceptions must be either caught or declared in a method signature.
                Since static blocks are not methods, checked exceptions must be handled within the block.


    public static class StaticsBlock {
        static {
            System.out.println("Inside static block");
            throw new RuntimeException("Unchecked exception from static block");
        }

        public static void main(String[] args) {
            System.out.println("This will not execute");
        }
    }
  Q.  17 What happens if System.exit() is called in a try block?
  When System.exit() is called, the JVM will terminate the program, and
  no further code (including catch and finally blocks) will be executed.
     */
    public static class TerminateProgram {
        public static void main(String[] args) {
            try {
                System.out.println("Inside try block");
                System.exit(0); // JVM will terminate here
            } catch (java.lang.Exception e) {
                System.out.println("Inside catch block");
            } finally {
                System.out.println("Inside finally block");
            }
            System.out.println("This will not execute");
        }
    }

    // Q.18 Can you write multi catch block?
// Ans: Yes, We can create more than one catch block in try-catch. We can create child-specific exceptions followed by parent exceptions.
    public static class MultiCatchBlock {
        public static void main(String[] args) {
            try {
                int z = 10 / 0; // This will throw an ArithmeticException
                Integer.parseInt("xyz"); // This will throw a NumberFormatException
                int a1 = (Integer) null; // This will throw a NullPointerException
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Caught NumberFormatException: " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException: " + e.getMessage());
            }
        }
    }
    /*
    Q.19What is the purpose of the assert statement in Java?
     The assert statement is used to create assertions,
     which are conditions that must be true at a certain point in the program.
     If the condition is false, the program will throw an AssertionError.
     Assertions are generally used for testing and debugging purposes.
     */
    public static class Assert {
        public static void main(String[] args) {
            int age = 15; assert age >= 18 : "Age must be at least 18";
            System.out.println("Age is " + age); } }
    //Output when assertions are enabled (-ea flag):

   // Exception in thread "main" java.lang.AssertionError: Age must be at least 18 If assertions are enabled using the -ea flag, this will throw an AssertionError. If assertions are disabled, the program will execute normally.


/*

 Q.20 How are exceptions propagated in Java?
     Exception propagation refers to the process of passing an exception from the method where it occurs to its caller,
    and this continues until it is caught or until it reaches the main method. If not caught, it causes the program to terminate.



    public class  Test { public static void method1() { int data = 10 / 0; // This will cause an ArithmeticException }

        public static void method2() {
            method1();  // method1 is called here
        }

        public static void main(String[] args) {
            try {
                method2();  // method2 is called here
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in main: " + e.getMessage());
            }
        }

 */

}

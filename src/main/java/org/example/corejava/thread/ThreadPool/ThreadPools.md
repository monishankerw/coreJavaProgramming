Here is the information in Markdown format:

```markdown
# Thread Pool in Java

## 1. What is a Thread Pool?
- A **thread pool** is a collection of pre-created threads that handle tasks. Using threads for multitasking gives users the impression that tasks are being processed simultaneously.
- A thread pool is essentially a pool of already created threads that are ready to execute tasks as they come in.
- The thread pool framework in Java is also known as the **executor framework**.

## 2. What is a Fixed Thread Pool, and How is it Created?
- A **fixed thread pool** has a predetermined number of threads.
- You can create a fixed thread pool in Java using `Executors.newFixedThreadPool(int n)`, where `n` is the number of threads.
  
  ```java
  ExecutorService pool = Executors.newFixedThreadPool(3);
  ```

This code creates a pool with 3 threads, meaning only 3 tasks can run at the same time, while other tasks wait in line.

## 3. How Does a Thread Pool Help Prevent an Application from Hanging or Crashing?
- A thread pool limits the number of threads created at any given time, preventing resource overload.
- If more tasks come in than the pool can handle, they are placed in a queue and processed one by one, maintaining application stability.

  **Example**: In a restaurant, if more customers arrive than there are waiters, the extra customers wait in line until a waiter is free, helping the restaurant manage resources effectively and avoid chaos.

## 4. How Does a Thread Pool Reduce the Overhead of Thread Creation?
- Thread pools reduce the **overhead of thread creation** by reusing a set of threads for multiple tasks.
- Without a thread pool, each task would require creating a new thread, which consumes time and system resources.
- By maintaining a pool of reusable threads, the pool minimizes the costly operations associated with creating and destroying threads repeatedly.

## 5. How Does a Thread Pool Enable Loosely Coupled Design?
- A thread pool separates the task creation from task execution. Developers submit tasks to the pool, and it manages their execution, allowing for a more modular and loosely coupled design.

  **Example**: A manager (task creator) assigns tasks to available waiters (thread pool) instead of hiring and managing each waiter directly. This separation keeps the manager’s role distinct from the actual serving work.
```
```
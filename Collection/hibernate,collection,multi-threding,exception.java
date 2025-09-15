🍀 Hibernate – Interview Notes
🔹 What is Hibernate?

Hibernate is an ORM (Object Relational Mapping) framework for Java.

It maps Java objects (classes) to database tables and handles SQL automatically.

Removes the need to write most of the JDBC code manually.






exception handling 





Exception Handling in Java – Interview Notes
🔹 What is an Exception?

An exception is an unwanted event that occurs during program execution and disrupts the normal flow of the program.

Example: divide by zero, accessing null object, file not found, etc.

🔹 Exception Handling

Mechanism to handle runtime errors so the program continues executing without crashing.

Done using try-catch-finally-throw-throws.

🔹 Keywords

try → block of code that may throw an exception.

catch → block that handles the exception.

finally → block that always executes (cleanup code).

throw → used to explicitly throw an exception.

throws → declares exceptions a method might throw.

🔹 Example
public class Test {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This block always executes");
        }
    }
}


✅ Output:

Cannot divide by zero!
This block always executes

🔹 Exception Hierarchy

Throwable

Exception (checked & unchecked)

RuntimeException (NullPointerException, ArithmeticException)

IOException, SQLException, etc.

Error (serious problems, e.g. OutOfMemoryError)

🔹 Checked vs Unchecked Exceptions

Checked → checked at compile-time (e.g. IOException, SQLException).

Unchecked → occur at runtime, not checked by compiler (e.g. NullPointerException, ArithmeticException).

🔹 Important Interview Questions

Difference between throw and throws?

throw → used inside method to throw exception.

throws → used in method signature to declare exception.

Difference between final, finally, finalize?

final → keyword (constant, class, method).

finally → block in exception handling.

finalize() → method called by GC before object is destroyed.

Can we have multiple catch blocks? → Yes, handles different exceptions.

Can we have try without catch? → Yes, if we use finally.







multithreading - 



🚀 Multithreading in Java – Interview Notes
🔹 What is Multithreading?

Multithreading = process of executing multiple threads simultaneously.

Thread = smallest unit of execution inside a process.

Improves CPU utilization.

🔹 Thread vs Process

Process → Independent program, has its own memory space.

Thread → Lightweight, shares memory/resources with other threads in same process.

🔹 Ways to Create a Thread

Extending Thread class

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // start() creates new thread, calls run()
    }
}


Implementing Runnable interface

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running: " + Thread.currentThread().getName());
    }
}
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}


👉 Best practice = use Runnable (because Java supports multiple interfaces, not multiple inheritance).

🔹 Important Thread Methods

start() → starts a new thread.

run() → contains thread logic (called internally).

sleep(ms) → pauses thread for given time.

join() → wait for a thread to finish.

yield() → hint to scheduler to give other threads chance.

isAlive() → checks if thread is still running.

🔹 Thread Lifecycle

New → created but not started.

Runnable → eligible to run, waiting for CPU.

Running → executing.

Waiting/Blocked → waiting for another thread/resource.

Terminated → finished execution.


🔹 Common Interview Questions

Difference between start() and run()?

start() → creates new thread.

run() → executes in same thread, no new thread created.

Difference between Thread and Runnable?

Thread = class, Runnable = interface (preferred).

What is race condition?

When multiple threads access shared data simultaneously without synchronization.

What is deadlock?

Two or more threads waiting for each other’s resource → stuck forever.

Difference between synchronized and volatile?

synchronized → mutual exclusion + visibility.

volatile → only visibility, no locking.






collection 


Interface	Ordered?		Duplicates?	Indexed Access?		Special Feature
List		Yes (insertion)	Yes			Yes					Position-based access
Set			No (unordered)	No			No					Uniqueness of elements
Queue		FIFO            Yes			No					Processing order (queue-like)
Deque		Yes (2 ends)	Yes			No					Insert/remove from both ends
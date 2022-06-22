package multithreading;


import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Multithreading {


// Using an ExecutorService to execute Runnables.


public static void main( String[] args )
{
 // create and name each runnable
   Scenario1 c1 = new Scenario1( "Consumer -1-" );
   Scenario1 c2 = new Scenario1( "Consumer -2-" );
   Scenario1 c3 = new Scenario1( "Consumer -3-" );
   Scenario1 c4 = new Scenario1( "Consumer -4-" );
   Scenario1 c5 = new Scenario1( "Consumer -5-" );

  System.out.println( "Starting Executor" );

// create ExecutorService to manage threads
ExecutorService threadExecutor = Executors.newCachedThreadPool();

// start threads and place in runnable state
threadExecutor.execute( c1 ); // start task1
threadExecutor.execute( c2 ); // start task2
threadExecutor.execute( c4 ); // start task4
threadExecutor.execute( c5 ); // start task5
threadExecutor.execute( c3 ); // start task3



 // shut down worker threads when their tasks complete
threadExecutor.shutdown();


 System.out.println( "Tasks started, main ends.\n" );
 } // end main
 } // end class TaskExecutor



package multithreading;


import java.util.Random;
public class Scenario1 implements Runnable{
 
   // PrintTask class sleeps for a random time from 0 to 6 seconds

private final int sleepTime; // random sleep time for thread
private final String taskName; // name of task
private final static Random generator = new Random();

   // constructor
public Scenario1( String name ){
taskName = name; // set task name

// pick random sleep time between 0 and 6 seconds
sleepTime = generator.nextInt( 6000 ); // milliseconds
} // end PrintTask constructor

// method run contains the code that a thread will execute

public void run(){
try // put thread to sleep for sleepTime amount of time
{
System.out.printf( "%s going to sleep for %d milliseconds.\n",
taskName, sleepTime );

Thread.sleep( sleepTime ); // put thread to sleep

} // end try
catch ( InterruptedException exception )
{
System.out.printf( "%s %s\n", taskName,
"terminated prematurely due to interruption" );
} // end catch

// print task name
System.out.printf( "%s done sleeping\n", taskName );
} // end method run
} // end class PrintTas 


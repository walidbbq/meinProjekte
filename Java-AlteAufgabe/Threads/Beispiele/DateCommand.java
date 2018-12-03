package Beispiele;

import java.util.Date;


 class date implements Runnable
{
  @Override public void run()
  {
    for ( int i = 0; i < 20; i++ )
      System.out.println( new java.util.Date() );
  }
}

class CounterCommand implements Runnable
{
  @Override public void run()
  {
    for ( int i = 0; i < 20; i++ )
      System.out.println( i );
  }
}

public class DateCommand {

	public static void main(String[] args) {
		Thread t1 = new Thread( new date() );
		t1.start();

		Thread t2 = new Thread( new CounterCommand() );
		t2.start();
	}
}

/*
 * Arrivals.java
 *
 * A Thread class to invoke the arrive method for a CarParkControl object.
 * Created on 01 December 2006, 18:38
 *
 * Revised 26 February 2007
 *
 * @author M362 Course Team.
 */

package carparkproblem;

class Arrivals extends Thread
{
    CarParkControl carpark;
    
    Arrivals(CarParkControl c)
    {
        carpark = c;
    }
    
    public void run()
    {
        try
        {
            carpark.arrive();
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread interrupted: exiting without performing arrive");
        }
    }
}

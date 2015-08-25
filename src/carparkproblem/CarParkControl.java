/*
 * CarParkControl.java
 *
 * Created on 01 December 2006, 18:32
 * Revised 26 February 2007
 *
 * A class to control the  parking of cars in a carpark, through methods depart and arrive.
 * 
 * @author M362 Course Team.
 */

package carparkproblem;

public class CarParkControl
{
    protected CarParkCounter spaces;
    protected int capacity;
    
    CarParkControl(int n)
    {
        capacity = n;
        spaces = new CarParkCounter(capacity);
    }
    
    public synchronized void arrive() throws InterruptedException
    {
        while (spaces.getCount() == 0)
        {
            this.wait();
        }
        spaces.decreaseByOne();
        System.out.println("Arrived - free spaces = " + spaces.getCount());

        //signal other processes about change to shared data
        this.notifyAll();
    }    
    
    public synchronized void depart() throws InterruptedException
    {        
        while (spaces.getCount() == capacity)
        {         
                this.wait();       
        }
        spaces.increaseByOne();
        System.out.println("        Departed - free spaces = " + spaces.getCount());

        //signal other processes about change to shared data
        this.notifyAll();
    }    
}

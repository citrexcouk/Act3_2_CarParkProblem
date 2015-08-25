/*
 * CarParkCounter.java
 *
 * A simple counter class to keep track of the number of cars in the car park.
 *
 * Created on 01 December 2006, 21:58
 * Revised 26 February 2007
 *
 * @author M362 Course Team.
 */

package carparkproblem;

public class CarParkCounter
{
    int count;
    
    /** Creates a new instance of CarParkCounter */
    public CarParkCounter(int c)
    {
        count = c;
    }
    
    public int getCount()
    {
        return count;
    }
    
    public void increaseByOne()
    {
        count ++;
    }
    
    public void decreaseByOne()
    {
        count --;
    }
}

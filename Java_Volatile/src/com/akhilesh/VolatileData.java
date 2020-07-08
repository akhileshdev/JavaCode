package com.akhilesh;

public class VolatileData 
{
     private volatile int counter = 0;
     
     public int getCounter()
     {
    	 return counter;
     }
     
     public void increaseCounter()
     {
    	 ++counter;
     }
}

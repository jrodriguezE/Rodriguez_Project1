/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanita
 */
public class CalculationsClass
{
    // Constant 10 is the numbers allow
   final int TOTAL_ENTRIES = 10;
           
        // Method Name: getMean
        // Method Author: Juana Rodriguez
        // Purpose of the Method: Calculate the mean 
        // Return Value: meanAnswer 
        // Value to be returned: double
        // Date: 9/5/2017
    public double getMean(int numbers[])
    {  
        // holds the mean answer
        double meanAswer;
        // holds the total number 
        int total = 0;
       /*
           Loop Name: for loop
           Author Name: Juana Rodriguez
           Purpose of the loop: Will iterate once every element
           in the array to get values         
           Date: 9/5/2017          
        */         
        for (int i= 0; i < numbers.length; i++)
        {
            total += numbers[i]; 
        }
        // Calculate mean
        // Divides the total number by the sum of all numbers
        meanAswer = (double)total / numbers.length;
        
        // Returns the meanAnswer as a double
        return meanAswer;         
    }       
        // Method Name: getDeviation
        // Method Author: Juana Rodriguez
        // Purpose of the Method: Calculates the standard deviation
        // Return Value: standardDeviation
        // Value to be returned; double
        // Date: 9/5/2015
   public double getDeviation(int[] numbers)
    {
        // local Variables
        // Hods the mean 
        // Author: Juana Rodriguez
        double mean;
        // Hods the  standardDeviation
        // Author: Juana Rodriguez        
        double standardDeviation =0;
        // Hods the  sum to calculate standardDeviation
        // Author: Juana Rodriguez  
        double sum = 0;
        // Get the mean from the numbers
        mean = getMean(numbers);
        /*
           Loop Name: for loop
           Author Name: Juana Rodriguez
           Purpose of the loop: Will iterate once every element
           in the array. To subtract the mean to each number and pow           
           Date: 9/5/2017          
        */         
        for (int i= 0; i < numbers.length; i++)
        {
        // Method Name: Math.pow
        // Method Author: Juana Rodriguez
        // Purpose of the Method:The Math.pow() funtion returns the base to exponent power
        // Return Value: sum
        // Date: 9/5/2017       
           sum += Math.pow(numbers[i] - mean, 2);
        }
        // Method Name:Math.sqrt
        // Method Author: Juana Rodriguez
        // Purpose of the Method: calculates the standardDeviation
        // Return Value: standardDeviation

        // Date: 9/5/2017
        standardDeviation = Math.sqrt(sum/numbers.length - 1);
        
        // rEturns the standardDeviation 
        // As double
        return standardDeviation;
     
        
   }
}

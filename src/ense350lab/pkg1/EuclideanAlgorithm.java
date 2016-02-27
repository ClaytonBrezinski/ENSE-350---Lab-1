/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense350lab.pkg1;
import java.util.*;
/**
 *
 * @author Dolan
 */
public class EuclideanAlgorithm
{
    public EuclideanAlgorithm()
    {
        
    }
    public ArrayList<Integer> runEuclideanAlgorithm(int a, int b)
    {
        // assert that a > b
        if (a < b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        
        //begin GCD loop
        ArrayList<Integer> placeHolder = new ArrayList<>();
        placeHolder.add(1);
        placeHolder.add(1);
        int tempA = a;
        int tempB = b;
        
        while (goSmaller(placeHolder.get(1)) != false)
        {
            placeHolder.clear();
            placeHolder = GCD(tempA,tempB);
            // next value to use as A will sit in placeHolder[0]
            // remainder will sit in placeHolder[1]
            if (placeHolder.get(1) == 0)
            {
                break;
            }
            
            tempA = placeHolder.get(0);
            tempB = placeHolder.get(1);
        }
        System.out.println("GCD(" + a + "," + b + ") = " + tempB); 
        
        ArrayList<Integer> returnList = new ArrayList<Integer>();

        returnList.add(a);
        returnList.add(b);
        return returnList;
    }
    private ArrayList<Integer> GCD (int a, int b)
    {
        //Preform the actions of GCD
        int numOfDivides = a/b;
        int remainder = a%b;  
        int newA = b;
        
        // setup for sending back to "main"
        ArrayList<Integer> ret = new ArrayList<>();
        ret.add(newA); 
        ret.add(remainder);
        return ret;
    }
    private boolean goSmaller(int remainder)
    {
        if (remainder == 0)
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
}

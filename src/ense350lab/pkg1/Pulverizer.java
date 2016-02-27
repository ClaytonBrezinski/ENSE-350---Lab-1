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
public class Pulverizer
{
    public Pulverizer()
    {
        
    }
    public ArrayList<Integer> runPulverizer(int a, int b)
    {
        // assert that a > b
        if (a < b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        
        // set up for the pulverizer
        int s = 0;
        int t = 0;
        EuclideanAlgorithm one = new EuclideanAlgorithm();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = one.runEuclideanAlgorithm(a, b);
        
        // the pulverizer algorithm itself.
        
        ArrayList<Integer> Alist = new ArrayList<Integer>();
        ArrayList<Integer> Blist = new ArrayList<Integer>();
        ArrayList<Integer> Rlist = new ArrayList<Integer>();
        
        AMinusQBEqualsR(a,b);
        
        System.out.println("Sa + Tb, S = "  + s + " T = " + t);
        
        return list;
    }
    /*
     * A in [0], B in [1], C in [2]
     */
    private ArrayList<Integer> AMinusQBEqualsR(int a, int b)
    {
        int tempA = a;
        int tempB = b;
        int r;
        int Q;
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        
        //get Q and then determine R
        Q = determineQ(tempA,tempB);
        r = tempA - Q * tempB;
       
        //set new A and new B
        tempA = tempB;
        tempB = r;
        
        
        return returnList;
    }
    private int determineQ(int a, int b)
    {
        int tempA = a; int tempB = b; int q = 0;
        int result = tempA - tempB;
        
        if (result == 0)
        {
            return 1;
        }
        else
        {
        while (result > 0)
        {
            result = result - tempB;
            q++;
        }
        
        return q;
        }
        
    }
}

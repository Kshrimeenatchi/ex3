/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex3;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class rond {
    
public static void main(String[] arg){
        int c;
        Scanner obj=new Scanner(System.in);
      
        System.out.println("enter the number...");
        double a=obj.nextDouble();
       
        System.out.println("nearest number ="+round.nint(a));
    }
}
class round
{
    static int nint(double a)
    {
        int j;
        j=(int) Math.round(a);
        return j;
    }
}


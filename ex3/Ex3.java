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
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic class bool {

        Scanner obj=new Scanner(System.in);
        majority m=new majority();
        boolean e;
        System.out.println("enter the boolean values:");
        boolean a=obj.nextBoolean();
        boolean b=obj.nextBoolean();
        boolean c=obj.nextBoolean();
       e=m.major(a,b,c);
       System.out.println("majority="+e);
             
    }
}
class majority
{  
   
    boolean major(boolean a,boolean b,boolean c)
    {
        if((a&&b)||(b&&c)||(c&&a))
        {
            
          return true;
        }
        else
           return false;

    }
}
    


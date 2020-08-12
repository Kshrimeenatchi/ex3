/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex3;

/**
 *
 * @author asus
 */
public class coun {
    public static void main(String[] arg){
        System.out.println("first call:");
        sample obj1=new sample();
        obj1.incrt();
        System.out.println("second call:");
        sample obj=new sample();
        obj.incrt();
    }
   
}
class sample
{
    static int i=10;
    int j=20;
    void incrt()
    {
        i=i+1;//with static
        j=j+1;//without static
        System.out.println("static variable="+i+"\non-static variable="+j);
    }
}

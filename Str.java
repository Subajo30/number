/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package str;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Str {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        //String s1=new StringBuffer(str).reverse().toString();
        //System.out.println("Reverse String="+s1);
        char[] a=s1.toCharArray();
        char[] b=s1.toCharArray();
        int i;
        for(i=0;i<s1.length();i++)
        {
        if(a[i]%2!=0)
        {
            s1=s1.replace(b[i],a[i]);
            System.out.println("result="+s1);
        }
        else
        {
            s1=s1.replace(a[i],b[i]);
            System.out.println("ANs="+s1);
           
           // System.out.println("STRING="+s1);
        }
        }
    }
}
    
    


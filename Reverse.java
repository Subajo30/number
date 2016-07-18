/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String="+str1);
        
    }
}

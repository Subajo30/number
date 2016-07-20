/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reversedigit;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ReverseDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d,r=0,d1 = 0;
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int Gno=sc.nextInt();
        while(Gno>0)
        {
            d=Gno%10;
            r=r*10+d;
            Gno=Gno/10;
        }  System.out.println("reversedigit="+r);
        
        
    }
}

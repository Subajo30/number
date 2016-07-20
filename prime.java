
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class prime {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                break;
            }
            if(i==j)
            {
                System.out.println("prime="+i);
            }
        }
        
    }
    
}

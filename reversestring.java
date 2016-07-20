
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s1=new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String="+s1);
        char[] a=s1.toCharArray();
        int i = 0;
        for(i=0;i<s1.length();i++)
        {
        if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
        {
            s1=s1.replace(a[i],'\0');
        }
            System.out.println("STRING="+s1);
        }
    }
    
}

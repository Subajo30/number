
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class NewClass5 {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    int n=sc.nextInt();
    int len=str1.length();
    String[] str2=new String[len-n+1];
    
    int i;
    for(i=0;i<str2.length;i++)
    {
      str2[i]=str1.substring(0, n);
      str1=str1.substring(1);
      //System.out.println(s1);
      
    }
Arrays.sort(str2); 
for( i=0;i<str2.length;i++)
System.out.println(str2[i]);
    
  
  System.out.println("smaller" +"   "+str2[0]);
  System.out.println("larger"+"     "+str2[str2.length-1]);
  }

}
    


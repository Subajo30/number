/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
	
		int i;
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
	 int len=text.length()-1;

		char letter = 0;
		for(i=0; i<text.length(); i++)
		{
		    letter = text.charAt(i);
		    if(letter>='A' && letter<='Z')
		        System.out.println((int)letter - 'A'+1);
		    if(letter>='a' && letter<= 'z')
		        System.out.println((int)letter - 'a'+1);
                }
                for(i=len;i>=0;i--)
                {
                    int a=i;
                    
                }System.out.println("last char="+i);
                char s=(char) (letter+i);
                System.out.println("alpha="+s);


	}
}




    


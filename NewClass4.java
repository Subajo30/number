
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class NewClass4 {
   



	static int var;
	public static void main(String[] args)
	{
		String str;
		int get=0,fin1,finn1,finn12;
		int fin=0;
		char get1;
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		char[] ch=str.toCharArray();
		int n=str.length();
		for(char c:ch)
		{
			int i=(int)c;
			if(ch[n-1]>=97&&ch[n-1]<=122)
			{
				var=(int)ch[n-1]-96;
			}
			if(i>=97&&i<=122)
			{
				get=i-96;
			
			
			 fin=get-var;
			
			if(fin<=0)
			{
				fin1=fin+26;
				finn1=fin1+96;
				
				get1=(char)finn1;
				System.out.print(get1);
			}
			else if(fin>0)
			{
				finn12=fin+96;
				
				get1=(char)finn12;
			System.out.print(get1);
			}
			}
		
			else if(i>=65&&i<=90)
			{
				get=i-64;
				
			if(ch[n-1]>=65&&ch[n-1]<=90)
			{
				var=(int)ch[n-1]-64;
				
			}
			
			fin=get-var;
		
			if(fin<=0)
			{
				fin1=fin+26;
				//System.out.println(fin1);
				finn1=fin1+64;
				//System.out.println(finn1);
				get1=(char)finn1;
				System.out.print(get1);
			}
			else if(fin>0)
			{
				finn12=fin+64;
				
			 get1=(char)finn12;
			System.out.print(get1);
			if(get==ch[n-1])
			{
				System.out.println(get);
			}
			}
		}

			
		}
		
	}
	}
    


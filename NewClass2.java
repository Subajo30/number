
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class NewClass2 {
   


public static void main(String[] args)
{
int a[]=new int[5];
int i=0;
int b[]=new int[30];
int j=0;
int c[]=new int[30];
int n,k;
int[] len;
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("Enter the array values");
for(i=0;i<5;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<5;i++)
{
while(a[i]>0)
{
b[j++]=a[i]%2;
a[i]=a[i]/2;
}
}
for(j=i-1;j<n;j++)
{
System.out.println(b[j]);
}
for(j=0;j<5;j++)
{
 c[k]=b[j].split("0");
System.out.println("after splitting:" +c[k]);
}
for(k=0;k<5;k++)
{
len[]=new int[c[k].length()];
System.out.println("length is :"+len[k]);
}
int e=0,f=0;
int temp;
for(e=0;e<5;e++)
{
for(f=0;f<5;f++)
{
if(len[e]>len[f])
{
temp=len[e];
len[e]=len[f];
len[f]=temp;
}
}
}
System.out.println("Array in decreasing order "+len[f]);
}
}


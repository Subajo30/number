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
public class news {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
            char[] a={'1','2','3','4','3','2','1'};
    char[][] b=new char[7][7];
    int i,k=0,j;
    for(i=0;i<7;i++){
       b[i][i]=a[k];
       b[7-i-1][i]=a[k];
       k++;
    }
    for(i=0;i<7;i++){
        for(j=0;j<7;j++){
            System.out.println(b[i][j]);
    }
       // System.out.println("\t");
    }
}
    }
    


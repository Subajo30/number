/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class NewClass3 {
        public static void main(String[] args) {
        int i,j,k=0;
        for(j=0;j<50;j++){
        for(i=0;i<50;i++){
            if(i+j==25 && i-j==13){
                System.out.println(i+" "+j);
               k=i*j; 
            }
        }
    }
        System.out.println("product is:"+k);
}
}


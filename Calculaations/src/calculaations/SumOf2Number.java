
package calculaations;

import java.util.Scanner;

public class SumOf2Number {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st nember: ");
        a=input.nextInt();
        System.out.println("Enter 2nd Number: ");
        b=input.nextInt();
        c=a+b;
        System.out.println("Sum is: "+c);
     
    }
    
}
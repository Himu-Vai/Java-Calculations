
package calculaations;

import java.util.Scanner;


public class AddSubMulDiv {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int a,b,sum,c,d,sub,e,f,mul;
        float g,h,div;
        
        System.out.println("Enter 1st number:");
        a=input.nextInt();
        System.out.println("Enter 2nd Number:");
        b=input.nextInt();
        sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" is : "+sum);
        
        System.out.println("Enter 1st Number:");
        c=input.nextInt();
        System.out.println("Enter 2nd Number:");
        d=input.nextInt();
        sub=c-d;
        System.out.println("The subtraction of "+c+"and "+d+"is"+sub);
        
        System.out.println("Enter 1st Number:");
        e=input.nextInt();
        System.out.println("Enter 2nd Number:");
        f=input.nextInt();
        mul=e*f;
        System.out.println("The multiplication of "+e+"and "+f+" is:"+mul);
        
        System.out.println("Enter 1st Number:");
        g=input.nextFloat();
        System.out.println("Enter 2nd Number:");
        h=input.nextFloat();
        div=(float)g/h;
        System.out.println("The multiplication of "+g+"and "+h+" is:"+div);
        
        
       
        
    }
    
}

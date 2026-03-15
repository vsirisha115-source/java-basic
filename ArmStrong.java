import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num value to check armstrong:");
        int num=sc.nextInt();
        int temp=num;
        int cubic=0;
        while (num!=0) {
            int lastdigit=num%10;
            cubic =cubic+(lastdigit*lastdigit*lastdigit);
            num/=10;
            
        }
        System.out.println((temp==cubic)? "It is a Armstrong number":"It is not an Armstrong number");

    }
    
}

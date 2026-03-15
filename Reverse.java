import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num value :");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0){
            int lastdigit=num%10;
            rev=(rev*10)+lastdigit;
            num/=10;
        }
        System.out.println("Reverse of number:"+rev);
    }
}


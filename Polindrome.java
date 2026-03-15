import java.util.Scanner;
public class Polindrome{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num value which is to check polindrome or not:");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0){
            int lastdigit=num%10;
            rev=(rev*10)+lastdigit;
            num/=10;
        }
        System.out.println((temp==rev)?"it is a polindrome":"It ia not a polindrome");
    }
}
import java.util.Scanner;
public class sumdigit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int sum=0;
        for(;num!=0; num=num/10){
            int digit=num%10;
            sum+=digit;  
        }
        System.out.println(sum);
    }
}

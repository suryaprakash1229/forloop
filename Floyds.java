import java.util.Scanner;
class Floyds{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("input");
        int num=sc.nextInt();
        int n=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println("");
        }
    }
}
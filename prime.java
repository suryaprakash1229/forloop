public class prime {
    public static void main(String[]args){
        for(int i=10;i<=99;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                     count=1;
                     break;
                }
            }
            if(count==0){
            System.out.println(i);
        }
        
        }
    }
}

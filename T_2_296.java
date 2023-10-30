public class T_2_296 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){//as the rows+colum if is even then  in printing value is 1
                    System.out.print("1"+" ");
                }
                else{ //vice versa if rows + colum is odd then in printing value is 0
                    System.out.print("0"+" ");
                }
                
            }
            System.out.println();
        }
    }
}

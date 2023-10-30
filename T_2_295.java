public class T_2_295 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            //inner loop
            int num=(n-i+1); //for the inner loop tracking num 
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++; //increasing inner loop number as rows
            }
            System.out.println();
        }

    }
}

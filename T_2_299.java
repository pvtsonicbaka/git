public class T_2_299 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print("L"+" ");
                }
                else{
                    System.out.print("J"+" ");
                }
            }
            
            System.out.println();
        }

    }
}

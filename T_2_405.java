import java.util.Scanner;

public class T_2_405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type N and M for N X m matrix:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int A[][] = new int[n][m];
        int B[][] = new int[m][n];
        System.out.println("type ur array ");
        
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
            A[n][m] =sc.nextInt();
            }
        }
        
        
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++)
            B[m][n]=A[m][n];
            System.out.println();
        }sc.close();
        for(int[] i:B){
            for(int k:i){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}

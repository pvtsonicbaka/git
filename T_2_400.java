import java.util.Scanner;

public class T_2_400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++)
            A[i][j] =sc.nextInt();
        }
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++)
            B[i][j] =sc.nextInt();
        }
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++){
                for(int k=0;k<A.length;k++){
                     C[i][j]+=(A[i][k]*B[k][j]) ;
                }
            }
            
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                System.out.print(C[i][j]);
            }
            System.out.println();
        }

    
    sc.close();
    }
}

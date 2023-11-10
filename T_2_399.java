import java.util.*;
public class T_2_399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[5][5];
        int B[][] = new int[5][5];
        int C[][] = new int[5][5];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++)
            A[i][j] =sc.nextInt();
        }
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++)
            B[i][j] =sc.nextInt();
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++)
            C[i][j] =A[i][j]+B[i][j];
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++)
            System.out.println(C[i][j]);
        }

        sc.close();
    }
}

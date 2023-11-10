import java.util.Scanner;

public class T_2_403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[2][2];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++)
            A[i][j] =sc.nextInt();
        }
       
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++)
            System.out.print(A[j][i]);
            System.out.println();
        }
        sc.close();

    }
}

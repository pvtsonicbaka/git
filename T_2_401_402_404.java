import java.util.Scanner;

public class T_2_401_402_404 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int A[][] = new int[2][2];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++)
            A[i][j] =sc.nextInt();
        }
        int max=A[0][0],min=A[0][0],zeros=0,Positive=0,negative=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if (A[i][j] > max) {
                    max = A[i][j];
                }
                if (A[i][j] < min) {
                    min = A[i][j];
                }
                if (A[i][j] < 0) {
                    negative++;
                }
                if (A[i][j] > 0) {
                    Positive++;
                }
                if (A[i][j] ==  0) {
                    zeros++;
                }
            }
            
        }
        System.out.println("min:"+min +" max:"+max+" zeros:"+zeros+" positive:"+Positive+" negative:"+negative);
        sc.close();
    }
}

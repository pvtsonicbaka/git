import java.util.*;
class T_2_398{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[3][3];
        
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                A[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int[] i:A){
            for(int j:i)
            System.out.print(j);
            System.out.println();
        }
        sc.close();

    }
}
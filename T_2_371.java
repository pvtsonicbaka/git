import java.util.Scanner;
public class T_2_371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[]{1,2,3,4,5};
        int B[] =new int[]{7,1,1,5};
        for(int i=0;i<A.length;i++){
            
            for(int j=0;j<B.length;j++){
                
                if(A[i]==B[j]){
                    
                    System.out.println(A[i]);
                }
            }
        }
        sc.close();
    }
}

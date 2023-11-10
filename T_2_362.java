import java.util.*;
class T_2_362{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[4];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        int Even=0,odd=0,k=0,j=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0 && k==0){
                k++;
             Even = A[i];
            }
            if(A[i]%2!=0 && j==0){
                j++;
             odd = A[i];
            }
            if(Even < A[i] && A[i]%2 ==0){
                Even = A[i];
            }
            if(odd < A[i] && A[i]%2 !=0){
                
                odd = A[i];
            }

        }
        for(int i:A){
            System.out.println(i);
        }
        System.out.println("ODD: "+odd+"even "+Even);
        sc.close();
    }


}
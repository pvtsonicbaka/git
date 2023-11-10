import java.util.*;
public class T_2_370 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int arr[] = {1,2,3,3,4,4,5};
        for(int i=0;i<arr.length;i++){
            
            int flag =1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                   flag =0 ;
                }
                
            }
            if(flag ==1)
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}

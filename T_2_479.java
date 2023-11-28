
import java.util.Scanner;

public class T_2_479 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String arr[] = a.split( " ");
        for(int i=0;i<arr.length;i++){
        String rev ="";
            for(int j=arr[i].length()-1;j>=0;j--)    {
                rev+=arr[i].charAt(j);
            }            
        System.out.print(rev + " ");    
        }
        
    }

}

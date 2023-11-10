import java.util.*;
public class T_2_407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows");
        int n = sc.nextInt();
        sc.close();
        int a[][]=new int[n][];
        for(int i=0;i<n;i++){
             a[i]=  new int[i];
        }
        int num=1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = num++;
            }
        }
        for(int i[]:a){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

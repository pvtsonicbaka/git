import java.util.Scanner;
public class T_2_298 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows to be printed");
        int n=sc.nextInt();
        int num=1; //declared outer cuz its not changing in every row 
        for(int i=1;i<=n;i++ ){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;//increasing the num
            }
            System.out.println();
        }
        sc.close();//ignore this 

    }
}

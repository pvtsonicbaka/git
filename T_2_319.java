import java.util.*;
public class T_2_319 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("TYPE N");
        int n = sc.nextInt();
        System.out.println("Type range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if((i % n) ==0)System.out.println(i);

        }
        sc.close();
    }
}

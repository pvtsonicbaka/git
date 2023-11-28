import java.util.Scanner;

public class T_2_485 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String  s = "helllo world java";
        
        char delete =  sc.next().charAt(0);
        String a="";
        for(int i=0;i<s.length();i++ ){
            if(delete != s.charAt(i))
            a+=s.charAt(i);
        }
        System.out.println(a);
    }
}

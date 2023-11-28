import java.util.Scanner;

public class T_2_477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(),reverse ="";
        for(int i =0;i<s.length();i++){
            reverse+=s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println("true");
        }
        sc.close();
    }
}   

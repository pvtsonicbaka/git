import java.util.Scanner;

public class T_2_483_484 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String  s = "helllo world java";
        int count =0,ocuur=0;
        char occurence =  sc.next().charAt(0);
        for(int i=0;i<s.length();i++){
            count++;
            if(occurence == s.charAt(i)) {
                ocuur++;
            }
        }
        System.out.println("oocurence:"+ ocuur +" count:"+count);
    }
}

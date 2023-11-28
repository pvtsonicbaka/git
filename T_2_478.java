import java.util.Scanner;

public class T_2_478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int vowel = 0;

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)== 'a'||input.charAt(i)=='e' ||input.charAt(i)=='i' ||input.charAt(i)=='o' ||input.charAt(i)=='u' ){
                vowel++;
            }
        }
        System.out.println(vowel);
        sc.close();
    }
}

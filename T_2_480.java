public class T_2_480 {
    public static void main(String[] args) {
        String  a ="Hello world";
        char c[] = new char[a.length()] ;
        for(int  i=0;i<a.length();i++){
            c[i]= a.charAt(i);
        }
        for(char i:c){
            System.out.println(i);
        }
    }
}

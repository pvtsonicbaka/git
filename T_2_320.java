public class T_2_320 {
    public static void main(String[] args) {
        int n=4;double num=3,sum=1;
        for(int i=1;i<n;i++){
            sum=sum+(num/(num+2));
            num+=2;
        }
        System.out.println(sum);
    }
}

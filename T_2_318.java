public class T_2_318 {
    public static void main(String[] args) {
        int n=100,sum_for=0,sum_while=0,sum_do_while=0;
        for(int i=1;i<=n;i++){
            sum_for+=i;
        }
        while(n>0){
            sum_while+=n;
            n--;
        }
        int m=100;
        do{
            sum_do_while+=m;
            m--;
        }
        while(m >0);
        System.out.println(sum_for+" "+sum_do_while+" "+sum_while);
    }
}

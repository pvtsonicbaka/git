public class T_2_322 {
    public static void main(String[] args) {
        int n=135,not_n=0,dupliacte=n,n_length=0,duplicate_2=n;
        while(duplicate_2!=0){//to find length
            n_length++;
            duplicate_2/=10;
        }
        for(int i=n_length;n!=0;i--){ //for 1^1 + 3^2 + 5^3 operation
            not_n = not_n+ (int)Math.pow((n%10), i);
            n/=10;
        }
        if(dupliacte == not_n){
            System.out.println("disarium num");
        }

      
    }
}

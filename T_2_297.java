public class T_2_297 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int num_even=2;//for tracking and initilizing even num after every inner loop
            int num_odd =1;//for tracking and initilizing odd num

            for(int j=1;j<=i;j++){//inner loop

                if(i%2==0){  //cuz even rows pring even num
                    System.out.print(num_even);
                }
                else{   //cuz even rows pring even num
                    System.out.print(num_odd);
                }
                num_even+=2; //increasing for next odd or even num
                num_odd+=2;
            }
            System.out.println();

        }

    }
}

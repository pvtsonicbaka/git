class T_2_293{
    public static void main(String[] args) {
        int n=5;
        
        for(int i=1;i<=n;i++){
            char carac = 'A';//is taken inside loop cause of 2nd decrement loop
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //printing num or chartacter
            for(int  j=1;j<=i;j++){
                //numbers
                if(i%2!=0){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print(carac + " ");
                    carac++;
                }
                
            }
            System.out.println();
        }
    }
}
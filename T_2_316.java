class T_2_316{
    public static void main(String[] args) {
        int num = 1245,first=0,last=0;
        first = num %10;//simply last digit
        while (num!=0) {//running the loop until i get the only one value of num
            last = num %10;
            num/=10;
        }
        System.out.println(first + last);
    }

}
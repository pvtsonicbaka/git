public class T_2_317 {
    public static void main(String[] args) {
        //conding generalize case for armstrong
        int num=1634,num_length=0;
        int duplicate_1=num,duplicate_2=num;
        while(num !=0){//getting the length of an num in case 1234 num_length is 4
            num/=10;
            num_length++;
        }
        int num_armstrong=0;
        while(duplicate_1!=0){//for checking the armstrong condition 
            
            num_armstrong= num_armstrong +(int) Math.pow((duplicate_1%10)  , num_length);
            duplicate_1/=10;
        }
        if(duplicate_2 == num_armstrong){///checking num via dupliacte_2 is armst or not
            System.out.println("ARMSTRONG NUM");
        }
        else if (duplicate_2 != num_armstrong){
            System.out.println("NOT an ARMstrong");
        }
        else{
            System.out.println("invalid");
        }
    }


    
}

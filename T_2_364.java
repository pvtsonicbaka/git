public class T_2_364 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int sum=0,max=arr[0];
        for(int i:arr){
            sum+=i;
            if(i>max){
                max = i;
            }
        }
        System.out.println("max "+max+"sum "+sum+"avg "+(sum/arr.length));
    }
}

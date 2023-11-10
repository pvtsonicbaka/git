public class T_2_363 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,4,0,5};
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }

}

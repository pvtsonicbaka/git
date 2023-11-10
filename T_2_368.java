public class T_2_368 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,0};
        int c[]= new int[5];
        for(int i=0;i<a.length;i++){
             c[i]= a[i]+b[i];
        }
        for(int i:c){
            System.out.println(i);
        }
    }
}

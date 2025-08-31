public class ArrayMystery {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int result = 0; 

        for (int i = 0; i< arr.length; i++){
            arr[i] = arr[i] + i;
        }
        for (int i = arr.length - 1; i>= 0; i-= 2){
            result +=arr[i];

        }
        System.out.println(result);
    }
    
}

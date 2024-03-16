package Java.Basic_Programs;

public class Mountain_array {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,4,3,2,1};
       int peak = peak(arr);
        System.out.println("Peak element in mountain array is "+peak);
    }
    public static int peak(int[] arr)
    {
        int s = 0;
         int e = arr.length-1;
         while(s!= e)
         {
             int m = s+(e-s)/2;
             if(arr[m] < arr[m+1])
                 s = m+1;
             if(arr[m] > arr[m+1])
                 e = m;
         }
         return arr[s];
    }

}

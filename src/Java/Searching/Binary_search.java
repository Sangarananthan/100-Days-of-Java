package Java.Searching;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,8,11,14,21,34,50};
        System.out.println(binarySearch(arr,21));
    }
    public static int binarySearch(int[] arr , int target)
    {
        int s = 0;
        int e = arr.length;
        while(s <= e)
        {
            int mid = s+(e-s)/2;
            if(arr[mid] < target)
            {
                s = mid+1;
            }
            else if(arr[mid] > target)
            {
                e = mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
}

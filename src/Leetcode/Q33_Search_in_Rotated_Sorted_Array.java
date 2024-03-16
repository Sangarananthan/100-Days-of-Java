package Leetcode;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Q33_Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(search(arr, 5));

    }

    static public int search(int[] nums, int target) {
        int peak = peak(nums);
        if (nums[0] < nums[nums.length - 1])
            return Bsearch(nums, 0, nums.length - 1, target);
        else if (nums[0] <= target)
            return Bsearch(nums, 0, peak, target);
        else
            return Bsearch(nums, peak + 1, nums.length - 1, target);
    }

    static public int Bsearch(int[] arr, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return -1;
    }

    static public int peak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (mid > s && arr[mid] < arr[mid - 1])
                return mid - 1;
            else if (mid < arr.length - 1 && arr[mid] > arr[mid + 1])
                return mid;
            else if (arr[s] >= arr[mid] && arr[mid] < arr[e])
                e = mid - 1;
            else if (arr[s] <= arr[mid])
                s = mid + 1;
        }
        return e;
    }
}

package Leetcode;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class Q81_Search_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {

    }

    static public boolean search(int[] nums, int target) {
        if (nums.length == 1)
            return nums[0] == target;
        int peak = peak(nums);
        if (peak == -1)
            return binary(nums, target, 0, nums.length - 1);
        boolean ans;
        ans = binary(nums, target, 0, peak);
        if (!ans)
            return binary(nums, target, peak + 1, nums.length - 1);
        return ans;

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
            else if (arr[mid] == arr[s] && arr[mid] == arr[e]) {
                if (s < arr.length - 1 && arr[s] > arr[s + 1])
                    return s;
                s++;
                if (arr[e] < arr[e - 1])
                    return e - 1;
                e--;
            } else if (arr[s] > arr[mid])
                e = mid - 1;
            else
                s = mid + 1;
        }
        return e;
    }

    static public boolean binary(int[] arr, int target, int s, int e) {

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return false;
    }
}

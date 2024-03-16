package Leetcode;

//https://leetcode.com/problems/find-in-mountain-array/description/
public class Q1095_Find_in_Mountain_Array {
    public static void main(String[] args) {

    }

    interface MountainArray {
        public int get(int index);
        public int length();
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeakIndex(mountainArr);

        // Search in the increasing part of the array
        int increasingIndex = binarySearchIncreasing(mountainArr, target, 0, peakIndex);
        if (increasingIndex != -1) {
            return increasingIndex;
        }

        // Search in the decreasing part of the array
        return binarySearchDecreasing(mountainArr, target, peakIndex + 1, mountainArr.length() - 1);
    }

    private int findPeakIndex(MountainArray mountainArr) {
        int left = 0, right = mountainArr.length() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int binarySearchIncreasing(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearchDecreasing(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

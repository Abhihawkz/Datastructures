public class SearchInsortedArray {
    static int binarySearch(int[] arr, int start, int end, int x) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] < x) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    static int findPivot(int[] arr, int start, int end) {
        while (start < end) {
            if (arr[start] <= arr[end])
                return start;

            int mid = (start + end) / 2;

            if (arr[mid] > arr[end])
                end = mid + 1;
            else
                start = mid;
        }

        return end;
    }

    static int search(int[] arr, int target) {
        int n = arr.length;
        int pivot = findPivot(arr, 0, n - 1);

        if (arr[pivot] == target)
            return pivot;
        if (pivot == 0)
            return binarySearch(arr, 0, n - 1, target);

        if (arr[0] <= target)
            return binarySearch(arr, 0, pivot - 1, target);
        return binarySearch(arr, pivot + 1, n - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 8;
        System.out.println(search(arr, target));
    }
}


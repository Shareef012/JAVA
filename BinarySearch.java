class BinarySearch {
    public static void main(String[] args) {
        char arr[] = {'c', 'f', 'j'};
        char target = 'c';
        char ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    public static char binarySearch(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        // Handling edge case where target is greater than the largest element
        if (target >= arr[end]) {
            return arr[0];
        }

        while (start <= end) {
            int mid = start + ( end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Smallest letter greater than target
        return arr[start % arr.length];
    }
}

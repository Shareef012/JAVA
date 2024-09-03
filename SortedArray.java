import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(Arrays.toString(search(arr, 2)));
    }

    public static void binarySearch(int[][] arr, int target, int row, int colStart, int colEnd) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (arr[row][mid] == target) {
                System.out.println(row + " " + mid);
                return;
            }
            if (arr[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
    }

    public static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;

        int rowStart = 0;
        int rowEnd = row - 1;
        int colStart = 0;
        int colEnd = col - 1;

        while (rowStart <= rowEnd) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;
            int colMid = colStart + (colEnd - colStart) / 2;

            if (arr[rowMid][colMid] == target) {
                return new int[]{rowMid, colMid};
            }

            if (arr[rowMid][colMid] > target) {
                rowEnd = rowMid - 1;
                binarySearch(arr, target, rowMid, colStart, colEnd);
            } else {
                rowStart = rowMid + 1;
                binarySearch(arr, target, rowMid, colStart, colEnd);
            }
        }

        return new int[]{-1, -1};
    }
}

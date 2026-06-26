class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // global range check
        if (target < matrix[0][0] || target > matrix[rows - 1][cols - 1])
            return false;

        int rowNum = findRow(0, rows - 1, matrix, target);
        if (rowNum == -1) return false;

        return binarySearch(matrix[rowNum], target, 0, cols - 1);
    }

    int findRow(int start, int end, int[][] matrix, int target) {

        if (start > end) return -1;   // ✅ CRITICAL base case

        int mid = start + (end - start) / 2;

        if (target >= matrix[mid][0] &&
            target <= matrix[mid][matrix[mid].length - 1]) {
            return mid;
        }

        if (target > matrix[mid][0]) {
            return findRow(mid + 1, end, matrix, target);
        } else {
            return findRow(start, mid - 1, matrix, target);
        }
    }

    boolean binarySearch(int[] nums, int target, int begin, int end) {

        if (begin > end) return false;

        int mid = begin + (end - begin) / 2;

        if (nums[mid] == target) return true;

        if (target > nums[mid]) {
            return binarySearch(nums, target, mid + 1, end);
        } else {
            return binarySearch(nums, target, begin, mid - 1);
        }
    }
}

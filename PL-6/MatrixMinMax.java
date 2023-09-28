public class MatrixMinMax {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 5, 8, 15},
            {3, 20, 25, 12},
            {18, 7, 9, 14},
            {22, 19, 6, 11}
        };

        int highest = matrix[0][0];
        int lowest = matrix[0][0];

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > highest) {
                    highest = num;
                }
                if (num < lowest) {
                    lowest = num;
                }
            }
        }

        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
    }
}
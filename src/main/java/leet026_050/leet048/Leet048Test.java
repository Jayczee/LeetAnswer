package leet026_050.leet048;

public class Leet048Test {

    public static void main(String[] args) {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };

        System.out.println("旋转前：");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }

        new Leet048().rotate(matrix);

        System.out.println("\n顺时针旋转90°后：");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }
    }

}

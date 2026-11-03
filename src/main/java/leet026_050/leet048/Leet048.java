package leet026_050.leet048;

public class Leet048 {
    public void rotate(int[][] matrix) {
        int n = matrix.length, round = 0;
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                int tmp1 = matrix[round][round + i];
                for (int j = 0; j < 4; j++) {
                    int nextI1 = round, nextI2 = round;
                    switch (j) {
                        case 0 -> {
                            nextI1 = round + i;
                            nextI2 = n - 1 + round;
                        }
                        case 1 -> {
                            nextI1 = n - 1 + round;
                            nextI2 = n - 1 + round - i;
                        }
                        case 2 -> {
                            nextI1 = n - 1 + round - i;
                            nextI2 = round;
                        }
                        case 3 -> {
                            nextI1 = round;
                            nextI2 = round + i;
                        }
                        default -> {
                        }
                    }
                    int tmp2 = matrix[nextI1][nextI2];
                    matrix[nextI1][nextI2] = tmp1;
                    tmp1 = tmp2;
                }
            }
            n -= 2;
            round++;
        }
    }
}

package leet026_050.leet036;

import java.util.HashSet;

public class Leet036 {
    public boolean isValidSudoku(char[][] board) {
        return validLine(board) && validCol(board) && validSq(board);
    }

    public boolean validLine(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> cSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (cSet.contains(c)) {
                        return false;
                    } else {
                        cSet.add(c);
                    }
                }
            }
        }
        return true;
    }

    public boolean validCol(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> cSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (c != '.') {
                    if (cSet.contains(c)) {
                        return false;
                    } else {
                        cSet.add(c);
                    }
                }
            }
        }
        return true;
    }

    public boolean validSq(char[][] board) {
        for (int blockIndex = 0; blockIndex < 9; blockIndex++) {
            int startRow = (blockIndex / 3) * 3;
            int startCol = (blockIndex % 3) * 3;
            HashSet<Character> cSet = new HashSet<>();
            for (int cellIndex = 0; cellIndex < 9; cellIndex++) {
                int row = startRow + cellIndex / 3;
                int col = startCol + cellIndex % 3;

                char val = board[row][col];
                if (val != '.') {
                    if (cSet.contains(val)) {
                        return false;
                    } else {
                        cSet.add(val);
                    }
                }
            }
        }
        return true;
    }
}

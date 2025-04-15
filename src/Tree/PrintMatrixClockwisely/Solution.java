package Tree.PrintMatrixClockwisely;

public class Solution {
    public void printMatrixClockwisely(int[][] numbers, int columns, int rows) {
        if (numbers == null || columns <= 0 || rows <= 0) {
            return;
        }
        int start = 0;
        while (start * 2 <= columns || start * 2 <= rows) {
            printMatrixInCircle(numbers, columns, rows, start);
            ++start;
        }
    }

    private void printMatrixInCircle(int[][] numbers, int columns, int rows, int start) {
        int index = start;
        while (columns - (index * 2) >= 0) {
            System.out.println(numbers[start][index]);
            ++index;
        }

        index = start;
        while (rows - (start * 2) >= 0) {
            System.out.println(numbers[columns - (start * 2)][index]);
            ++index;
        }

        index = columns - (start * 2);
        while (index >= start) {
            System.out.println(numbers[columns - (start * 2)][index]);
            --index;
        }

        index = rows - (start * 2);
        while (index > start) {
            System.out.println(numbers[start][index]);
            --index;
        }

        return;
    }
}

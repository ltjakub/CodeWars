import java.util.*;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        final int BOARD_SIZE = 9;
        final int SUM_OF_NUMBERS = 45;

        // Create list with vertical aligned arrays.
        int[] arrayToAdd;
        List<int[]> listToAdd = new ArrayList<>();
        for (int j = 0; j < BOARD_SIZE; j++) {
            arrayToAdd = new int[9];
            for (int i = 0; i < BOARD_SIZE; i++) {
                arrayToAdd[i] = sudoku[i][j];
            }
            listToAdd.add(arrayToAdd);
        }

        // Create list with arrays covering all possibilities.
        List<int[]> allArrays = new ArrayList<>();

        for (int i = 0; i < BOARD_SIZE; i++) {
            allArrays.add(sudoku[i]);
        }
        allArrays.addAll(listToAdd);

        // Checking list of all arrays for sum equal 45.
        for (int i = 0; i < BOARD_SIZE * 2; i++) {

            // Creating HashSet to ensure uniquness of each element.
            Set<Integer> integers = new HashSet<>();

            for (int j = 0; j < BOARD_SIZE; j++) {
                integers.add(allArrays.get(i)[j]);
            }
            int sum = integers.stream().reduce(0, Integer::sum);
            System.out.println(sum);
            if (sum != SUM_OF_NUMBERS) {
                return false;
            }
            integers.clear();
        }
        return true;
    }
}

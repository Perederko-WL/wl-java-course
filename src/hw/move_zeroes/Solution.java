package hw.move_zeroes;

import java.util.Arrays;

/// Given an integer array numbers, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
///
/// Note that you must do this in-place without making a copy of the array.
///
/// @link [Move Zeroes](https://leetcode.com/problems/move-zeroes/)
public class Solution {
    /// Main.
    ///
    /// @param args Arguments list.
    public static void main(String[] args) {
        int[] numbers = {2, 4, 0, 7, 0, 0, 0, 8, 9};
        moveZeroes(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    /// Moves zeros to the end with preserving order.
    ///
    /// @param numbers Array to process.
    public static void moveZeroes(int[] numbers) {
        int newPosition = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == 0)
                continue;
            int tmp = numbers[newPosition];
            numbers[newPosition] = numbers[j];
            numbers[j] = tmp;
            newPosition++;
        }
    }
}

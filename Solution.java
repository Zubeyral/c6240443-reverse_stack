package jasignments.asignments;

public class Solution {
    public static int[] reverseArray(int[] numbers) {

        // Create an ArrayStack with initial capacity 2
        ArrayStack<Integer> stack = new ArrayStack<Integer>(2);

        // Push all numbers onto the stack
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        // Create an array for reversed numbers
        int[] reversed = new int[numbers.length];

        // Pop elements into the new array
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = stack.pop();
        }

        // Return the reversed array
        return reversed;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6,7};

        int[] result = reverseArray(numbers);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

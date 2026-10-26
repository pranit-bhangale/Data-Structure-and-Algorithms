public class ComplexityAnalysis {

    static void print() {
        /*
         * Time Complexity: O(1) - Constant time complexity, as the number of operations
         * does not depend on the input size.
         */
        IO.println("Say hello");
        int a = 100;
        int b = 200;
        IO.println("Sum is: " + (a + b));
    }

    static int arraySum(int[] arr) {
        /*
         * Time Complexity: O(n) - Linear time complexity, as the number of operations
         * grows linearly with the size of the input array.
         */
        int sum = 0; // O(1) - Constant time complexity for initialization
        for (int i = 0; i < arr.length; i++) { // O(n) - Linear time complexity for the loop, as it iterates through
                                               // each element of the array
            sum += arr[i]; // O(1) - Constant time complexity for each addition operation
        }
        return sum;
    }

    static void printData(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // O(n) - Linear time complexity for the loop, as it iterates through
                                               // each element of the array
            for (int j = 0; j < 100; j++) { // O(100) - Constant time complexity for the inner loop, as it always runs
                                            // 100 times regardless of the input size
                IO.println(arr[i]); // O(1) - Constant time complexity for each print operation
            }
        }
        // O(n+1) = O(n) - Overall time complexity is linear, as the inner loop runs a
        // constant number of times (100) for each element of the array.

        for (int i = 0; i < arr.length / 2; i++) { // O(n/2) - Linear time complexity for the loop, as it iterates
                                                   // through half of the elements of the array
            IO.println("Value 1: " + arr[i]); // O(1) - Constant time complexity for each print operation
            IO.println("Value 2: " + arr[arr.length - 1 - i]); // O(1) - Constant time complexity for each print
                                                               // operation
        }

        // O(n/2 + 1) = O(n) - Overall time complexity is linear, as the loop runs half
        // the number of times

        int m = arr.length; // n == m
        for (int i = 0; i < arr.length; i++) { // O(n) - Linear time complexity for the loop, as it iterates through
                                               // each element of the array
            for (int j = 0; j < m; j++) { // O(m) - Linear time complexity for the inner loop, as it iterates m times
                IO.println(arr[i]); // O(1) - Constant time complexity for each print operation
            }
        }

        // O(n*n) - Overall time complexity is quadratic, as the inner loop runs m times

        int a = arr.length; // n != m
        for (int i = 0; i < arr.length; i++) { // O(n) - Linear time complexity for the loop, as it iterates through
                                               // each element of the array
            for (int j = 0; j < m; j++) { // O(m) - Linear time complexity for the inner loop, as it iterates m times
                IO.println(arr[i]); // O(1) - Constant time complexity for each print operation
            }
        }

        // O(n*m) - Overall time complexity is linear with respect to both n and m, as
        // the inner loop runs m times for each of the n iterations of the outer loop.

        int n = arr.length;
        // Multi variable loop with two variables i and j, where i starts from 0 and j
        // starts from n. The loop continues until i is less than j, and both i and j
        // are updated in each iteration.
        for (int i = 0, j = n; i < j; i++, j--) { // O(n/2) - Linear time complexity for the loop, as it iterates
                                                  // through half of the elements of the array
            IO.println("Value 1: " + arr[i]); // O(1) - Constant time complexity for each print operation
            IO.println("Value 2: " + arr[j - 1]); // O(1) - Constant time complexity for each print operation

        }
        // O(n/2 + 1) = O(n) - Overall time complexity is linear, as the loop runs half
        // the number of times, and the inner operations are constant time.
    }

    static void bubbleSort(int[] arr) {
        /*
         * Time Complexity: O(n^2) - Quadratic time complexity, as the number of
         * operations grows quadratically with the size of the input array.
         */
        int n = arr.length; // O(1) - Constant time complexity for initialization
        for (int i = 0; i < n - 1; i++) { // O(n) - Linear time complexity for the outer loop, as it iterates through
                                          // each element of the array except the last one
            for (int j = 0; j < n - i - 1; j++) { // O(n-i-1) = O(n) - Linear time complexity for the inner loop, as it
                                                  // iterates through the unsorted portion of the array
                if (arr[j] > arr[j + 1]) { // O(1) - Constant time complexity for comparison operation
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j]; // O(1) - Constant time complexity for temporary variable assignment
                    arr[j] = arr[j + 1]; // O(1) - Constant time complexity for assignment operation
                    arr[j + 1] = temp; // O(1) - Constant time complexity for assignment operation
                }
            }
        }
        // O(1 + n * n) = O(n^2) - Overall time complexity is quadratic, as the
        // inner loop runs n-i-1 times for each of the n iterations of the outer loop,
        // and the number of operations grows quadratically with the size of the input
        // array.
    }

    static void mergeSort(int[] arr, int l, int r) {
        /*
         * Time Complexity: O(n log n) - Log-linear time complexity, as the number of
         * operations grows logarithmically with the size of the input array.
         */
        if (l < r) { // O(1) - Constant time complexity for comparison operation
            // Find the middle point
            int m = (l + r) / 2; // O(1) - Constant time complexity for calculation operation
            // Sort first and second halves
            mergeSort(arr, l, m); // O(log n) - Logarithmic time complexity for recursive call on first half
            mergeSort(arr, m + 1, r); // O(log n) - Logarithmic time complexity for recursive call on second half
            // Merge the sorted halves
            merge(arr, l, m, r); // O(n) - Linear time complexity for merging operation
        }
        // O(n log n) - Overall time complexity is log-linear, as the array is divided
        // into halves recursively, and the merging operation takes linear time.
    }

    static void main(String[] args) {
        print();
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = arraySum(arr);
        IO.println("Array sum is: " + sum);
        printData(arr);
    }
}
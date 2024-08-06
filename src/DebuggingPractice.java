public class DebuggingPractice {

    //Step 1-3 below
    // Method to calculate the average of an array of integers
    //public static double calculateAverage(int[] numbers) {
        // Check if the array is null or empty
        //if (numbers == null || numbers.length == 0) {
            //throw new IllegalArgumentException("Array must not be null or empty");
       // }
    //Step 1 Below:
    //int sum = 0;
    //for (int number : numbers) {
    //sum += number;
    //}
    //return (double) sum / numbers.length;



    //Step 3 below:
    // int sum = 0;
    // Print statements to debug the summation process
    // for (int number : numbers) {
    //  System.out.println("Adding number: " + number);  // Print each number being added
    // sum += number;
    // }
    // System.out.println("Sum is: " + sum);  // Print the sum after the loop
//        double average = (double) sum / numbers.length;
//        System.out.println("Average is: " + average);  // Print the calculated average
//        return average;

    //Step 4 below introduced Array Index Out Of Bounds Exception:
//    public static double calculateAverage(int[] numbers) {
//        if (numbers == null || numbers.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        int sum = 0;
//        // Introduce an off-by-one error by using <= instead of <
//        for (int i = 0; i <= numbers.length; i++) {  // This will cause ArrayIndexOutOfBoundsException
//            System.out.println("Adding number: " + numbers[i]);  // Invalid access when i == numbers.length
//            sum += numbers[i];
//        }
//        System.out.println("Sum is: " + sum);
//        double average = (double) sum / numbers.length;
//        System.out.println("Average is: " + average);
//        return average;
//
//    }

    //Step 5: Use debugger to find and fix exceptions
        //Array Index Out of Bounds Exception:
            //Run the debugger and step through the for loop.
            //Observe the value of i when the exception occurs.
            //Fix: Change the loop condition from i <= numbers.length to i < numbers.length.


    //Step 6-7: Introduce a Logic Error
//    public static double calculateAverage(int[] numbers) {
//        if (numbers == null || numbers.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        return sum;  // Logic error: should be (double) sum / numbers.length;
//    }

    //Step 7: Use a debugger to find and fix the logic error
        //Ran debugger and set breakpoint at the return statement.
        //Inspected the value of sum and the returned value.
        //Realize that the average calculation is missing.
        //Fix: Change return sum; to return (double) sum / numbers.length;.


    //Final below:
    public static double calculateAverage(int[] numbers) {
        // Check if the array is null or empty
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        // Iterate through the array and sum up the elements
        for (int number : numbers) {
            sum += number;
        }
        // Return the average as a double
        return (double) sum / numbers.length;
    }




    //Step 1-3 below:
    //public static void main(String[] args) {
        // Test the method with an array of numbers
        //int[] numbers = {1, 2, 3, 4, 5};
        //double average = calculateAverage(numbers);  // Calculate the average
        //System.out.println("The average is: " + average);  // Print the result
    //}

    //Step 4 Null Pointer Exception:
//    public static void main(String[] args) {
//        int[] numbers = null; // This will cause a NullPointerException
//        double average = calculateAverage(numbers);  // This will throw an exception
//        System.out.println("The average is: " + average);
//    }

    //Step 5: Use debugger to find and fix exceptions
        //Null Pointer Exception:
            //Run the debugger and set a breakpoint at the start of calculateAverage.
            //Observe the input array numbers and see that it is null.
            //Fix: Ensure the input array is not null before calling calculateAverage.


    //Final Below:
    public static void main(String[] args) {
        // Test the method with an array of numbers
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);  // Calculate the average
        System.out.println("The average is: " + average);  // Print the result
    }

}

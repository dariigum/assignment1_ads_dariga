import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        // Main loop to display task menu
        while (menu) {

            // Menu
            System.out.println("Enter number of the task:");
            System.out.println("Task 1: Find minimum");
            System.out.println("Task 2: Average");
            System.out.println("Task 3: Prime");
            System.out.println("Task 4: Factorial");
            System.out.println("Task 5: Fibonacci");
            System.out.println("Task 6: Power");
            System.out.println("Task 7: Reversed array");
            System.out.println("Task 8: Letter check");
            System.out.println("Task 9: Binomial coefficient");
            System.out.println("Task 10: GCD");

            System.out.print("Enter number of the task (0 to exit): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            //  0 will stop our loop
            if (choice == 0) {
                System.out.println("bye!");
                break;
            }

            long startTime = System.currentTimeMillis();
            switch (choice) {
                case 0:
                    System.out.println("exit");
                    return;
                case 1:
                    findMinimum();
                    break;
                case 2:
                    calculateAverage();
                    break;
                case 3:
                    checkPrime();
                    break;
                case 4:
                    calculateFactorial();
                    break;
                case 5:
                    findFibonacci();
                    break;
                case 6:
                    calculatePower();
                    break;
                case 7:
                    reverseArray();
                    break;
                case 8:
                    checkLetterInString();
                    break;
                case 9:
                    calculateBinomialCoefficient();
                    break;
                case 10:
                    calculateGCD();
                    break;
                default:
                    System.out.println("invalid choice. enter number between 1 and 10");
                    break;

            }

            double endTime = System.currentTimeMillis();
            double duration = (endTime - startTime) / 1000000;
            System.out.println("Time: " + duration + " ms");
        }
    }



    private static void findMinimum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findMin(arr);
    }

    private static void calculateAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        averageOfArr(n, arr);
    }

    private static void checkPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        isPrime(n);
    }

    private static void calculateFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        System.out.println("Result: " + factorial(n));
    }

    private static void findFibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println("Result: " + fibonacci(n));
    }

    private static void calculatePower() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter power:");
        int n = sc.nextInt();
        System.out.println("Result: " + toPower(a, n));
    }

    private static void reverseArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseOrder(arr, 0, arr.length - 1);

        System.out.println("Result: ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    private static void checkLetterInString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println("Result: " + isDigit(s));
    }

    private static void calculateBinomialCoefficient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for n:");
        int n = sc.nextInt();

        System.out.println("Enter number for k:");
        int k = sc.nextInt();
        System.out.println("Result: " + binomialCoef(n, k));
    }

    private static void calculateGCD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();

        System.out.println("Result: " + GCD(a, b));
    }

    //task 1: find smallest number in the array
    private static void findMin(int[] arr) {
        int min = arr[0];//set minimum to the first element
        for (int i = 1; i < arr.length; i++) { //as index goes, it checks if it is smaller than min
            if (min > arr[i]) {
                min = arr[i];// if condition is true, then that element is minimum
            }
        }
        System.out.println("Result: " + min);
    }

    //task 2: calculate average
    private static void averageOfArr(int n, int[] arr) {
        double sum = 0; //set sum to 0, so it can be calculated there
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / n;//divide by the number of elements
        System.out.println("Result: " + average);
    }

    //task 3: prime - number that is divisible only by 1 and itself
    private static void isPrime(int n) {
        if (n % 2 == 0) {//if it is divisible by 2 but no remainder, then it is not prime
            System.out.println(n + " Composite");
        } else {
            System.out.println(n + " Prime");
        }
    }

    //task 4: factorial number
    private static int factorial(int n) {
        if (n <= 1) return 1;
        else return n * factorial(n - 1); //recursive formula
    }

    //task 5: fibonacci
    private static int fibonacci(int n) {
        if (n <= 1) return n; // 0! = 0 and 1! = 1
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //task 6: power of a
    private static int toPower(int a, int n) {
        if (n == 0) return 1; //if power of any number is 0, then it is 1
        else return a * toPower(a, n - 1);
    }

    //task 7: reversed array
    //start is the index of the element at the beginning
    //start is the index of the element at the end
    //checks if the start index is greater than or equal to the end index. If it is, it means that the method has reached the middle of the subarray or the subarray has only one element. In either case, there's no need to continue swapping elements, so the method simply returns without further action.
    private static void reverseOrder(int[] array, int start, int end) {
        if (start >= end) return;

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverseOrder(array, start + 1, end - 1);//After swapping the elements, the method recursively calls itself with the start index incremented by 1 and the end index decremented by 1.
    }

    //task 8: check "s"
    private static boolean isDigit(String str) {
        if (str.isEmpty()) return false; //base case: if there is nothing in, letter is not found

        if (str.charAt(0) == 's') {//checks if it contains that letter
            return true;
        }

        return isDigit(str.substring(1));//then it checks every index for s
    }

    //task 9: binomial coefficient
    private static int binomialCoef(int n, int k) {
        if (k == 0 || n == k) return 1; //base case

        return factorial(n) / (factorial(k) * factorial(n - k)); //formula
    }


    //task 10: calculate gcd (greatest common divisor)
    private static int GCD(int a, int b) {
        if (b == 0) return a;//means that a is the gdc

        return GCD(b, a % b);//This approach simplifies the problem iteratively until a base case is reached, leading to the final result.
    }
}
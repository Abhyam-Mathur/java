import java.util.Scanner;

public class missingnumber {
    public static int findNumber(int[] arr, int N) {
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum; 
    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = Scanner.nextInt();

        int[] arr = new int[N - 1]; 

        System.out.println("Enter " + (N - 1) + " numbers:");
        for (int i = 0; i < N - 1; i++) {
            arr[i] = Scanner.nextInt();
        }

        int missingNumber = findNumber(arr, N);
        System.out.println("Missing Number: " + missingNumber);

        Scanner.close();
    }
}

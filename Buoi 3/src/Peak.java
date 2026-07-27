import java.util.Scanner;

public class Peak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int prev = -1;
        int curr = -1;

        for (int x : arr) {
            if (prev != -1 && curr != -1) {
                if (curr > prev && curr > x) {
                    count++;
                }
            }
            prev = curr;
            curr = x;
        }

        System.out.println(count);
    }
}
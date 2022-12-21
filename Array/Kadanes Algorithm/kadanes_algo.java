import java.util.*;

class kadanes_algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxsum = Integer.MIN_VALUE;
        int cur_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            cur_sum += arr[i];
            Math.max(maxsum, cur_sum);
            if (cur_sum < 0) {
                cur_sum = 0;
            }
        }
        sc.close();
    }
}
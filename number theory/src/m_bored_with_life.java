import java.util.*;
import java.io.*;

public class m_bored_with_life {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr2[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
        System.out.println(arr2[Math.min(a, b)]);
    }
}

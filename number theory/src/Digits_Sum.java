import java.util.*;
import java.io.*;

public class Digits_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long n=sc.nextLong();
            long ans=0;
            if(n%10==9)
                ans=1;
            ans+= n/10;
            System.out.println(ans);
        }

    }
}

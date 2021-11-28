import java.util.*;
import java.io.*;

public class Design_Tutorial_Learn_from_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=sieve(n);
        for(int i=4;i<n;i++)
        {
            if(arr[i]!=1 && arr[n-i]!=1)
            {
               System.out.println(i+" "+(n-i));
               break;
            }
        }
    }
    public static int[] sieve (int n)
    {
        int arr[]=new int[n+1];
        Arrays.fill(arr,1);
        arr[0]=0;
        arr[1]=0;
        for(int i=2;i<=n;i++)
        {
            for(int j=2;i*j<=n;j++)
            {
                arr[i*j]=0;
            }
        }
        return arr;
    }
}

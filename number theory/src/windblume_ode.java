import java.util.*;
import java.io.*;

public class windblume_ode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime[]=new int[20001];
        Arrays.fill(prime,1);
        prime[0]=0;
        prime[1]=0;
        for(int i=2;i<=20000;i++)
        {
            for(int j=2;i*j<=20000;j++)
            {
                prime[i*j]=0;
            }
        }
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int s=0; int oddpos=-1;
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
                s+=arr[j];
                if(arr[j]%2!=0)
                {
                    oddpos=j+1;
                }
            }
            if(prime[s]==1)
            {
                System.out.println(n-1);
                for(int j=1;j<=n;j++)
                {
                    if(j==oddpos)
                        continue;
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            else
            {
                System.out.println(n);
                for(int j=1;j<=n;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}

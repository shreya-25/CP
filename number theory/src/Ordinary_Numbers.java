import java.util.*;
import java.io.*;

public class Ordinary_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long n=sc.nextLong();
            int digit= (int)Math.floor(Math.log10(n) + 1);
            //System.out.println(digit);
            int ans=0;
            ans+=(digit-1)*9;
            for(int j=1;j<10;j++)
            {
                long val=0;
                int temp=digit;
                while(temp>0)
                {
                    val+=(long) j*Math.pow(10,temp-1);
                    temp--;
                }
               // System.out.println(val);
                if(n>=val)
                    ans++;
                else
                    break;
            }
            System.out.println(ans);
        }

    }
}

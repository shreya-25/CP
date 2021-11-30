import java.util.*;
import java.io.*;

public class AM_Deviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int max=Math.max((a+c),(2*b));
            int min=Math.min((a+c),(2*b));
            if(Math.abs(max-min)%3==0)
                System.out.println("0");
            else
                System.out.println("1");
        }

    }
}

import java.util.*;
import java.io.*;

public class Bachgold_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n/2);
        if(n%2==0)
        {
            int temp=n/2;
            while(temp>0) {
                System.out.print("2 ");
                temp--;
            }
        }
        else
        {
            int temp=n/2;
            while(temp>1) {
                System.out.print("2 ");
                temp--;
            }
            System.out.print("3");
        }

    }
}

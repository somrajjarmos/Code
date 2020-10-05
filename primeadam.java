import java.util.Scanner;
public class primeadam
{
    public static int isprime(int b)
    {
        int i;
        for(i=2; i<b; i++)
        {
            if(b%i==0)
                return 0;
        }
        return 1;
    }
    public static int reverse(int b)
    {
        int i,r=0;
        for(i=b; i>0; i/=10)
        {
            r=r*10+(i%10);
        }
        return r;
    }
    
    public static void main(String args[])
    {
        int n,sq1,sq2;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number");
        n=sc.nextInt();
        sq1=(int)Math.pow(n,2);
        sq2=(int)Math.pow(reverse(n),2);
        if(isprime(n)==1 && sq1==sq2)
            System.out.print("Prime Adam Number");
        else
            System.out.print("Not a Prime Adam Number");
    }
}

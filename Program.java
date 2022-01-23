public class Program
{
    public static void main(String[] args)
    {
        int a[] = new int[]{22,1235,1,2,4568};
        int sum[] = new int[]{0,0,0,0,0};
        for(int i=0;i<5;i++)
        {
            while(a[i]!=0)
            {
                sum[i]+=a[i]%10;
                a[i]=a[i]/10;
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(sum[i]+" ");
        }
    }
}

package aass.company;

public class chchc
{
    public static void main(String[] agrs) 
    {
        String[] cb = {"SIBE", "RIA", "ICE", "LAND", "MONGO", "LIA"};
        int n = cb.length;
        System.out.print("1st line");
        System.out.println(" Supposed to be the second line");
    
        
        for (int i=0;i<=n-2;i++)
        {
            System.out.print(" "+cb[i]);
            System.out.print("i="+i);
            int h=i%2;
            System.out.print("h="+h);
            if (h!=0)
            {
                continue;
            }
            int nj = i+1;
            System.out.print("i="+i);
            System.out.println(" "+cb[nj]);
        }
    }
}
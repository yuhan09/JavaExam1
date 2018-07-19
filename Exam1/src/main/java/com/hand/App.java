package com.hand;

/**
 * 判断101到200之间有多少个素数，并输出所有素数
 *输出格式：101到200间总共有XX个素数，分别是：XXX，XXX，XXX
 */


public class App
{
    public static void main( String[] args )
    {
        TestS();
    }

    public static void TestS()
    {
        int a=101;
        int b=200;
        int c[]=new int[200];
        int count=0;

        for(int i=a;i<=b;i++)
        {
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    break;
                }else{
                    c[count]=i;
                    count=count+1;
                }

            }
        }

        System.out.print("101到200间总共有"+count+"个素数,分别是：");
        for(int k=0;k<c.length;k++)
        {
            if(c[k]!=0)
            System.out.print(c[k]);
        }

    }
}

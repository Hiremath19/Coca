public class Coca
{
    public static void main(String arg[])
    {
        String s="";
        System.out.println("which are divisible by 3 : ");
        for(int i=1;i<=20;i++)
        {
            if(i%3==0)

                System.out.println(i+ " Coca ");
        }
        System.out.println("which are divisible by 5 : ");
        for (int i=1;i<=20;i++)
        {
            if(i%5==0)

                System.out.println(i+ " Cococola ");
        }
        System.out.println("which are divisible by 3&5 : ");
        for(int i=1;i<=20;i++)
        {
            if(i%3==0 && i%5==0)

                System.out.println(i+ " Cococolasoda ");
        }
        System.out.println();



        }

    }


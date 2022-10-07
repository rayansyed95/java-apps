package Week2;

public class Week02 
{
    public static final int SEVEN=7;

    //   public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
      //  System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Rayan Syed ");
        System.out.println();

        do7timestable();
        doconvertegrade();
    }

    private static void doconvertegrade() 
    {
    }

    
    private static void do7timestable()
     {
     
        int value; int product;

        for(value = 1; value <=12; value++)
        {
            product = value * SEVEN;
            System.out.print(value + " x 7 = ");
            System.out.print(product);
            System.out.println();
        }
    }
}
package week2_tasks;

public class SwapNumbers {

    public static void main(String[] args)
    {

        int x = 100, y = 200;

        System.out.println("Swap x");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("swap y" +
                "");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

/*swap two variable' values without using a third variable*/

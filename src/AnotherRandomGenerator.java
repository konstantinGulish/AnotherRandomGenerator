import java.util.Random;

public class AnotherRandomGenerator{
    public static void main(String[] args)
    {
        output("Generate 10 random integers between 0 and 6");
        Random rnd = new Random() ;

        for (int i = 1; i <= 10; ++i)
        {
            int randomInt = 5 + rnd.nextInt(96);
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}
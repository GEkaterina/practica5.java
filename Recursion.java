
public class Recursion {
    public static String sequence(int k)
    {
        if (k == 1)
            return "1,";
        else
        {
            String result = "";
            for (int i = 0; i < k; i++)
            {
                result = result+k+",";
            }
            return sequence(k-1)+result;
        }
    }

    public static void main(String[]args)
    {
        System.out.println(sequence(8));
    }
}

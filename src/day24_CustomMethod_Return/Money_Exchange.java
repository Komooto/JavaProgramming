package day24_CustomMethod_Return;

public class Money_Exchange {
    public static float convert(float amount)
    {
        float euro = (float) (amount / 1.09);
        return euro;
    }
    public static void main(String[] args)
    {

        System.out.print("Euro =" + convert((float) 2.5));
    }
}

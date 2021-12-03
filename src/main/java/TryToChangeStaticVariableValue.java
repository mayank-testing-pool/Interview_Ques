public class TryToChangeStaticVariableValue {
    static int i = 10;
    public static void main  (String [] args)
    {

        int b= 20;
        i=b;
        System.out.println ("Value of i = "+i+" and Value of b = "+b);
    }

}

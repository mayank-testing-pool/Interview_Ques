public class countSpecificCharOccurrence {
    public static void main (String [] args)
    {
        String str = "Mayank";
        char ch = 'a';
        int count=0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==ch)
            {
                count++;
            }
        }
        System.out.println(ch +" occurre in string "+str+" "+count+" times");
    }
}

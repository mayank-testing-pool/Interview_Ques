/*program to count the occurrences of each character
Input String = aaaabbbccdaaaa

Output String = a4b3c2d1a4
 */

public class countCharoccurrences {
    public static void main (String [] args)
    {
        String str1 = "aaabbbddqqsvvvv";
        int len = str1.length();
        char [] ch= str1.toCharArray();
        int count = 0;
        for (int i=0;i<len;i++)
        {
            if (str1.charAt(i)==str1.charAt(i+1))
            {count ++;
                for (int j=0;j<=i;j++) {
                    ch[j] = str1.charAt(i);
                    count++;
                    //ch[j+1] = count;
                System.out.println(ch[j]+count);
                }
                System.out.println(count);
            }

        }

}}

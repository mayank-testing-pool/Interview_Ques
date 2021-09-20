/* engati/quinbay
To find the reverse of a string with out changing the special characters position
 */

public class reverseString {
    public static void main (String [] arg)
    {
        String str1 = "$rev%er&se";
        String str2;
        char [] ch = str1.toCharArray();
        int f = 0;
        int l = str1.length()-1;
        while (f<l)
        {
            char first = str1.charAt(f);
            char last = str1.charAt(l);
            System.out.println("First "+first);
            System.out.println("Last "+last);
            if (!(((first>='a'&& first<='z')|| (first>='A' && first<='Z'))||(first>='0'&&first<='9')))
            {
                f++;
            }
            else if (!(((last>='a'&& last<='z')|| (last>='A' && last<='Z'))||(last>='0'&&last<='9')))
            {
                l--;
            }
            else
            {
                char temp = ch[f];
                ch[f] = ch[l];
                ch[l] = temp;
                f++;
                l--;
            }

            }
        str2 = String.copyValueOf(ch);
        System.out.println("Input String = "+str1);
        System.out.println("Output String = "+str2);
        }

    }


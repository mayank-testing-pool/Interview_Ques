/*Reverse the string word by word but each word’s characters remain unchanged
Input String: "This is Medline"
Output string: "Medline is This"
 */
public class reverseWords {

    public static void main (String [] args)
    {
        String str1 = "This is Medline";
        String str2 = "";
        String [] split_str;
        split_str = str1.split("\\s");
        int len = split_str.length;
        for (int i=len-1;i>=0;i--)
        {
           str2 += split_str[i]+" ";
        }
        System.out.println ("Input String = "+str1);
        System.out.println ("Output String = "+str2);
    }
}

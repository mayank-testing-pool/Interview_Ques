public class lengthandlenghtmethod {

    //Length is a data member of an array so can we use  to find the length  of an array of string type
    //Length () is static method of String class and can be used with String only to find the character count in
    //string. String class uses this method because the length of a string can be modified using the various
    // operations on an object. The String class internally uses a char[] array that it does not expose to the
    // outside world.
    public static void main(String[] args) {
        String[] str = {"A", "AA", "AAA", "AAAA"};
        String str1 = "This is Java Program";
        stringarraylenght(str);
        stringlenght(str1);

    }

    public static void stringarraylenght(String [] str) {
        System.out.println("String Array length = "+str.length);
        //System.out.println("String Array length = "+str.length()); //through error
        //System.out.println("Length of the element at 0 place in array = "+str[0].length);  //through error
        System.out.println("Length of the element at 3 place in array = "+str[3].length());        //Will not through error as value at 0 place is string.

    }
    public static void stringlenght(String str1)
    {
        //System.out.println(str1.length); //through error
        System.out.println("Length of the string is = " +str1.length());


    }

}

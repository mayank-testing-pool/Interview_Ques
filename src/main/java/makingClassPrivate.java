//What if we make outer class as private
// we can not make outer class as private, It must be public

public class makingClassPrivate {
    static String str1 = "static string";
    String str2 = "Non-static string";
    public void nonstaticmethod()
    {
        System.out.println("This is non static method in main class");
    }

    public static void staticmethod()
    {
        System.out.println("This is static method in main class");
    }
    //we can make inner class as private, protected
    static class staticNestedclass
    {
        public void innerclassmethod ()
        {

            staticmethod();

            System.out.println ("This is method 2 inside nested static class to print static string" +str1);
            //System.out.println ("This is method 2 inside nested static class to print static string" +str2);
        }

    }

    public static void main (String [] args)
    {
        makingClassPrivate obj1 = new makingClassPrivate();
        makingClassPrivate.staticNestedclass obj2 = new makingClassPrivate.staticNestedclass();
        obj1.nonstaticmethod();
        obj2.innerclassmethod();
        staticmethod();
    }

}

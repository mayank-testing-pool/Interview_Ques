public class CanWeOverloadConstructor {

        public CanWeOverloadConstructor() {
            System.out.println("This constructor having no parameter");
        }

        public CanWeOverloadConstructor(int a, int b) {
            System.out.println("This Constructor having integer value " + a + " And " + b);
        }

        public CanWeOverloadConstructor(String str1) {
            System.out.println("This constructor having string value " + str1);
        }
    }

    class baseclass {
    public static void main (String [] args)
    {
        CanWeOverloadConstructor obj1=new CanWeOverloadConstructor();
        CanWeOverloadConstructor obj2=new CanWeOverloadConstructor(10,20);
        CanWeOverloadConstructor obj3=new CanWeOverloadConstructor("This is constructor overloading");
    }
 }



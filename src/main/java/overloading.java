public class overloading {
    //public  class class1 {
        public void method1(int a, int b) {
            int c = a + b;
            System.out.println("Addition of two integer number = " + c);
            //return c;
        }

        public void method1(double a, double b) {
            double c = a + b;
            System.out.println("Addition of two float number = " + c);
            //return c;
        }

        public void method1(String a, String b) {
            String c = a + b;
            System.out.println("Addition of two String = " + c);
            //return c;
        }

        public void method2() {
            method1(10, 20);
            method1(10.23, 20.23);
            method1("abc", "xyz");
        }

        overloading() {
            System.out.println("This is class constructor");
        }
    }

    class class2 {
        public static void main(String[] args) {
            //class1 obj = new class1();
            //method1(20,20);
            overloading obj = new overloading();
            //obj.method1(50, 50);
            //obj.method2();



        }
    }




public class OverrideFinalMethod {
    final void add(int a, int b) {
            System.out.println("Sum of two integers " + a + b);
        }

        final void subtract(int a, int b) {
            System.out.println("Subtraction of two integer " + a + b);
        }
    }

    class child extends OverrideFinalMethod {
        //public void add (int a, int b)
        public void add_int(int a, int b) {
            System.out.println("Sum of two integers in child class " + a + b);

        }

        //public void subtract (int a, int b)
        public void subtract_int(int a, int b) {
            System.out.println("Subtraction of two integer in child class " + a + b);
        }
    }

    class base
    {
        public static void main (String [] args)
        {
            OverrideFinalMethod obj1=new OverrideFinalMethod();
            child obj2 = new child();
            OverrideFinalMethod obj3=new child();
            obj1.add(10,20);
            obj2.add(20,30);
            obj3.subtract(30,20);
        }
    }


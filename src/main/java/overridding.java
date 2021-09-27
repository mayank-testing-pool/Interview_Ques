
public class overridding {
    static class class_a
    {
        public static void method_1()
        {
            System.out.println("This is method in class_a");
        }
    }

    static class class_b extends class_a
    {
        public static void method_1()
        {
            System.out.println("This is method in class_b");
        }

    }

    public static void main (String [] args)
    {
        //class_a.method_1();
        //class_b.method_1();
        //this.method_1();
        //this.method_1();
        class_a obj1=new class_a();
        class_b obj2=new class_b();
        class_a obj3 = new class_b ();

        obj1.method_1();
        obj2.method_1();
        obj3.method_1();



    }




}

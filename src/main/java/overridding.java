
public class overridding {
    static class class_a
    {
        public static void method_1()
        {
            System.out.println("This is method 1 in class_a");
        }

        public static void Class_a_method_2()
        {
            System.out.println("This is method 2 in class_a");
        }
    }

    static class class_b extends class_a
    {
        public static void method_1()
        {
            System.out.println("This is method 1 in class_b");
        }
        public static void Class_b_method_2()
        {
            System.out.println("This is method 2 in class_b");
        }
    }

    public static void main (String [] args) {
        //class_a.method_1();
        //class_b.method_1();
        //this.method_1();
        //this.method_1();
        class_a obj1 = new class_a();
        // first memory is allocated to all the data members of class_a and the reference to this memory
        // location is assigned to obj1. where obj1 is a reference variable of type class_a.
        class_b obj2 = new class_b();
        class_a obj3 = new class_b();
                //OR
        class_a obj4 = (class_a) new class_b();     //Here base class members can be called if an instance of the derived class is cast to an instance of the base class.

        //You are creating an object of B and assigning its reference to a variable called obj,
        //You are referencing your newly created object through the view of the class A,
        //i.e. you will not be able to use any method that B has but A doesn’t have.
        //In this statement, the Class2 object is created and assigned to the Class1 memory location.
        //Here, you cannot use a reference to a base class to access the members and methods of a derived class
        //even if the base class reference may contain a valid reference to an object of the derived type.
        //here using o we can only access base class members but not class2 members.

        //class_b obj5 = new class_a();       //Will through Error
        //obj1.method_1();
        //obj2.method_1();
        obj3.method_1();
        //obj3.Class_b_method_2();      //Will through Error as method is not in class a
        obj3.Class_a_method_2();
        obj4.method_1();
        obj4.Class_a_method_2();
    }
}

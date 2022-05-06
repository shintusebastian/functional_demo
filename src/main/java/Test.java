import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Printer printer = new Main();
        printer.print();//Approach 1: longest implementation


        Printer p = new Printer() {//anonymous implementation. This print method overrides the implementation in the Main Class.
            //This can be considered as a class with no name(Anonymous class).
            /* The Printer() is a call to the constructor of the anonymous class. It is not a constructor call to the
             * Printer interface. We are not providing the name. So, it's called anonymous class.
             * Here we are saying that, We want an implementing class for the Printer(). But, we do not want to give it a name.
             * This class begins from line 8 and ends at line 18  */
            @Override
            public void print() {
                System.out.println("Implementation using anonymous class");

            }
        };
        System.out.println(p);
        //If we print the remote control p, we will get the hash code of the object it is pointing to.
        p.print();
        //This method is good if we don't want to
        // 1) reuse the implementation again and again.
        // 2) When, you have only few lines of implementation.
        // 3) We have only limited number of methods.
        //NB: We can use the anonymous class if the interface is not functional interface as well.
        //  MapperInterface obj=  (a)-> a*2;//if there is only one line of code, we don't need the method body and return word.
        /*{
            return a*2; we have to write like this only if we have more than one line.
            Also, if we are writing inside the body, we have to give the return word.
        };*/

        //    obj.map(2);
        /*Very important: we dont have to give the method name, return type or type of argument. because
         * everything is present inside the blueprint of interface itself. */
//        MapperInterface obj2 = (a, b) -> 2 * (a + b);//**Read it as take the inputs and do this. **
//        System.out.println(obj2.map1(5, 10));
//        MapperInterface obj=(x)-> System.out.println(x);//it is consuming the value. not returning anything.
//        obj.map(3);
        MapperInterface obj=(x)-> x<5;// whatever be the result of this statement, it is returned as a boolean.
        System.out.println(obj.check(20));//this is a predicate.

        List<Integer>list= Arrays.asList(3,6,8,9);
        list.forEach(x-> System.out.println(x*2));// this means for each data in the list,
        //  multiply by 2 and consume it.
//        list.stream().filter(e-> e%2==0);        //we call each of the data coming to you through the pipeline as e.
        //it simply refers to each of the element in the data pipeline.
        //the lambda expression states that, if it is even, let it go. Otherwise, discard it. Here, we filter the
        //data elements that are coming through the pipeline.
        // This filter is asking for a predicate. That is, boolean expression.

        list.stream().filter(e-> e%2==0).map(x-> x*2).forEach(a-> System.out.println(a));//This is called functional programming.
        //This Function refers to the functional interface which is of the type mapper. The method name is map.
        //It asks us how to do the transformation.
                //The map asking for the Function type of functional interface.
        //map is a mapper
        //forEach is a consumer.
    }
}

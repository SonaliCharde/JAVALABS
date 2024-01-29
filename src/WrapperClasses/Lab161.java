package WrapperClasses;

import java.util.logging.SocketHandler;

public class Lab161 {
    public static void main(String[] args) {
        int a = 10;
        Integer a2 = Integer.valueOf(a);

        //Collection framework - work with classes
        //Classes hate primitive data type
        //You have to use the Wrapper classes in the
        //Collection Framework
        //Wrapper classes have an advantage of functions
        //Integer.valueOf(a);

        Character c = 'S';

        //Unboxing - Changing from Wrapper to Primitive
        //char c1 =c;

        System.out.println(Integer.valueOf("55"));
        System.out.println(Integer.max(10,18));
        System.out.println(Integer.min(10,20));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Double d = 90.87;
        String str2 = String.valueOf(d);
        Double st =Double.valueOf(d);
        Integer a22 = st.intValue();
        System.out.println(a22);

    }
}

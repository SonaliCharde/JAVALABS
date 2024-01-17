package OOPS.Basics;

public class Lab131 {
    public static void main(String[] args) {
        String name = "Sonali";

        //Concatenation
        System.out.println(name.concat("Charde"));
        System.out.println(name+ "Charde");
        System.out.println(name);

        //Contains method
        System.out.println(name.contains("S")+name);


        String name2 = new String("Tushar");

        //EqualsIgnore case
        String expected_result = "password";
        String actual_result = "Password";
        if (expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("Actual and Expected results are the same");
        }

    }
}

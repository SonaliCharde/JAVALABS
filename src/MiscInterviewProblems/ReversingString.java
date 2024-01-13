package MiscInterviewProblems;
import java.lang.StringBuilder;
import java.lang.String;
public class ReversingString {
    public static void main(String[]args){
        String Input = "Learning reversing a String";

        StringBuilder st = new StringBuilder();
        st.append(Input);

        st.reverse();

        System.out.println(st);

    }
}

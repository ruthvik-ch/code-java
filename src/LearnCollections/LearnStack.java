package LearnCollections;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        // push, pop, peek

        st.push("ruth");
        st.push("fury");
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.pop();
    }
}

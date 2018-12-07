package lesson3;

public class Program {
    public static void main(String[] args) {
       /* MyArrayStack<Integer> st = new MyArrayStack<>();
        st.push(5);
        st.push(3);
        st.push(6);
        st.push(17);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.peek());
        st.push(8);
        System.out.println(st.peek());
        System.out.println(st);*/


       /*Expression expr = new Expression("[(a+4) * (b-7)] / (a-5) * (a-2)");
        System.out.println(expr.chekBrackets());*/


        /*MyArrayQueue<Integer> q = new MyArrayQueue<>();
        q.enqueue(5);
        q.enqueue(11);
        q.enqueue(7);
        q.enqueue(8);
        System.out.println(q);
        System.out.println(q.peekFront());
        q.dequeue();
        q.dequeue();
        System.out.println(q.peekFront());
        System.out.println(q);
        q.dequeue();
        q.dequeue();
        System.out.println(q.isEmpty());*/

        PostfixExpression expr = new PostfixExpression("3 2 + 2 *");
        System.out.println(expr.calcExpression());
    }
}

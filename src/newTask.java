public class newTask {
    public static void main(String[] args) {
        ex1();
    }
    static void ex1(){
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(7);
        stack.push(3);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

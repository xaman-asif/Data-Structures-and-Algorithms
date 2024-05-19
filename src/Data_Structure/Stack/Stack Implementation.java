package Data_Structure.Stack;

class Stack {
    static final int max_size = 3;
    int top_pointer = -1;
    int ara[] = new int[max_size];
    boolean push(int x)
    {
        if(top_pointer >= max_size-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            ara[++top_pointer] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
    int pop(){
        if(top_pointer < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return ara[top_pointer--];
        }
    }
    int peek(){
        if(top_pointer < 0){
            System.out.println("Stack Underflow");
        }
        return ara[top_pointer];
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        //Pushing out of size, Stack Overflow should be shown
        s.push(40);
        s.pop();
        s.pop();
        s.pop();
        //Poping out of elements, Stack Underflow should be shown
        s.pop();
        s.push(50);
        //Let's see if peek() works or not
        System.out.println("Peeked value: " + s.peek());
    }
}

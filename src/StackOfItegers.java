public class StackOfItegers {

    private int[] stack;

    private int next = 0;

    /**
     *
     * @param size size of the array to be
     */
    public StackOfItegers(int size) {

//create an array large enough to hold the stack
        stack = new int[size];
    }

    /**
     *
     * @param element element to push to the array
     */
    public void push(int element) {

        if (next < stack.length)
            stack[next++] = element;
    }

    /**
     *
     * @return retunrs the null if it is
     */
    public boolean isEmpty() {

        return (next == 0);
    }

    /**
     *
     * @return the next
     */
    public int pop(){

        if (!isEmpty())
            return stack[--next]; // top item on stack
        else
            return 0; //stack is empty, then return 0
    }

    public int getStackSize() {

        return next;

    }

    public void printStack(){
        for(int i= getStackSize(); i>0 ;i--){
            System.out.println(stack[i-1]);
        }

    }



}



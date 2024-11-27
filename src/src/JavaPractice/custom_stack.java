package JavaPractice;

import java.util.Stack;

public class custom_stack {
    public static void main(String[] args) {
        stack stack = new stack(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
class stack{
    private int maxSize;
    private int top;
    private int[] stackArray;
    public stack(int num){
        maxSize = num;
        stackArray = new int[maxSize];
        top=-1;
    }

    public void push(int value){
        if(top==maxSize-1){
            System.out.println("Stack is full cannot push the value");
        } else{
            stackArray[++top]=value;
        }
    }

    public boolean isEmpty(){
        return (top==maxSize-1);
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty Cannot PoP");
            return -1;
        }else{
            return stackArray[top--];
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            return stackArray[top];
        }
    }

    public boolean isFull(){
        return (top==maxSize-1);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackmenuproj;

/**
 *
 * @author Danial
 * @param <T>
 */
public class Stack<T> {
    
    private int top = -1;
    private int maxStkSize = 999;
    private Object[] stk;
    //private Object[] ope;
    private T el;
    
    
    // default stack constructor
    public Stack() {
        this.stk = new Object[this.maxStkSize];
    }
    
    // stack constructor if there is a value for n
    public Stack(int n) {
        if (n > 0) {
            this.maxStkSize = n;
            this.stk = new Object[this.maxStkSize];
        }   
    }

    public void setMaxStkSize(int maxStkSize) {
        this.maxStkSize = maxStkSize;
    }

    public int getTop() {
        return top;
    }

    public int getMaxStkSize() {
        return maxStkSize;
    }
    
    public boolean isEmpty() {
        return (this.top == -1);
    }
    
    public boolean isFull() {
        return (this.top + 1 == this.maxStkSize);
    }
    
    public void clear() {
        while (!isEmpty()) {
            this.pop();
        }
    }
    
    public int push(T el) {
        if (isFull()) {
            return -999;
        }
        else {
            this.top++;
            this.stk[this.top] = el;
            return 1;
        }
    }
    
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        else {
            this.el = (T)this.stk[this.top];
            this.top--;
            return this.el;
        }
    }
    
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        else {
            return (T)this.stk[top];
        }
    }
    
    public void printStack() {
        int x = this.top;
        while (x >= 0) {
            System.out.print(this.stk[x]);
            x--;
            
            if (x >= 0) {
                System.out.println(", ");
            }
        }
        System.out.println("\n");
    }
    
    public String toString() {
        String s= "";
        int x = this.top;
        
        while (x >= 0) {
            s += this.stk[x];
            x--;
        }
        
        return s;
    }
    
}

//Program to create a generic stack and do the Push and Pop operations. 
package javaprograms;
class StackElement<T>
{
    T value;
    StackElement<T> next;
    public StackElement(T value,StackElement<T> next) 
    {
        this.value = value;
        this.next = next;
    }
    public StackElement<T> getNext()
    {
        return next;
    }
    public T getValue()
    {
        return value;
    }
    
}
public class CO4Q8 <T>
{
    int size;
    StackElement<T> top;
    public CO4Q8()
    {
        size = 0;
        top = null;
    }
    public void push(T newValue)
    {
        StackElement<T> newElement = new StackElement<T>(newValue,top);
        top = newElement;
        size++;
    }
    public T pop()
    {
        StackElement<T> oldTop = top;
        if(size==0)
        {
            return null;
        }
        top = top.getNext();
        size--;
        return oldTop.getValue();
    }
    
    public static void main(String[] args) 
    {
        CO4Q8 <String> strStack = new CO4Q8<String>();
        strStack.push("Apple");
        strStack.push("Mango");
        strStack.push("Watermelon");
        strStack.push("Cherry");
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
    }
}

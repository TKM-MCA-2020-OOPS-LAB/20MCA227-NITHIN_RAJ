//Using generic method perform Bubble sort
package javaprograms;
import java.util.*;
public class CO4Q9<T extends Comparable<? super T>>
{
    T[] array;
    CO4Q9(T[] array)
    {
        this.array = array;
    }
    public T[] bubbleSort()
    {
        for(int i = array.length; i>1; i--)
        {
            for(int j=0; j<i-1; j++)
            {
                if(array[j].compareTo(array[j+1])>0)
                {
                    swap(j,array);
                }
            }
        }
        return array;
    }
    public void swap(int index, T[] arr)
    {
        T temp = arr[index];
        arr[index] = arr[index+1];
        arr[index] = temp;
    }
    public static void main(String[] args) 
    {        
        Integer[] intArr = {31,2,53,4,25};
        CO4Q9<Integer> BubbleSort = new CO4Q9<Integer>(intArr);
        Integer[] SortedArray = BubbleSort.bubbleSort();
        System.out.println("Sorted Array:- "+Arrays.toString(SortedArray));
    }
}

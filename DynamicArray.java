import java.util.Iterator;

//
// Complete this class: 15 points
//
// Note:
// Do NOT copy from textbook, or any other sources
// Do NOT copy from code that we did in class (as it contains errors)
//
// Do READ CODE from textbook and in-class code and write it out as your own code
//
public class DynamicArray<T> implements Iterable<T>
{

    public static void main(String [] args)
    {
        //Optional: test DynamicArray here
        DynamicArray<Double> A = new DynamicArray<Double>();
        for(int i=0;i<20;i++) A.insert(Math.random()*100);
        for(Double v : A)
        {
          System.out.println(v);
        }
    }

    // Note: You can add any private data and methods here

    @SuppressWarnings("unchecked")
    DynamicArray() //constructor
    {

    }

    @SuppressWarnings("unchecked")
    public void insert(T data)
    {

    }

    public T get(int index) //get value by index
    {
      return null;
    }

    public int size() //size of the dynamic array
    {
      return 0;
    }

    void delete() //delete the last value in the array
  	{

  	}

  	void delete(int loc) //delete element at index "loc"
  	{

  	}

    boolean is_empty(){ return true;} //replace true

    public Iterator<T> iterator(){
      return null;
    }

    //Note: You will need to implement an iterator class using java.util.Iterator
    //      interface

    //TO DO: implement iterator here
}

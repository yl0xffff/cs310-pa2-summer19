
//
// Complete this class: 60 points + 20 bonus points
//
// Note:
// Do NOT copy from textbook, or any other sources
// Do NOT copy from code that we did in class (as it contains errors)
//
// Do READ CODE from textbook and in-class code and write it out as your own code
//

//
//TreeDictionary implements the (self-balance) binary search tree as a Dictionary
//
public class TreeDictionary<T extends Comparable<T>>
{
    public static void main(String [] args)
    {
        //Optional: test TreeDictionary here
    }

    public void insert(Record<T> record) //20 points + 10 bonus (AVL insertion)
    {
        //insert this records into the tree based on its keywords

        //1. for each keyword in this record, find the node that contains this keyword

        //2. if no such node exists, create a new node and assign the keyword

        //3. insert the record into the node

        //4. repeat until all keywords in the record are processed

        //(bonus: implement AVL insertion that balances the tree)
    }

    private LinkedList<Node<T>> InOrderTraversal() //10 points
    {
        //TODO : store in-order traversal of tree nodes in a linked list
        return null;
    }

    private void remove(T keyword) //10 points + 10 bonux (AVL remove)
    {
        //
        // TODO: use a keyword to remove a node that contains this word
        //

        //(bonus: implement AVL remove that balances the tree)
    }

    private Node<T> find(T keyword) //10 points
    {
        //
        // TODO: find a node that contains this keyword
        //
        return null;
    }

    //
    public DynamicArray<Record<T>> find( LinkedList<T> keywords  ) //10 points
    {
      //
      //TODO: find an array of records that contain the given keywords
      //

      //hint: use find_then_build

      return null; //return null when no records are found
    }

    // ----------------------------------------------------------------------
    //
    // !!! READ but Do NOT Change anything after this line
    //
    // ----------------------------------------------------------------------

    private class Node<T>
    {
        Node(){ records=new DynamicArray<Record<T>>();}
        Node(T k){ keyword=k; records=new DynamicArray<Record<T>>();}

        T keyword; //nodes are ordered by Keywords
        Node<T> parent;
        Node<T> left, right; //children
        DynamicArray<Record<T>> records;
        public String toString(){ return "["+keyword+" ("+records.size()+")]"; }
    }

    private Node<T> root; //root of the tree, can be null

    //build this tree by inserting the records
    public void build( DynamicArray<Record<T>> records )
    {
        for(Record<T> r : records)
        {
          insert(r);
        }
    }

    //find a node that contains the given keyword and then
    //build a tree using the records stored in the found node
    //finally return the tree
    private TreeDictionary<T> find_then_build(T keyword)
    {
        //
        //use keyword to find the node
        Node<T> node = find(keyword);
        if(node==null) return null;

        //
        //build the tree from this node's record
        TreeDictionary<T> newT=new TreeDictionary<T>();
        newT.build(node.records);

        //
        //remove the keyword from the Tree
        newT.remove(keyword);

        //done
        return newT;
    }

    public String toString()
    {
      //list all the keyworkds and number of records for each keyword
      //visit all nodes in In-Order traversal.
      LinkedList<Node<T>> nodes = InOrderTraversal();
      String S="Tree Dictionary: {";
      for(Node<T> node : nodes) S+=node.toString()+", ";
      if(!nodes.is_empty()) S=S.substring(0,S.length()-2);
      S+="}";
      return S;
    }
}

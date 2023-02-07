public class ListNode<T> {
    private T data;
    private ListNode next;
 
    
    // Constructor: Set data and reference to next node.
    public ListNode( T nodeData, ListNode nodeNext ) {
        data = nodeData;
        next = nodeNext;
    }
    
    
    // Accessor: Return the data for current ListNode object
    public T getData() {
        return data;
    }
     
    
    // Accessor: Return reference to next ListNode object
    public ListNode getNext() {
        return next;
    }

}
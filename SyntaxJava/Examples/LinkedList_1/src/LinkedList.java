import java.util.ArrayList;

class LinkedList<T> {
    private ListNode<T> front = null;
    

    // Prida prvek na zacatek
    public void pridejNaZacatek( T element ) {
        front = new ListNode<T>( element, front );
    }
    
    public void pridejNaZacatek2( T element ) {
        front = new ListNode<T>( element, front );
    }
    
    // Vraci pole objektu
    public ArrayList<T> vratPole() {
        
        ArrayList<T> shapeArray=new ArrayList<T>();
        
        ListNode<T> node=front;
        while (node!=null)
        {
            shapeArray.add(node.getData());
            node = node.getNext();
        }
        
        return shapeArray;
    }

    void add(String prvni_Objekt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
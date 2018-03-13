//**************************************************************************************************
// CLASS: Stack<E> (Stack.java)
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************

/**
 * Implements a generic stack data structure using a DList to store the elements.
 */
public class Stack<E> {

    private DList<E> mList;

    /**
     * Creates a new empty Stack by creating a new empty DList.
     */
    public Stack() {
        setList(new DList());
    }

    /**
     * Removes all of the elements from this Stack. After clear() returns this Stack is empty.
     */
    public void clear() {
        getList().clear();
    }

    /**
     * Accessor method for mList.
     */
    protected DList<E> getList() {
        return mList;
    }

    /**
     * Returns true if this Stack is empty.
     */
    public boolean isEmpty() {
        return getList().isEmpty();
    }

    /**
     * Returns the top element on this Stack without removing it.
     */
    public E peek() {
        return getList().get(0);
    }

    /**
     * Removes the top element from this Stack and returns it.
     */
    public E pop() {
        E top = getList().remove(0);
        return top;
    }

    /**
     * Pushes pData onto the top of this Stack.
     */
    public void push(E pData) {
        getList().prepend(pData);
    }

    /**
     * Mutator method for mList.
     */
    protected void setList(DList<E> pList) {
        mList = pList;
    }

    /**
     * Overrides toString() inherited from Object. Returns a String representation of the elements
     * of this Stack by calling the DList.toString() method.
     */
    @Override
    public String toString() {
        return getList().toString();
    }

    public void dup() {
        Integer top = getList().peek();
        getList().push(top);
    }

    public void rot() {
        Integer temp = getList().pop();
        Integer top = getList().pop();
        getList().push(temp);
        getList().push(top);
    }
    public char parity (String n) {
        /**
         * parity character =  '0' if s = "0"
         '1' if s = "1"
         '0' if s.charAt(0) equals the parity character of s.substring(1)
         '1' if s.charAt(0) does not equal the parity character of s.substring(1)

         */
        String t = n + p;
        if (n.charAt(0) == '0') {

        }
    }
}

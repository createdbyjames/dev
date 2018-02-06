/*-------------------------------------------------------------------------
// AUTHOR: James J. Kim
// FILENAME: Door.java
// SPECIFICATION: Door class
// FOR: CSE 110- Lab #5
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/

public class Door {

    //instance variable
    private String name;
    private String shades;

    // Constructor for Door class
    public Door(String newName, String newShades){
        name = newName;
        shades = newShades;
    }

    // Accessor methods
    public String getName(){
        return name;
    }

    public String getState() {
        return shades;
    }

    // Mutator to change the state of name
    public void setName(String newName){
        name = newName;
    }

    // Mutator to change the state of shade
    public void setState(String newState){
        shades = newState;
    }

    // Set the state to open
    public void open(){
        shades = "open";
    }

    // Set the state to close
    public void close(){
        shades = "close";
    }
}

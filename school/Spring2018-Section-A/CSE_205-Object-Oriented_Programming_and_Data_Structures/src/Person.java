public class Person {
    private String mName;

    public Person() {
        this("Bob Johnson");
    }

    public Person(String pName) {
        mName = pName;
    }

    public String getName() {
        return mName;
    }

    public void setName(String pName) {
        mName = pName;
    }
}


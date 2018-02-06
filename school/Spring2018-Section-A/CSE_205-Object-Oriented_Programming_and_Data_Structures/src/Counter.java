public class Counter implements ICounter {

    private int mCounter;

    public Counter() {
        mCounter = 0;
    }

    public void decrement() {
        mCounter--;
    }

    public int getCount() {
        return mCounter;
    }

    public void increment() {
        mCounter++;
    }

    public void reset() {
        mCounter = 0;
    }
}

public class Sub2 extends Super {

    private int mZ;

    @Override
    public int compute() {
        return super.compute() + (mZ * mZ);
    }
}

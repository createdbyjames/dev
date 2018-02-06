public class C {

    private int mX;
    private int mY = 0;
    private static final int A = 100;
    public static final int B = 200;

    public C() {
        setX(-1);
    }
    public C(int pX) {
        setX(pX);
    }

    public int getX() {
        return mX;
    }

    public void setX(int x) {
        mX = x;
    }

    public int getY() {
        return mY;
    }

    public void setY(int y) {
        mY = y;
    }

}

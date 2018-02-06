public class Worker extends Person {

    private double mSalary;

    public Worker(String pName, double pSalary) {
        super(pName);
        mSalary = pSalary;
    }

    public double getmSalary() {
        return mSalary;
    }

    public void setmSalary(double pSalary) {
        mSalary = pSalary;
    }
}

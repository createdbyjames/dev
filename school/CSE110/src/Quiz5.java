

public class Quiz5 {

    public static void main(String[] args) {

        // This employee worked 30.0 hours at $10.00 per hour
        WeeklyEmployee anEmp = new WeeklyEmployee( "Bob Berger", 30.7, 10.00 );

        System.out.println(anEmp.toString());

        System.out.println(anEmp.getName() + " grossed " + anEmp.getGrossPay());

        anEmp.setHours( 40.99 );

        System.out.println(anEmp.getName() + " grossed " + anEmp.getGrossPay());

    }
}

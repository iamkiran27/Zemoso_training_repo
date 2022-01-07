package FactoryDesignPAttern.Example_1;

public class Application {

    public static void main(String[] args) {
        Employee tester= EmployeeFactory.getInstance("Tester");
        tester.work();
        Employee developer= EmployeeFactory.getInstance("Developer");
        developer.work();
    }
}

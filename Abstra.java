
class Employee {

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    //Write your code here
    Employee(int empId, String empFirstName, String empSecondName, double empSalary){
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empSecondName = empSecondName;
        this.empSalary = empSalary;
    }
    void print(){
        System.out.println("employee full name "+ this.empFirstName +" " +this.empSecondName);
        System.out.println("employee annual package "+ this.empSalary * 12);
    }

}

public class Abstra {
    public static void main(String[] args) {

        //Write your code here
        Employee E1 = new Employee(101512031, "Sushil", "Kumar", 45000.58);
        Employee E2 = new Employee(101512032, "Tara", "Sharma", 51000.99);
        E1.print();
        E2.print();


    }
}

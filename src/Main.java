import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> list1 = new ArrayList<>();
        ArrayList<Employee> list2 = new ArrayList<>();

        Customer customers = new Customer(1362, "Aisulu", "Shalkarova", 35, "Female");
        customers.setID(1362);
        customers.setFirstName("Aisulu");
        customers.setLastName("Shalkarova");
        customers.setAge(22);
        customers.setGender("Female");
        list1.add(customers);

        Employee employees = new Employee(732, "Serik Nurdaulet", 21, "Male");
        employees.setIDEmployee(732);
        employees.setNameEmployee("Serik Nurdaulet");
        employees.setAgeEmployee(21);
        employees.setGenderEmployee("Male");
        list2.add(employees);

        System.out.println("----------------------------------------");


        System.out.println("Customer ID: " + customers.getID());
        System.out.println("Customer First Name: " + customers.getFirstName());
        System.out.println("Customer Last Name: " + customers.getLastName());
        System.out.println("Customer Age: " + customers.getAge());
        System.out.println("Customer Gender: " + customers.getGender());


        System.out.println("---------------------------------------");

        System.out.println("Employee ID: " + employees.getIDEmployee());
        System.out.println("Employee Name: " + employees.getNameEmployee());
        System.out.println("Employee Age: " + employees.getAgeEmployee());
        System.out.println("Employee Gender: " + employees.getGenderEmployee());

    }
}
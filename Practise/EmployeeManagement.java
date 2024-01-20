import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class Employee {
    public String name;
    public int id;
    public double salary;
}

class createEmployee {
    Employee emp;
    public createEmployee(){
        emp = new Employee();
    }
    public void setName(String name){
        emp.name = name;
    }
    public void setId(int id){
        emp.id = id;
    }
    public void setSalary(double salary){
        emp.salary = salary;
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        List<createEmployee> lst = new ArrayList<createEmployee>();
        int n;
        System.out.print("Enter the number of employees: ");
        Scanner myObj = new Scanner(System.in);
        n = myObj.nextInt();
        myObj.nextLine();
        String name;
        int id;
        double salary;
        createEmployee obj;
        System.out.println("Enter the employee details...");
        for (int i = 1; i<=n; i++){
            System.out.println("Employee "+i+": ");
            System.out.print("Name: ");
            name = myObj.nextLine();
            System.out.print("ID: ");
            id = myObj.nextInt();
            System.out.print("Salary: ");
            salary = myObj.nextDouble();
            myObj.nextLine();
            obj = new createEmployee();
            obj.setName(name);
            obj.setId(id);
            obj.setSalary(salary);
            lst.add(obj);
        }
        System.out.println("Employee Details are as follows...");
        for (createEmployee item: lst){
            System.out.println(item.emp.name+" "+item.emp.id+" "+item.emp.salary);
        }
        myObj.close();
    }
}

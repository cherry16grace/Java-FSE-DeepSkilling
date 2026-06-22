

public class EmployeeManagement {
    Employee[] employees;
    int count=0;
    public EmployeeManagement(int size){
        employees=new Employee[size];
    }
    public void addEmployee(Employee e){
        if(count<employees.length){
            employees[count]=e;
            count++;
            System.out.println("Employee added");
        }
        else{
            System.out.println("Array full")
        }
    }
    public void searchEmployee(int id){
        for(int i=0;i<count;i++){
            if(employees[i].employeeId==id){
                System.out.println("Found");
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Employee not found");
    }
    public void displayEmployees(){
        for(int i=0;i<count;i++){
            System.out.println(employees[i]);
        }
    }
    public void deleteEmployee(int id){
        for(int i=0;i<count;i++){
            if(employees[i].employeeId=id){
                for(int j=i;j<count-1;j++){
                    employees[j]=employees[j+1];
                }
                count--;
                System.out.println("deleted successfully");
                return;
            }
        }
        System.out.println("Employee not found");
    }
    public static void main(String[] args){
        EmployeeManagement system=new EmployeeManagement(5);
         system.addEmployee(
                new Employee(1,"John","Developer",50000)
        );


        system.addEmployee(
                new Employee(2,"Mary","Tester",40000)
        );


        system.addEmployee(
                new Employee(3,"Alex","Manager",70000)
        );



        System.out.println("\nAll Employees:");

        system.displayEmployees();



        System.out.println("\nSearch:");

        system.searchEmployee(2);



        System.out.println("\nDelete:");

        system.deleteEmployee(1);



        System.out.println("\nAfter Delete:");

        system.displayEmployees();

    }

    }

}


public class Employee {
    int eid;
    String name;
    String position;
    double salary;
    public Employee(int eid,String name,String position,double salary){
        this.eid=eid;
        this.name=name;
        this.position=position;
        this.salary=salary;
    }
    public String toString(){
        return eid + "|" + name + "|" +position + "|" + salary;
    }
}

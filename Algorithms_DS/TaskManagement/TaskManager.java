

public class TaskManager {
    Node head;
    class Node{
        Task task;
        Node next;
        Node(Task task){
            this.task=task;
            this.next=null;
        }
    }
    public void addTask(Task task){
        Node newNode = new Node(task);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void searchTask(int id){
        Node current=head;
        while(current!=null){
            if(current.task.taskId==id){
                System.out.println("task Found");
                System.out.println(current.task);
                return;
            }
            current=current.next;
        }
        System.out.println("Task Not Found");
    }
    public void displayTasks(){
        Node current=head;
        while(current!=null){
            System.out.println(current.task);
            current=current.next;
        }
    }
}

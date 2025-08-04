import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    ArrayList<Task> toDoList = new ArrayList<Task>();
    Scanner scan = new Scanner(System.in);

    void addTask (Scanner scan) {
        System.out.print("Enter a new task: ");
        String taskName = "";
        String taskDescription;
        if (scan.hasNext()){
            taskName = scan.next();
        }
        Task newTask = new Task(taskName);
        toDoList.add(newTask);

        System.out.println("Would you like add a description? yes / no: ");
        String answer = scan.next();
        if (answer.equals("yes")) {
            System.out.println("Enter the description: ");
            scan.nextLine();
            taskDescription = scan.nextLine();
            newTask.setDescription(taskDescription);
            System.out.println(" ");
        }
    }

    void editTask(Scanner scan) {
        System.out.print("What task needs change? \n Enter the number: ");
        int taskNumber = scan.nextInt();
        System.out.print("What would you like to do instead? ");
        String taskName = scan.next();
        Task editedTask = toDoList.get(taskNumber-1);
        editedTask.name = taskName;

    }
    void deleteTask(Scanner scan) {
      System.out.print("What task do you want to  remove? Enter the number: ");
      int taskNumber = scan.nextInt();
      toDoList.remove(taskNumber-1);
    }
    void markTaskDone (Scanner scan) {
        System.out.print("What task is done? Enter the number: ");
        int taskDoneNumber = scan.nextInt();
        Task taskDone = toDoList.get(taskDoneNumber-1);
        taskDone.isDone = true;
    }
    void printList(){
        System.out.println("Your task list: ");
        for (int i = 0; i < toDoList.size(); i++) {
            Task currentTask = toDoList.get(i);
            String taskIsDone = (currentTask.isDone) ? "done" : "not done";
            System.out.println((i + 1) + ". " + currentTask.name + " - " + taskIsDone);
            if (currentTask.getDescription() != null) {
                System.out.println("Task detail: " + currentTask.getDescription());
            }

        }
        System.out.println(" ");
    }
}



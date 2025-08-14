import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ToDoList toDo = new ToDoList();
        while (true) {
            menu();
            int cmd = 0;
            if (scan.hasNext()){
                cmd = scan.nextInt();
            } else {
                cmd = scan.nextInt();
            }
            switch (cmd) {
                case 1:
                    toDo.addTask(scan);
                    break;
                case 2:
                    if (toDo.toDoList.isEmpty()) {
                        System.out.println("There are no tasks");
                        System.out.println(" ");
                        break;
                    }
                    toDo.editTask(scan);
                    break;
                case 3:
                    toDo.deleteTask(scan);
                    break;
                case 4:
                    toDo.printList();
                    break;
                case 5:
                    toDo.markTaskDone(scan);
                    break;
                case 6:
                    toDo.filterByPriority();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("The instruction wasn't found. Try another one: ");
                    break;
            }
        }


    }

    static void menu() {
        System.out.println("Your task manager:");
        System.out.println("What do you want to do? Enter a number");
        System.out.println("1. Add a task");
        System.out.println("2. Change a task");
        System.out.println("3. Remove a task");
        System.out.println("4. Print the tasks");
        System.out.println("5. Mark a task - done");
        System.out.println("6. Filter");
        System.out.println("7. Exit");
    }
}

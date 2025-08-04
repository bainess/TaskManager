public class Task {
    String name;
    boolean isDone;
    String description;

    Task (String name){
        this.name = name;
        isDone = false;
    }

    void setDescription(String description){
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}

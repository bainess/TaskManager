public class Task {
    String name;
    boolean isDone;
    String description;
    private Priority priorityLevel;

    Task (String name){
        this.name = name;
        isDone = false;
    }

    void setDescription(String description){
        this.description = description;
    }

    public String getTaskDescription() {
        return this.description;
    }
    void setPriorityLevel(Priority priority){
        this.priorityLevel = priority;
    }
    Priority getPriorityLevel(){
        return priorityLevel;
    }
    public enum Priority{
        HIGH("urgent"),
        MIDDLE("better be done sooner"),
        LOW("take your time");

        private final String priorityDescription;

        Priority (String priorityDescription){
            this.priorityDescription = priorityDescription;
        }
            public String getPriorityDescription(){
            return priorityDescription;
        }
    }
}

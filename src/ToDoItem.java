public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
    public ToDoItem(String Description, boolean IsDone){
        this.description = Description;
        this.isDone = IsDone;
    }
    // need to set as false and leave single param for the desc

    public String getDescription(){
        return description;
    }

    public boolean getIsDone(){
        return isDone;
    }

    public void setDescription(String setDescription){
        this.description = setDescription;
    }

    public void setIsDone(boolean setIsDone){
        this.isDone = setIsDone;
    }
}

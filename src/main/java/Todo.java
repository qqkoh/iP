public class Todo extends Task {

    public Todo(String description, boolean isDone) {
        super(description, isDone);
    }

    @Override
    public String toString() {
        return "[T]" + getStatusIcon() + " " + super.toString();
    }

    @Override
    public String toFileString() {
        return "T" + super.toFileString();
    }
}

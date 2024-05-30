
	public class Main {
	    public static void main(String[] args) {
	        ToDoList toDoList = new ToDoList();

	        Task task1 = new Task("study maths", "at 8 am.");
	        Task task2 = new Task("eat lunch", "in restaurant at 7 pm.");

	        toDoList.addToDo(task1);
	        toDoList.addToDo(task2);

	        toDoList.viewToDoList();

	        toDoList.markToDoAsCompleted("study maths");

	        toDoList.viewToDoList();
	    }
	}

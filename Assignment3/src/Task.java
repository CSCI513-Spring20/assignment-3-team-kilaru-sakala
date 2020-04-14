public abstract class Task implements Runnable {
	String name;  //Name of the task
	boolean isFinished; //Variable to check if task is completed
	
	// Constructor of the class
	public Task(String name) {
		this.name = name;
		this.isFinished = false;
	}

	//Method to retrieve Name variable 
	public String getName() {
		return name;
	}
  
	//Method to retrieve isFinished variable 
	public boolean getIsFinished() {
		return isFinished;
	}
  
	//Method to set isFinished variable, invoked on task completion
	public void setIsFinished() {
		isFinished = true;
	}
}

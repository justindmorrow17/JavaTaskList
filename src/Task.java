import java.util.*;

public class Task {

	private String name;
	private String description;
	private String date;
	private boolean complete = false;

	Scanner scan = new Scanner(System.in);

	// no arguments constructor
	public Task() {
	}

	// constructor
	public Task(String name, String description, String date, boolean complete) {
			
			this.name = name;
			this.description = description;
			this.date = date;
			this.complete = complete;		
		}
	
	//get methods	
		public String getName() {
			return name;
		}
		
		public String getDescription() {
			return description;
		}
		
		public String getDate() {
			return date;
		}
	 	
		public boolean getComplete() {
			return complete;
		}
		
		//set methods
		public void setName(String name) {
			this.name = name;
		}
		
		public void setDescription(String description) {
			this.description = description;
		}
		
		public void setDate(String date) {
			this.date = date;
		}
		
		public void setComplete(boolean complete) {
			this.complete = complete;
		}

		@Override
		public String toString() {
			return "Task name=" + name + ", description=" + description + ", date=" + date + ", complete=" + complete;
		}
		
}

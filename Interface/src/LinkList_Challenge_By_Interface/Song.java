package LinkList_Challenge_By_Interface;

public class Song {
	String title;
	String duration;
	
	public Song(String name,String duration) {
		//System.out.println("name = "+ name);
		this.duration=duration;
		this.title=name;
	}

	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return this.title+" : "+ this.duration;
	}

	
}

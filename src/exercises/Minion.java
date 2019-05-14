package exercises;

public class Minion {

	private String name;
	private int eyes;
	private String color;
	private String master;
	
	Minion(String name, int numberOfEyes, String color, String master){
		this.name = name;
		this.eyes = numberOfEyes;
		this.color = color;
		this.master = master;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}
	
	

}

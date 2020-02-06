package mines.douai.alejandra.bean;

public class ModelBean {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return "Hello "+ getName()+ "!";
	}




}

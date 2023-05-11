package universidad;

public class Materia {
	private String name;
	private float grade;
	
	public Materia (String name, float grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public float getGrade() {
		return this.grade;
	}
}

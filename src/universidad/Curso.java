package universidad;
import java.util.ArrayList; 

public class Curso {
	ArrayList<Materia> materias;
	float grade;
	
	public Curso () {
		this.materias = new ArrayList<Materia>();
	}
	
	public void addMateria (Materia materia) {
		this.materias.add(materia);
	}	
	
	public float calculatePromedio () {
		this.grade = 0;
		
		for (int i = 0; i < this.materias.size(); i++) {
			this.grade += this.materias.get(i).getGrade();
	    }
		
		return this.grade / this.materias.size();
	}
}

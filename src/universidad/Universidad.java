package universidad;
import java.util.Scanner; 

public class Universidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		Curso curso = new Curso();
		
		System.out.println("Ingresa la calificación de Mátematicas...");
		String gradeRead = reader.nextLine(); 
		Materia matematicas = new Materia("Mátematicas", Float.parseFloat(gradeRead));
		curso.addMateria(matematicas);
		
		System.out.println("Ingresa la calificación de Lenguas...");
		gradeRead = reader.nextLine(); 
		Materia lenguas = new Materia("Lenguas", Float.parseFloat(gradeRead));
		curso.addMateria(lenguas);

		System.out.println("Ingresa la calificación de Historia...");
		gradeRead = reader.nextLine(); 
		Materia historia = new Materia("Historia", Float.parseFloat(gradeRead));
		curso.addMateria(historia);
		
		
		float grade = curso.calculatePromedio();
		
		if (grade >= 7) {
			System.out.println("Has pasado el curso :D, tu calificación es: " + grade);
		}
		
		if (grade < 7) {
			System.out.println("Has reprobado el curso :c, tu calificación es: " + grade);
		}
		
	}

}

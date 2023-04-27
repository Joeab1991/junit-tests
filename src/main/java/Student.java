import java.util.ArrayList;

public class Student {
	private String name;
	private long id;
	private ArrayList<Integer> grades;

	public Student(String name, long id) {
		this.name = name;
		this.id = id;
		this.grades = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}

	public void addGrade(int grade) {
		grades.add(grade);
	}

	public double getGradeAverage() {
		double sum = 0;
		for (int grade : grades) {
			sum += grade;
		}
		return sum / grades.size();
	}

	public void updateGrade(int index, int grade) {
		grades.set(index, grade);
	}

	public void deleteGrade(int index) {
		grades.remove(index);
	}
}


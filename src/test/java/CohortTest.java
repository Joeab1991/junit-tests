import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CohortTest {

	Cohort cohort = new Cohort();
	Student student = new Student(1, "Test");
	Student student2 = new Student(2, "Test2");
	//    - A `Cohort` instance can add a `Student` to the `List` of students.
	@Before
	public void setUp()
	{
		cohort.addStudent(student);
		cohort.addStudent(student2);
	}

	@Test
	public void testAddStudent() {
		cohort.addStudent(new Student(3, "Test3"));
		assertEquals(3, cohort.getStudents().size());
	}

	//    - A `Cohort` instance can get the current `List` of students.
	@Test
	public void testGetStudents() {

		assertEquals(2, cohort.getStudents().size());
	}
	//    - A `Cohort` instance can get the average, and it's being calculated correctly.
	@Test
	public void testGetCohortAverage() {
		student.addGrade(100);
		student.addGrade(50);
		student2.addGrade(50);
		student2.addGrade(50);
		assertEquals(62.5, cohort.getCohortAverage(), 0);
	}

	//Test finding student by id

	@Test
	public void testFindStudentById() {
		assertEquals(student2, cohort.findStudentById(2));
	}
}

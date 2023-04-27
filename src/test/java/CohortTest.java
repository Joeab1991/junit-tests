import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CohortTest {

	Cohort cohort = new Cohort();
	Student student = new Student(1, "Test");
	//    - A `Cohort` instance can add a `Student` to the `List` of students.
	@Before
	public void setUp() {
		cohort.addStudent(student);
	}

	@Test
	public void testAddStudent() {
		assertEquals(1, cohort.getStudents().size());
	}

	//    - A `Cohort` instance can get the current `List` of students.
	@Test
	public void testGetStudents() {
		assertEquals(1, cohort.getStudents().size());
	}
	//    - A `Cohort` instance can get the average, and it's being calculated correctly.
	@Test
	public void testGetCohortAverage() {
		student.addGrade(100);
		student.addGrade(50);
		assertEquals(75, cohort.getCohortAverage(), 0);
	}
}

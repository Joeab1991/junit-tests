import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

	Student s = new Student("Joe", 123456789);

	@Before
	public void setUp() {
		s.addGrade(100);
		s.addGrade(80);
		s.addGrade(90);
	}

	@Test
	public void testConstructor() {
		assertNotNull(s);
		assertEquals("Joe", s.getName());
		assertEquals(123456789, s.getId());
		assertEquals(0, s.getGrades().size());
	}

	@Test
	public void testHasMethods() {
		assertEquals(100, s.getGrades().get(0).intValue());

		//Test that getGrades returns the list of grades
		assertEquals(80, s.getGrades().get(1).intValue());

		// Test that the getGradeAverage method correctly returns the average of the students grades
		assertEquals(90, s.getGradeAverage(), 0);

	}

	@Test
	public void testUpdateGrade() {
		s.updateGrade(1, 95);
		assertEquals(95, s.getGrades().get(1).intValue());
	}

	@Test
	public void testDeleteGrade() {
		s.deleteGrade(1);
		assertEquals(2, s.getGrades().size());
	}
}

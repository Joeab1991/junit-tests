import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

	@Test
	public void testConstructor() {
		Student s = new Student("Joe", 123456789);
		assertNotNull(s);
		assertEquals("Joe", s.getName());
		assertEquals(123456789, s.getId());
		assertEquals(0, s.getGrades().size());
	}

	@Test
	public void testHasMethods() {
		Student s = new Student("Joe", 123456789);
		assertEquals("Joe", s.getName());
		assertEquals(123456789, s.getId());
		s.addGrade(100);
		assertEquals(100, s.getGrades().get(0).intValue());

		//Test that getGrades returns the list of grades
		s.addGrade(80);
		assertEquals(80, s.getGrades().get(1).intValue());

		// Test that the getGradeAverage method correctly returns the average of the students grades
		assertEquals(90, s.getGradeAverage(), 0);

	}
}

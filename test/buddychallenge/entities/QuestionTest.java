package buddychallenge.entities;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class QuestionTest {
	Question q;
	@Before
	public void setUp() throws Exception {
		q = new Question();
	}

	@Test
	public void testGetQuestion() {
		q.setQuestion("Favourite colour?");
		assertEquals(q.getQuestion(), "Favourite colour?");
	}
	
	@Test
	public void testGetOptions() {
		q.setQuestion("Favourite colour?");
		q.addOption("1.red");
		q.addOption("2.blue");
		assertEquals(q.getOptions().get(0), "1.red");
	}
	
	@Test
	public void testRemoveOption() {
		q.setQuestion("Favourite colour?");
		q.addOption("1.red");
		q.addOption("2.blue");
		assertEquals(q.getOptions().get(0), "1.red");
		q.removeOption("1.red");
		assertEquals(q.getOptions().get(0), "2.blue");
	}

}

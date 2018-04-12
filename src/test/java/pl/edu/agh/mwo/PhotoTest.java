package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhotoTest {

	@Test
	public void addComment() {
		Photo photo = new Photo();
		String comment = "Nice photo!";
		photo.addComment(comment);
		assertEquals(comment, photo.getComment());
		
	}

}

package pl.edu.agh.mwo;

import org.junit.Test;
import static org.junit.Assert.*;


public class Photo {
	private String comment;
	
	public void addComment(String comment){
	//	Photo myFoto = new Photo();
	//	myFoto.photoCount();
		//assertTrue(false);
		this.comment=comment;
		}
	public String getComment(){
		return comment;
	}
	}



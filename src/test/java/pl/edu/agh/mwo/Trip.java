package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class Trip {
	private String name;
	private String description;
	
	public String getName(){

		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	Collection<Photo> photos = new ArrayList<Photo>();
	
	public Collection<Photo> getPhotos() {
		return photos;
	}

	public void addPhoto(Photo photo) {
		photos.add(photo);
	}

}

package T5_AccessingCSM;

/*  Accessing Child specfic method using casting  */

class Media {
	public void play() {
		System.out.println("Media plays generic content");
	}
	public void displayInfo() {
		System.out.println("Displaying media information");
	}
}
class Video extends Media {
	public void play() {
		System.out.println("Video plays with animation");
	}
	public void adjustQuality() {
		System.out.println("Adjusting video quality settings");
	}
}
class Photo extends Media {
	public void play() {
		System.out.println("Photo shows with effects");
	}
	public void applyFilter() {
		System.out.println("Applying filter to photo");
	}
}

public class P1_Media {
	public static void main(String[] args) {
		Media video = new Video();
		Media photo = new Photo();
		
		video.play();
		photo.play();
		
		if(video instanceof Media)
			((Video)video).adjustQuality();
		if(photo instanceof Media)
			((Photo)photo).applyFilter();
	}
}

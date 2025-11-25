package ex1;
class Song{
	String title;
	String artist;
	int length;
	
	Song() {}
	
	Song(String title){
	this.title=title;
	}
		
	Song(String title, String artist){
	this.title=title;
	this.artist=artist;
	}
		
	Song(String title,String artist, int length){
	this.title=title;
	this.artist=artist;
	this.length=length;
	}
	
	public void printInfo() {
		System.out.println("title: "+title+", artist: "+artist+", length: "+length);
	}
}

public class SongTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Song s1 = new Song("Outward Bound", "Name", 180);
		Song s2 = new Song("jambalya", "Carperters");
		Song s3 = new Song("Yesterday");
		Song s4 = new Song();
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		s4.printInfo();
		
	}
}

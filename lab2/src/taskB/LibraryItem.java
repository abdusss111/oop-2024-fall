package taskB;

public abstract class LibraryItem {
	private int id;
	private String title;
	private String author;
	private int publicationYear;
	
	public LibraryItem() {
		
	}
	
	public LibraryItem(int id, String title, String author, int publicationYear) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	public LibraryItem(String title) {
		this.title = title;
	}
	
	public LibraryItem(int id) {
		this.id = id;
	}
	
	public LibraryItem(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public LibraryItem(int id, String title, String author) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public String toString() {
		return "Item's title: " + this.title + ", author: " + this.author + ", publication year: " + this.publicationYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

package taskB;

public class Book extends LibraryItem {
	private String description;
	private String ISBN;
	private int pages;
	
	public Book() {
		
	}
	
	public Book(int id, String title, String author, String description, String ISBN, int pages, int publicationYear) {
		super(id, title, author, publicationYear);
		this.description = description;
		this.ISBN = ISBN;
		this.pages = pages;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public void rent() {
		System.out.println("book named "+this.getTitle()+" is rented.");
	}
	
	public String toString() {
		return super.toString() + ", description: " + this.description + ", ISBN: " + this.ISBN + ", pages: " + this.pages;
	}

}

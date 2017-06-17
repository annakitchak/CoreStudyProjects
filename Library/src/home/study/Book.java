package home.study;

public class Book {
	private String bookName;
	private int yearOfPublication;
	private int numberOfPages;
	public Book(String bookName, int yearOfPublication, int numberOfPages) {
		super();
		this.bookName = bookName;
		this.yearOfPublication = yearOfPublication;
		this.numberOfPages = numberOfPages;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", yearOfPublication=" + yearOfPublication + ", numberOfPages="
				+ numberOfPages + "]";
	}
	
	
}

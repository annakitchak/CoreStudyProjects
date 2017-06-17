package home.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Library {
	private static Library library;
	public static Library getInstance(){
        if(library == null){
        	library = new Library();
        }
        return library;
    }
	
	Map<Author,List<Book>> map = new HashMap<>();
	Set<Entry<Author,List<Book>>> entrySet = map.entrySet();
	
	public void addAuthor(){
		System.out.println("Enter author height:");
		int height = Main.scanner.nextInt();
		System.out.println("Enter author weight:");
		int weight = Main.scanner.nextInt();
		System.out.println("Enter author age:");
		int age = Main.scanner.nextInt();
		System.out.println("Enter author name:");
		String name = Main.scanner.next();
		System.out.println("Enter author surname:");
		String surname = Main.scanner.next();
		Author author = new Author(height, weight, age, name, surname);
		map.put(author, new ArrayList<Book>());
	}
	
	public void addBookByAuthor(){
		System.out.println("Enter author name.");
		String name = Main.scanner.next();
		System.out.println("Enter author surname.");
		String surname = Main.scanner.next();
		boolean added = false;
		for (Entry<Author, List<Book>> entry : entrySet) {
			if(entry.getKey().getName().equalsIgnoreCase(name)&&entry.getKey().getSurname().equalsIgnoreCase(surname)){
				System.out.println("Enter book name.");
				String bookName = Main.scanner.next();
				System.out.println("Enter year of publication.");
				int year = Main.scanner.nextInt();
				System.out.println("Enter number of pages.");
				int pages = Main.scanner.nextInt();
				Book book = new Book(bookName, year, pages);
				entry.getValue().add(book);
				added = true;
			}
		}
		if(!added){
			System.out.println("This author not exist!");
		}
	}
	
	public void deleteBookByAuthor(){
		System.out.println("Enter author name.");
		String name = Main.scanner.next();
		System.out.println("Enter author surname.");
		String surname = Main.scanner.next();
		boolean author = false;
		for (Entry<Author, List<Book>> entry : entrySet) {
			if(entry.getKey().getName().equalsIgnoreCase(name)&&entry.getKey().getSurname().equalsIgnoreCase(surname)){
				author = true;
				System.out.println("Enter book name");
				String bookName = Main.scanner.next();
				boolean deleted = false;
				Set<Entry<Author, List<Book>>> set = map.entrySet();
				Iterator<Entry<Author,List<Book>>> iterator = set.iterator();
				while(iterator.hasNext()){
					Iterator<Book> bookIterator = iterator.next().getValue().iterator();
					while(bookIterator.hasNext()){
						if(bookIterator.next().getBookName().equalsIgnoreCase(bookName)){
							bookIterator.remove();
							deleted = true;
						}
					}
				}
				if(!deleted){
					System.out.println("Book not exist.");
				}
			}
		}
		if(!author){
			System.out.println("Author not exist.");
		}
	}
	
	public void deleteAuthorWithAllHisBooks(){
		System.out.println("Enter author name.");
		String name = Main.scanner.next();
		System.out.println("Enter author surname.");
		String surname = Main.scanner.next();
		boolean deleted = false;
		for (Entry<Author, List<Book>> entry : entrySet) {
			if(entry.getKey().getName().equalsIgnoreCase(name)&&entry.getKey().getSurname().equalsIgnoreCase(surname)){
				Set<Entry<Author, List<Book>>> set = map.entrySet();
				Iterator<Entry<Author, List<Book>>> iterator = set.iterator();
				while(iterator.hasNext()){
					iterator.remove();
				}
			}
		}		
	}
	
	public void deleteAllBooksByAuthor(){
		System.out.println("Enter author name.");
		String name = Main.scanner.next();
		System.out.println("Enter author surname.");
		String surname = Main.scanner.next();
		boolean deleted = false;
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : entrySet) {
			Iterator<Entry<Author, List<Book>>> iterator = set.iterator();
			if(entry.getKey().getName().equalsIgnoreCase(name)&&entry.getKey().getSurname().equalsIgnoreCase(surname)){
				while(iterator.hasNext()){
					/*Iterator<Book> bookIterator = */iterator.next().getValue().clear();;
//					while(bookIterator.hasNext()){
//						bookIterator.remove();
//						deleted = true;
//					}
				}
			}
		}
		if(!deleted){
			System.out.println("Author not exist.");
		}
	}
	
	public void sortAllBooksByAuthorByDateOfPublication(){

	}
	
	public void sortAllBooksByAuthorByNumberOfPages(){
		
	}
	
	public void printLibrary(){
		for (Entry<Author, List<Book>> entry : entrySet) {
			System.out.println(entry);
		}
	}
	
	public void start(){
		System.out.println("Enter 1 to add author to library.");
		System.out.println("Enter 2 to add book by author.");
		System.out.println("Enter 3 to delete book by author.");
		System.out.println("Enter 4 to delete author with all his books.");
		System.out.println("Enter 5 to delete all books by author.");
		System.out.println("Enter 6 to sort all books by author by date of publication.");
		System.out.println("Enter 7 to sort all books by author by number of pages.");
		System.out.println("Enter 8 to print library.");
		System.out.println("Enter 9 to exit");
		String user="";
		do{
			user = Main.scanner.next();
			switch(user){
			case "1":{
				addAuthor();
				break;
			}
			case "2":{
				addBookByAuthor();
				break;
			}
			case "3":{
				deleteBookByAuthor();
				break;
			}
			case "4":{
				deleteAuthorWithAllHisBooks();
				break;
			}
			case "5":{
				deleteAllBooksByAuthor();
				break;
			}
			case "6":{
				sortAllBooksByAuthorByDateOfPublication();
				break;
			}
			case "7":{
				break;
			}
			case "8":{
				printLibrary();
				break;
			}
			case "9":{
				System.exit(0);
				break;
			}
			default:{
				break;
			}
			}
		}while(!user.equals("9"));
	}
}

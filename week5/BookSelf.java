package week5;

public class BookSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book Book1 = new Book("Waivy","Sourav","SSBooks","2023-01-23");
		Book Book2 = new Book("Wave Art","Sourav","SiScoBooks","2023-02-03");
		
		System.out.printf("Book 1:\nTitle: ",Book1.getTitle(),"\nAuthor: ", Book1.getAuthor(),"\nPublisher: ",Book1.getPublisher(),"\nCopyrightDate: ",Book1.getCopyrightDate());
		System.out.printf("Book 2:\nTitle: ",Book2.getTitle(),"\nAuthor: ", Book2.getAuthor(),"\nPublisher: ",Book2.getPublisher(),"\nCopyrightDate: ",Book2.getCopyrightDate());	
		}

}

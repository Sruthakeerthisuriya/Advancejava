import com.Spring.aop.first.BookService;

public class ProblemMain {

	public static void main(String[] args) {

		BookService bookService = new BookService();

		System.out.println("getBookByAuthor call started");
		bookService.getBookByAuthor();
		System.out.println("getBookByAuthor call ended");
		
		System.out.println("getBookById call started");
		bookService.getBookById();
		System.out.println("getBookById call ended");
		
		bookService.addBook();
		
		System.out.println("getBookByName call started");
		bookService.getBookByName();
		System.out.println("getBookByName call ended");
		
		System.out.println("getBookByPriceLessThan call started");
		bookService.getBookByPriceLessThan();
		System.out.println("getBookByPriceLessThan call ended");
		
		bookService.deleteBook();

	}

}
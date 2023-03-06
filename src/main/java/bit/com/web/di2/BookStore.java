 package bit.com.web.di2;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "Bs")
@Scope(value = "prototype")
public class BookStore {
	//@Autowired
	//@Inject
	//@Qualifier(value="qv1")
	
	private Book book;
	private Book book2;

		
	public BookStore() {
		super();
	}
	public BookStore(Book book) {
		super();
		this.book = book;
	}
	public Book getBook() {
		return book;
	}
	//@Required
	@Autowired
	public void setBook(@Qualifier(value="qv1")Book book,@Qualifier(value="qv2")Book book2) {
		//this.book = book;
		//this.book2 = book2;
	}
	@Override
	public String toString() {
		return "BookStore [book=" + book + ", book2=" + book2 + "]";
	}

	
	
	
	
	
}

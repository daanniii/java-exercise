package array;

import java.awt.print.Book;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�¹���", "������"));
		library.add(new Book("�¹���", "������"));
		library.add(new Book("�¹���", "������"));
		library.add(new Book("�¹���", "������"));
		library.add(new Book("�¹���", "������"));
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("===���� for�� ��� ===");
		for(Book book : library) {
			book.showBookInfo();
		}
	}

}

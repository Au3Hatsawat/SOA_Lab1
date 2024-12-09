package th.ac.ku.kps.eng.cpe.soa.lab1;


import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import th.ac.ku.eng.kps.cpe.lab1.model.BookStore;

public class BookStoreToXML {
	public static void main(String[] args) throws Exception {
		BookStore b = new BookStore();
		b.setIsbn("0123456001");
		b.setTitle("Java For Dummies");
		b.setAuthor(Arrays.asList("Tan Ah Teck"));
		b.setCatagory(Arrays.asList("Programming"));
		b.setYear(2009);
		b.setEdition((byte)7);
		b.setPrice(19.99);
		
		BookStore c = new BookStore();
		c.setIsbn("0123456002");
		c.setTitle("More Java For Dummies");
		c.setAuthor(Arrays.asList("Tan Ah Teck"));
		c.setCatagory(Arrays.asList("Programming"));
		c.setYear(2008);
		c.setPrice(25.99);
		
		BookStore d = new BookStore();
		d.setIsbn("0123456001");
		d.setTitle("Java For Dummies");
		d.setAuthor(Arrays.asList("Bill Jones","James Cook","Mary Turing"));
		d.setCatagory(Arrays.asList("Fishing","Leisure"));
		d.setYear(2000);
		d.setLanguage("French");
		d.setEdition((byte)2);
		d.setPrice(19.99);
		
		List<BookStore> books = new ArrayList<BookStore>();
		books.add(b);
		books.add(c);
		books.add(d);
		
		Document doc = DocumentFactory.getInstance().createDocument();
		Element bookstore = doc.addElement("bookstore");
		for(BookStore eachBook : books) {
			Element book = bookstore.addElement("book");
			book.addAttribute("ISBN",eachBook.getIsbn());
			Element tilte = book.addElement("title");
			tilte.addText(eachBook.getTitle());
			for(String eachAuthor : eachBook.getAuthor()) {
				Element author = book.addElement("author");
				author.addText(eachAuthor);
			}
			for(String eachCategory : eachBook.getCatagory()) {
				Element category = book.addElement("category");
				category.addText(eachCategory);
			}
			Element year = book.addElement("year");
			year.addText(eachBook.getYear().toString());
			if(eachBook.getEdition() != null) {
				Element edition = book.addElement("edition");
				edition.addText(eachBook.getEdition().toString());
			}
			if(eachBook.getLanguage() != null) {
				Element lang = book.addElement("language");
				lang.addText(eachBook.getLanguage());
			}
			Element price = book.addElement("price");
			price.addText(eachBook.getPrice().toString());

		}
		
		
		
		FileOutputStream fos = new FileOutputStream("book.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fos , format);
		writer.write(doc);
		writer.flush();
		writer.close();
		fos.close();
	}
}

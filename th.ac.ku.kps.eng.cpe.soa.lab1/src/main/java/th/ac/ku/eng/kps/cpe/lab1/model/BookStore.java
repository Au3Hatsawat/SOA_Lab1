package th.ac.ku.eng.kps.cpe.lab1.model;

import java.util.List;

public class BookStore {
	private String title , language , isbn;
	private List<String> author , catagory ;
	private Integer year;
	private Byte edition;
	private Double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public List<String> getAuthor() {
		return author;
	}
	public void setAuthor(List<String> author) {
		this.author = author;
	}
	public List<String> getCatagory() {
		return catagory;
	}
	public void setCatagory(List<String> catagory) {
		this.catagory = catagory;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Byte getEdition() {
		return edition;
	}
	public void setEdition(Byte edition) {
		this.edition = edition;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}

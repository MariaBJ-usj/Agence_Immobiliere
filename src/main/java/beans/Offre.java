package beans;

import java.io.Serializable;

public class Offre implements Serializable {
	private Integer id;
	private String title;
	private Double price;
	
	public Offre() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}

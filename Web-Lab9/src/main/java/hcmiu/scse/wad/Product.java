package hcmiu.scse.wad;

public class Product {
	private String product = "No name specified";
	private String manufacturer = "No card specified";
	private String country = "No addr specified";
	private float price = 0.0f;

	
	public Product() {

	}
	
	public String getProduct() {
		return (product);
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getManufacturer() {
		return (manufacturer);
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getCountry() {
		return (country);
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public float getPrice() {
		return (price);
	}

	public void setPrice(float price) {
		this.price = price;
	}
}

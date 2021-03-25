package week4;

public class Address {
	private String country;
	private String province;
	private String city;
	private String street;
	private int Postcode;
	
	public Address(){
		
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPostcode(int postcode) {
		this.Postcode = postcode;
	}

	public String toString() {
		return "Address [country=" + country + ", province=" + province + ", city=" + city + ", street=" + street
				+ ", Postcode=" + Postcode + "]";
	}
	

}

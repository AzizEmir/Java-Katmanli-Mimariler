package Entities;

public class Kurs {
	private String ad;
	private int fiyat;
	
	public Kurs() {
		super();
	}
	public Kurs(String ad, int fiyat) {
		super();
		this.ad = ad;
		this.fiyat = fiyat;
	}
	//getters
	public String getAd() {
		return ad;
	}
	public int getFiyat() {
		return fiyat;
	}
	//setters
	public void setAd(String ad) {
		this.ad = ad;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	
	
	
}

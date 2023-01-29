package Entities;

public class Eğitmen {
	private String ad,soyad;
	public Eğitmen() {
	
	}
	public Eğitmen(String ad, String soyad) {
		super();
		this.ad = ad;
		this.soyad = soyad;
	}
	//getters
	public String getAd() {
		return ad;
	}
    public String getSoyad() {
		return soyad;
	}
    //setters
	public void setAd(String ad) {
		this.ad = ad;
		
	}		
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
}

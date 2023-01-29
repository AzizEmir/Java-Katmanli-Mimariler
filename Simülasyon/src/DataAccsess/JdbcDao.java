package DataAccsess;

import Entities.Eğitmen;
import Entities.Kategori;
import Entities.Kurs;

public class JdbcDao implements IEğitmenDao, IKategoriDao, IKursDao{

	@Override
	public void add(Kurs kurs) {
		System.out.println("JDBC ile Eklendi ; "
						   + "Kurs adi : "+ kurs.getAd() +", "
						   + "Fiyati : "+ kurs.getFiyat() + " TL." + "\n");
		
	}

	@Override
	public void add(Kategori kategori) {
		System.out.println("JDBC ile eklendi ; Kategori adi :" + kategori.getAd() +"." );
		
	}

	@Override
	public void add(Eğitmen eğitmen) {
		System.out.println("JDBC ile eklendi ; Egitmen adi : " + eğitmen.getAd() +" "+ eğitmen.getSoyad() + "." );
		
	}
	
}

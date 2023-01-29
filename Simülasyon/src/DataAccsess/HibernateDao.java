package DataAccsess;

import Entities.Eğitmen;
import Entities.Kategori;
import Entities.Kurs;

public class HibernateDao implements IEğitmenDao, IKategoriDao, IKursDao{

	@Override
	public void add(Kurs kurs) {
		System.out.println("Hibernate ile Eklendi " + kurs.getAd() + kurs.getFiyat() );
		
	}

	@Override
	public void add(Kategori kategori) {
		System.out.println("Hibernate ile eklendi : " + kategori.getAd() );
		
	}

	@Override
	public void add(Eğitmen eğitmen) {
		System.out.println("Hibernate ile eklendi : " + eğitmen.getAd() + eğitmen.getSoyad() );
		
	}

}

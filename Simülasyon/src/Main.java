import java.util.ArrayList;

import Business.EğitmenManager;
import Business.KategoriManager;
import Business.KursManager;
import DataAccsess.HibernateDao;
import DataAccsess.JdbcDao;
import Entities.Eğitmen;
import Entities.Kategori;
import Entities.Kurs;
import Logger.BaseLogger;
import Logger.DatabaseLogger;
import Logger.FileLogger;
import Logger.MailLogger;
public class Main {
	public static void main(String[] args) throws Exception {
		ArrayList<String> isimler= new  ArrayList<>();
		ArrayList<String> kurslar= new  ArrayList<>();

		Eğitmen eğitmen = new Eğitmen();
		eğitmen.setAd("Aziz Emir");
		eğitmen.setSoyad("Korkmaz");
		
		isimler.add(eğitmen.getAd());
		
		Kategori kategori = new Kategori();
		kategori.setAd("Java ");
		
		Kurs kurs = new Kurs();
		kurs.setAd("ileri seviye Java egitimi");
		kurslar.add(kurs.getAd());
		kurs.setFiyat(129736);
		
		/*-------------------------------------*/
		
		Eğitmen eğitmen2 = new Eğitmen();
		eğitmen2.setAd("Orhan");
		//Daha önceden kayıtlı olup olmadığını kontrol ediyoruz
		if(isimler.contains(eğitmen2.getAd())) {
			throw new Exception("Egitmen adi bir daha onceden kayitli olmamalidir.");
		}
		eğitmen2.setSoyad("Korkmaz");
		
		
		Kategori kategori2 = new Kategori();
		kategori2.setAd("C#");
		
		Kurs kurs2 = new Kurs();
		kurs2.setAd("C# ile otomasyon ornekleri");
		//Daha önceden kayıtlı olup olmadığını kontrol ediyoruz
		if(kurslar.contains(kurs2.getAd())) {
			throw new Exception("Kurs adi daha onceden kayitli olmamalidir.");
		}
		
		kurs2.setFiyat(0);
		
		BaseLogger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger() };
		
		EğitmenManager eğitmen_manager = new EğitmenManager(new JdbcDao(), loggers);
		KategoriManager kategor_manager = new KategoriManager(new HibernateDao(), loggers);
		KursManager kurs_manager = new KursManager(new JdbcDao(), loggers);
		
		
		eğitmen_manager.add(eğitmen); System.out.println(" ");
		kategor_manager.add(kategori); System.out.println(" ");
		kurs_manager.add(kurs);
		System.out.println("---------------------"); System.out.println(" ");
		/* 2. EĞİTMEN */
		eğitmen_manager.add(eğitmen2); System.out.println(" ");
		kategor_manager.add(kategori2); System.out.println(" ");
		kurs_manager.add(kurs2);
	}		
	
}

package Business;

import DataAccsess.IKategoriDao;
import Entities.Kategori;
import Logger.BaseLogger;

public class KategoriManager {
	private IKategoriDao kategoriDao;
	private BaseLogger[] loggers;
	
	public KategoriManager(IKategoriDao kategoriDao, BaseLogger[] loggers) {
		super();
		this.kategoriDao = kategoriDao;
		this.loggers = loggers;
	}
	
	public void add(Kategori kategori) throws Exception {
		if(kategori.getAd().trim().equals("")) {
			throw new Exception("Kategori adi bos gecilemez! ");
		}
		for (BaseLogger baseLogger : loggers) {
			baseLogger.Log(kategori.getAd());
		}
		
		kategoriDao.add(kategori);
	}
}

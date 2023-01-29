package Business;

import DataAccsess.IKursDao;
import Entities.Kurs;
import Logger.BaseLogger;

public class KursManager {
	private IKursDao kursDao;
	private BaseLogger[] loggers;
	
	public KursManager(IKursDao kurs, BaseLogger[] loggers) {
		super();
		this.kursDao = kurs;
		this.loggers = loggers;
	}
	
	public void add(Kurs kurs) throws Exception {
		if(kurs.getFiyat() < 0) {
			throw new Exception("Fiyat 0'dan kucuk olamaz! ");
		}
		for (BaseLogger baseLogger : loggers) {
			baseLogger.Log(kurs.getFiyat());
			baseLogger.Log(kurs.getAd());
		}
		kursDao.add(kurs);
	}
}

package Business;

import DataAccsess.IEğitmenDao;
import Entities.Eğitmen;
import Logger.BaseLogger;

public class EğitmenManager{
	private IEğitmenDao eğitmenDao;
	private BaseLogger[] loggers;
	
	public EğitmenManager(IEğitmenDao eğitmen, BaseLogger[] loggers) {
		super();
		this.eğitmenDao = eğitmen;
		this.loggers = loggers;
	}

	public void add(Eğitmen eğitmen) throws Exception{
		//Eğitmen adının tekrar edilmesi önlenmeli
		
		for (BaseLogger baseLogger : loggers) {
			baseLogger.Log(eğitmen.getAd() +" "+ eğitmen.getSoyad());
			
		}
		eğitmenDao.add(eğitmen);
		
	}
}
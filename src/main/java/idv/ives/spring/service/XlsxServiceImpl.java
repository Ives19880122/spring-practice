package idv.ives.spring.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idv.ives.spring.dto.ImportFile;

@Service
public class XlsxServiceImpl implements ExcelService{
	
	@Autowired
	private ImportFile importFile;
	private Logger logger = LogManager.getLogger(XlsxServiceImpl.class);
	
	@Override
	public void reader() {
		logger.info("xlsx reader!!");
	}
	
	@Override
	public void writer() {
		
	}

}

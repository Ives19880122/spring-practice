package idv.ives.spring.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idv.ives.spring.dto.ImportFile;

@Service
public class XlsServiceImpl implements ExcelService{
	
	@Autowired
	private ImportFile importFile;
	private Logger logger = LogManager.getLogger(XlsServiceImpl.class);
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void reader() {
		logger.info("xls reader!!");
//		try {
//			Workbook wb = WorkbookFactory.create(new File(importFile.getFilePath()));
//			importFile.setWorkbook(wb);
//		} catch (EncryptedDocumentException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void writer() {
		
	}

}

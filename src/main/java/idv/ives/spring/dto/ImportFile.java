package idv.ives.spring.dto;

import org.apache.poi.ss.usermodel.Workbook;

public class ImportFile {
	private String filePath;
	private Workbook workbook;
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Workbook getWorkbook() {
		return workbook;
	}
	public void setWorkbook(Workbook workbook) {
		this.workbook = workbook;
	}
}

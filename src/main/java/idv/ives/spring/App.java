package idv.ives.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import idv.ives.spring.config.AppConfig;
import idv.ives.spring.dto.ImportFile;
import idv.ives.spring.service.ExcelService;

public class App {
	
	public static void main( String[] args ){
    	AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);    	
    	// 1.檔案路徑
    	String path = ".xlsx";
    	ImportFile file = (ImportFile)ctx.getBean("importFile");
    	file.setFilePath(path);
    	// 2.確認檔案類型
    	ExcelService service = (ExcelService) (path.endsWith(".xlsx")
    		? ctx.getBean("xlsxServiceImpl")
    		: ctx.getBean("xlsServiceImpl"));
    	// 3. 讀取操作
    	service.reader();
    	// 4. 修改內容
    	/*************controller model*************/
    	// 5. 寫入操作
    	service.writer();
    	// 6. 程式結束
    	ctx.close();
    }
}

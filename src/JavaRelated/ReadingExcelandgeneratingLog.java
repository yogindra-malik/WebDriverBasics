package JavaRelated;

import org.apache.log4j.Logger;

public class ReadingExcelandgeneratingLog {

	public static void main(String[] args) {
		
		
		ExcelReader exl = new ExcelReader("C:\\Users\\yogindra\\Desktop\\Code\\testdata.xlsx");
		Logger log = Logger.getLogger("devpinoyLogger");
		String sheetname ="trainer";
		System.out.println(exl.getRowCount(sheetname));
		log.debug("getting the row count");
		System.out.println(exl.getColumnCount(sheetname));
		log.debug("getting the column count");
		System.out.println(exl.getCellData(sheetname, "name", 2));
		exl.setCellData(sheetname, "name", 4, "nishi");
		
		
	}

}

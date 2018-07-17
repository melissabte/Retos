package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.DesiredCapabilities;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Excelfacebook {
	Row row;
	String nameExcelfacebook;
	FileInputStream  fila;
	XSSFWorkbook workbook ;
	XSSFSheet sheet1;
	private String path;
	
	public Excelfacebook(String path) {
		this.path=path;
	}
	public  ArrayList<String> readExcelfacebook(int i) throws IOException{
	ArrayList <String> texto= new ArrayList();
	
	
//		String nombreArchivo="operaciones.xlsx";
//		String rutaArchivo= "C:\\Users\\melissa.bustamante\\Documents\\"+nombreArchivo;
//		String hoja="Sheet1";
//		
		   FileInputStream  fila = new FileInputStream(path);
			// leer archivo excel
			XSSFWorkbook workbook = new XSSFWorkbook(fila);
			//obtener la hoja que se va leer
			XSSFSheet sheet1 = workbook.getSheetAt(0);
			//obtener todas las filas de la hoja excel"
			Iterator<Row> rowIterator = sheet1.iterator();
			
			// se recorre cada fila hasta el final
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				//se obtiene las celdas por fila
				Iterator<Cell> cellIterator = row.cellIterator();
				Cell cell;
				//se recorre cada celda
				while (cellIterator.hasNext()) {
					// se obtiene la celda en específico y se la imprime
					cell = cellIterator.next();
					//System.out.print(cell.getStringCellValue()+" | ");
					String hola;
					switch(cell.getCellType()) {
	
							case Cell.CELL_TYPE_STRING:
					nameExcelfacebook = cell.getStringCellValue();
					
					if (nameExcelfacebook.equalsIgnoreCase("encontro")) { //COMPARA EL NOMBRE DE EXCEL Y EL NOMBRE DE FACEBOOK
						System.out.println("encontro un perfil");

					} else {
						System.out.println("NO se encontro");
					}
							    System.out.println(cell.getStringCellValue());
							    texto.add(cell.getStringCellValue());
							    break;
					
							case Cell.CELL_TYPE_BOOLEAN:
						    System.out.println(cell.getBooleanCellValue());
					
							    break;
							default:
								break;
				}
				
			}
			}
			workbook.close();
			return texto;
			
	}
	
	public void writeXLSXFile(ArrayList<String> dataexcel) throws IOException {
        for (int i = 0; i < dataexcel.size(); i++) {
                      row = sheet1.getRow(i);
                      row.createCell(3).setCellValue(dataexcel.get(i));
        }
        FileOutputStream fileOut = new FileOutputStream(new File("operaciones.xlsx"));
        workbook.write(fileOut);
        fileOut.close();
}

    
     
    


}



				

		
	


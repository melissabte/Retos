package com.accenture.GOOGLE;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;


public class App {
	static WebDriver driver;
	private static ArrayList<String> texto = new ArrayList();

	public static void main(String[] args) throws InterruptedException {
		String nombreArchivo = "operaciones.xlsx";
		String rutaArchivo = "C:\\Users\\melissa.bustamante\\Documents\\" + nombreArchivo;
		String hoja = "Sheet1";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\melissa.bustamante\\Downloads\\chromedriver_win32\\chromedriver.exe");

		System.out.println("WebDriver inicializado");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail");
		Thread.sleep(50);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement click1;
		WebElement click2;
		WebElement click3;
		WebElement click4;
		WebElement click5;
		WebElement click6;
		WebElement click7;
		WebElement click8;
		// google imagenes
		try (FileInputStream fila = new FileInputStream(new File(rutaArchivo))) {
			// leer archivo excel
			XSSFWorkbook worbook = new XSSFWorkbook(fila);
			// obtener la hoja que se va leer
			XSSFSheet sheet1 = worbook.getSheetAt(0);
			// obtener todas las filas de la hoja excel
			Iterator<Row> rowIterator = sheet1.iterator();

			Row row;// se recorre cada fila hasta el final
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				// se obtiene las celdas por fila
				Iterator<Cell> cellIterator = row.cellIterator();
				Cell cell;
				// se recorre cada celda
				while (cellIterator.hasNext()) {
					// se obtiene la celda en específico y se la imprime
					cell = cellIterator.next();
					// System.out.print(cell.getStringCellValue()+" | ");
					String hola;
					switch (cell.getCellType()) {

					case Cell.CELL_TYPE_NUMERIC:

						if (HSSFDateUtil.isCellDateFormatted(cell)) {

							System.out.println(cell.getDateCellValue());

						} else {

							System.out.println(cell.getNumericCellValue());
							hola = Double.toString(cell.getNumericCellValue());
							String[] division = hola.split("");
							for (String i : division) {
								texto.add(i);
							}
						}

						// System.out.println(cell.getNumericCellValue());

						break;

					case Cell.CELL_TYPE_STRING:

						System.out.println(cell.getStringCellValue());
						texto.add(cell.getStringCellValue());
						break;

					case Cell.CELL_TYPE_BOOLEAN:
						System.out.println(cell.getBooleanCellValue());

						break;
					}

				}
			}
			System.out.println();

		} catch (Exception e) {
			e.getMessage();
		}
		Thread.sleep(3000);
		click1 = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		click1.sendKeys("m.bustamante9514 \n");
		Thread.sleep(3000);
		click2 = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		click2.sendKeys("melissa1037644654 \n");
		Thread.sleep(3000);
		click3 = driver.findElement(By.xpath("//*[contains(@class,'T-I J-J5-Ji T-I-KE L3')]"));
		//*[contains(@class,'T-I J-J5-Ji T-I-KE L3')]
	//	click4 = driver.findElement(By.xpath("//*[@id=\":ae\"]"));
		for (String nombre : texto) {
			click3.click();
			Thread.sleep(3000);
	       click4=driver.findElement(By.xpath("//textarea[@name='to']"));
			Thread.sleep(3000);
			click4.sendKeys(nombre + " \n"); 
		click5 = driver.findElement(By.name("subjectbox")); // asunto 
		click5.sendKeys("prueba");
		Thread.sleep(3000);
		click6 = driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")); // mensaje "Am Al editable LW-avf"
		click6.sendKeys("se envio este mensaje de forma automatica por favor no responder");
		Thread.sleep(3000);
		click7 = driver.findElement(By.xpath("//div[@data-tooltip='Send ‪(Ctrl-Enter)‬']")); // envio
		click7.click();
        Thread.sleep(3000);
	}
		//click8 = driver.findElement(By.cssSelector("#\\3a 5p > div > div")); // envio
	//	click8.click();
	}
	}

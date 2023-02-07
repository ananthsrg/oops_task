//package nivi.org.demo;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//public class AppTest implements Comparator<T>{
//    
//  
//  public static void main(String args[]) {
//	  App app = new App();
//	  App app2 = new App();
//	  app = app2;
////    System.setProperty("webdriver.chrome.driver", "C:/Users/jeeva/Downloads/chromedriver_win32/chromedriver.exe");
////    WebDriver driver = new ChromeDriver();
////    driver.get("https://vsoftdigital.com/services/engineer/quality-assurance/");
////    List<WebElement> findElements = driver.findElements(By.xpath("//*[contains(@class,'wpb_column vc_column_container vc_col-sm-2')]//figure//img"));
////    System.out.println("No of tools is : "+findElements.size());
////    driver.close();
//	  
////	  String name = "ananth subramani";
////	  int a = 0;
////	  for (int i = 0; i < name.length(); i++) {
////		if(Character.compare(name.charAt(i), 'a') == 0) {
////			a++;
////		}
////	}
////	  System.out.println("This string has "+a+" a");
//	  
//	  int[] given = { 120,121 ,122 ,101 ,131 };
//	  ArrayList<Integer> ne = new ArrayList<Integer>(0);
//	  for(int oldn : given) {
//	
//	  int in = oldn;
//	  int newn = 0;
//	  while(oldn > 0) {
//		  newn = newn * 10; // 120
//		  int temp = oldn%10;
//		  newn = newn + temp; // 120+1 = 121
//		  oldn = oldn/10;
//	  }
//	  if (in == newn){
//	 ne.add(in);
//	  }
//	  
//	  public void  table() throws InterruptedException {
//			String Searchvalue ="Submitted";
//		        List<WebElement> row = driver.findElements(By.xpath("//table//tbody//tr"));
//		        int rowcount = row.size();
//		        System.out.println("No.of Rows in the Table : "+rowcount);
//		        System.out.println("No.of Cells in the Table : "+cellcount);
//		        for (int i = 1; i <= rowcount; i++) {  // for row
//		        	List<WebElement> col =  driver.findElements(By.xpath("//table//tbody//tr["+i+"]//td"));
//		        	for (int j = 1; j <= col.size(); j++) { // for in row coloum 
//		        		String text = driver.finElement("//table//tbody//tr["+i+"]//td["+j+"]").getText();
//			            System.out.println("Cell Value : "+text);
//			            if (text.equalsIgnoreCase(Searchvalue)) {
//			            	driver.finElement("//table//tbody//tr["+i+"]//td[1]").click();
//			                break;
//			            }
//					}
//		            
//		        }	
//	}
//	  
//	  }
//	  
//	  
//	  System.out.println("Palindrom numbers are: ");
//	  ne.stream().forEach(System.out::println);
//	  
//	  
//	  
//	  
//	  
//  }
//
//
//
//
//}

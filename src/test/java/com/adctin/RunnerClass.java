package com.adctin;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.base_class.Base_Class;
import com.helper.Page_Object_Manager;
import com.pom.Book_Hotel;
import com.pom.Booking_Confiration1;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;
import com.pom.User_Detail;

public class RunnerClass extends Base_Class {

	public static WebDriver driver = Browser_config("chrome");

    public static Page_Object_Manager pom = new  Page_Object_Manager(driver);
	
    public static Logger log = Logger.getLogger(RunnerClass.class);
 
    public static String path="C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Testcase---Hotel booking.xlsx";
    
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		PropertyConfigurator.configure("log4j.properties");
		
		getUrl("https://adactinhotelapp.com");	
		
		log.info("Url launch");

		inputKeys(pom.get_Instance_ud().getUsername(),particular_Data(path, 8, 5));

		inputKeys(pom.get_Instance_ud().getPassword(),particular_Data(path, 9, 5));

		clickOnElement(pom.get_Instance_Login().getLogin_Btn());

		clickOnElement(pom.get_Instance_Search().getLocation());

		dropdown("byText",pom.get_Instance_Search().getLocation(), "Melbourne");

		clickOnElement(pom.get_Instance_Search().getHotels());

		dropdown("byText",pom.get_Instance_Search().getHotels(),"Hotel Sunshine");

		dropdown("byIndex",pom.get_Instance_Search().getRoomtype(),"4");

		dropdown("byIndex",pom.get_Instance_Search().getRooms(),"1");

        inputKeys(pom.get_Instance_Search().getCheckindate(),"02/02/2022");
		
		inputKeys(pom.get_Instance_Search().getCheckout(),"04/02/2022");

		dropdown("byIndex",pom.get_Instance_Search().getAdults(),"2");

		dropdown("byIndex",pom.get_Instance_Search().getChildrenperroom(),"3");

		clickOnElement(pom.get_Instance_Search().getSubmit());

		log.warn("booking detail");
        
		clickOnElement(pom.get_Instance_Select().getRadioButton());

		clickOnElement(pom.get_Instance_Select().getClick());

		inputKeys(pom.get_Instance_book().getFirstname(),particular_Data(path, 33, 5));

		inputKeys(pom.get_Instance_book().getLastname(),particular_Data(path, 34, 5));

		inputKeys(pom.get_Instance_book().getAddress(),particular_Data(path, 35, 5));

		inputKeys(pom.get_Instance_book().getCreditno(),"1234432156788756");

		dropdown("byIndex",pom.get_Instance_book().getCardtype(),"3");

		dropdown("byIndex",pom.get_Instance_book().getMonth(),"4");

		dropdown("byIndex",pom.get_Instance_book().getYear(),"12");

		inputKeys(pom.get_Instance_book().getcvno(),particular_Data(path, 40, 5));

		clickOnElement(pom.get_Instance_book().getBooknow());

		sleep(5000);
		
		log.fatal("payment paid");

		clickOnElement(pom.get_Instance_booking().getItenary());

		clickOnElement(pom.get_Instance_booking().getLogout());

		takeScreenshot("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_NK\\Screenshot\\image1.png");

		close();	

		log.error("sussesfully login");
		

	}






}
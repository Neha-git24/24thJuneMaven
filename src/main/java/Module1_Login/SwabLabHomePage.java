package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwabLabHomePage 
{
@FindBy(xpath = "//button [text()='Open Menu']") private  WebElement Menu;

   WebDriver d1;
   
   public SwabLabHomePage(WebDriver d)
   {
	   this.d1=d;
	   
	   PageFactory.initElements(d, this);
   }
   public String verifyTitle(Object expTitle)
   {
	   String actTitle=d1.getTitle();
	   
	   
	   if(actTitle.equals(expTitle))
	   {
		   System.out.println("TC Pass");
	   }
	   else
	   {
		   System.out.println("TC fail");
	   }
	return actTitle;
   }
	   
	   public void clickOnMenubtn()
	   {
		   Menu.click();
	   }
	public String verifyTitle() 
	{
		// TODO Auto-generated method stub
		return null;
	}
   }



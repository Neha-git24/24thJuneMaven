package Module1_Login;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SwabLabMenuPage 
{
@FindBy(xpath = "//a [text()='Logout']") private  WebElement Logout;


public SwabLabMenuPage(SearchContext d1)
{
	PageFactory.initElements(d1, this);
}

public void ClickOnBtn()
{
	Logout.click();
}

}
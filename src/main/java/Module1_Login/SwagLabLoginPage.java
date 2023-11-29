package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
@FindBy(xpath="//input[@id='user-name']") private WebElement UN;
@FindBy(xpath = "//input[@type='password']")private WebElement Pwd;
@FindBy(xpath = "//input[@id='login-button']" ) private WebElement Login;

public SwagLabLoginPage(WebDriver d)
{
	PageFactory.initElements(d, this);
}

public void enterUN(String username)
{
	UN.sendKeys(username);
}
public void enterPwd(String Password)
{
	Pwd.sendKeys(Password);
}
public void ClickOnLoginBtn()
{
	Login.click();
}
}

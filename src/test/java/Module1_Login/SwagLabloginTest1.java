package Module1_Login;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import LiabraryFiles.BaseClass;
import LiabraryFiles.UtilityClass;

public class SwagLabloginTest1 extends BaseClass
{
	SwagLabLoginPage s;
	SwabLabHomePage r;
	SwabLabMenuPage e;
   
	@BeforeClass
	public void Openbrowser() throws Exception 
	{
		     InitializeBrowser();
			 s=new SwagLabLoginPage(d);
			 r=new SwabLabHomePage(d);
			 e=new SwabLabMenuPage (d);
			
	}
	@BeforeMethod
	public void LoginToApp() throws InterruptedException, IOException
	{
		
	    s.enterUN(UtilityClass.getTD(1 ,0));
	    Thread.sleep(2000);
	    s.enterPwd(UtilityClass.getTD(1, 1));
	    Thread.sleep(2000);
	    s.ClickOnLoginBtn();
		
	 }
	@Test
	public void VerifyTitle() throws InterruptedException, Exception
	{
		String actTitle=r.verifyTitle();
		String expTitle= UtilityClass.getTD(1, 2);
		Assert.assertEquals(actTitle, expTitle,"Failed:both results are diff");
	}
		
    @AfterMethod
   public void Logout() throws InterruptedException
       {
		r.clickOnMenubtn();
		Thread.sleep(2000);
		e.ClickOnBtn();
		
		}
    @AfterClass
	public void Closebrowser() 
	{
		d.quit();
	}

}

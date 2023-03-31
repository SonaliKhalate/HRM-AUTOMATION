package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement leave;
	
	@FindBy(xpath="//span[text()='Time']")
	private WebElement time;
	
	@FindBy(xpath="//span[text()='Recruitment']")
	private WebElement recruitment;
	
	@FindBy(xpath="//span[text()='My Info']")
	private WebElement myinfo;
	
	@FindBy(xpath="//span[text()='Performance']")
	private WebElement performance;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboard ;
	

	@FindBy(xpath="//span[text()='Directory']")
	private WebElement directory;

	@FindBy(xpath="Maintenance")
	private WebElement maintenance ;

	@FindBy(xpath="//span[text()='Buzz']")
	private WebElement buzz;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAdminTab() 
	{
		admin.click();
	}
	public void getTextFromAdminTab() 
	{
		System.out.println(admin.getText());
	}
	
	public void clickOnPimTab() 
	{
		pim.click();
	}
	
	public void clickOnleaveTab() 
	{
		leave.click();
	}


	public void clickOnTimeTab() 
	{
		time.click();
	}
	
	public void clickOnRecruitmentTab() 
	{
		recruitment.click();
	}
}



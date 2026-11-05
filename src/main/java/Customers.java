import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customers {

    public Customers(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    @FindBy(linkText = "+ Add Customer")
    WebElement addCustomer;

    public void clickAddCustomer()
    {
        addCustomer.click();
    }
}

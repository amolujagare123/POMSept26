import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomer {

    public AddCustomer(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "f_name")
    WebElement txtName;

    // java selenium +++


    @FindBy(id = "f_email")
    WebElement txtEmail;

    @FindBy(id = "f_phone")
    WebElement txtPhone;

    @FindBy(id = "f_company")
    WebElement txtCompany;

    @FindBy(id = "f_credit")
    WebElement txtCreditLimit;

    @FindBy(name = "city")
    WebElement txtCity;

    @FindBy(name = "country")
    WebElement txtCountry;

    @FindBy(name = "status")
    WebElement drpStatus;

    @FindBy(name = "address")
    WebElement txtAddress;

    @FindBy(name = "notes")
    WebElement txtNotes;

    @FindBy(className = "btn-primary")
    WebElement btnAddCustomer;

    @FindBy(linkText = "Cancel")
    WebElement lnkCancel;

    public void setName(String name)
    {
        txtName.clear();
        txtName.sendKeys(name);
    }

    public void setEmail(String email)
    {
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }

    public void setPhone(String phone)
    {
        txtPhone.clear();
        txtPhone.sendKeys(phone);
    }

    public void setCompany(String company)
    {
        txtCompany.clear();
        txtCompany.sendKeys(company);
    }

    public void setCreditLimit(String creditLimit)
    {
        txtCreditLimit.clear();
        txtCreditLimit.sendKeys(creditLimit);
    }

    public void setCity(String city)
    {
        txtCity.clear();
        txtCity.sendKeys(city);
    }

    public void setCountry(String country)
    {
        txtCountry.clear();
        txtCountry.sendKeys(country);
    }

    public void setStatus(String status)
    {
        Select select = new Select(drpStatus);
        select.selectByValue(status);   // "active" or "inactive"
    }

    public void setAddress(String address)
    {
        txtAddress.clear();
        txtAddress.sendKeys(address);
    }

    public void setNotes(String notes)
    {
        txtNotes.clear();
        txtNotes.sendKeys(notes);
    }

    public void clickAddCustomer()
    {
        btnAddCustomer.click();
    }

    public void clickCancel()
    {
        lnkCancel.click();
    }
}

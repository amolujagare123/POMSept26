import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class AddCustomerTest {

    WebDriver driver;

    @BeforeClass
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://amolujagare.com/stockmaster/");

        Login login = new Login(driver);
        login.setUsername("amolujagare@gmail.com");
        login.setPassword("admin123");
        login.clickLogin();
    }

    @Test
    public void addCustomerTest()
    {
        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickCustomers();

        Customers customers = new Customers(driver);
        customers.clickAddCustomer();

        // random suffix so every run creates a unique customer
        int random = new Random().nextInt(10000);

        AddCustomer addCustomer = new AddCustomer(driver);
        addCustomer.setName("John Doe " + random);
        addCustomer.setEmail("john" + random + "@company.com");
        addCustomer.setPhone("99757" + random);
        addCustomer.setCompany("Scripting Logic");
        addCustomer.setCreditLimit("50000");
        addCustomer.setCity("Pune");
        addCustomer.setCountry("India");
        addCustomer.setStatus("active");
        addCustomer.setAddress("MG Road, Pune");
        addCustomer.setNotes("Created by automation - " + random);
        addCustomer.clickAddCustomer();
    }

    @AfterClass
    public void teardown()
    {
        if (driver != null)
        {
          //  driver.quit();
        }
    }
}

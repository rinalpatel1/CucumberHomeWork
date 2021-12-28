package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver;


    @Given("^User open browser And Enter Url$")
    public void user_open_browser_And_Enter_Url()  {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }
    @Then("^User click on Register Option$")
    public void user_click_on_Register_Option()  {
        driver.findElement(By.className("ico-register")).click();

    }

    @Then("^User is on register page and verify the Register page Title$")
    public void user_is_on_register_page_and_verify_the_Register_page_Title()  {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);

    }

    @Then("^User will click on Female Gender$")
    public void user_will_click_on_Female_Gender()  {
        driver.findElement(By.id("gender-female")).click();

    }

    @Then("^User will Enter First name and Last name$")
    public void user_will_Enter_First_name_and_Last_name()  {
        driver.findElement(By.id("FirstName")).sendKeys("Rinal");
        driver.findElement(By.id("LastName")).sendKeys("Patel");

    }

    @Then("^User will Enter Day,Month,Year$")
    public void user_will_Enter_Day_Month_Year() {
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("23");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("May");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1983");

    }

    @Then("^User will Enter EmailID$")
    public void user_will_Enter_EmailID()  {
        driver.findElement(By.id("Email")).sendKeys("testerrinpatel@gmail.com");

    }

    @Then("^User will Enter Company Name$")
    public void user_will_Enter_Company_Name()  {
        driver.findElement(By.id("Company")).sendKeys("Unify");


    }

    @Then("^User will Enter Password$")
    public void user_will_Enter_Password()  {
        driver.findElement(By.id("Password")).sendKeys("test123");

    }

    @Then("^User will Enter Confirm Password$")
    public void user_will_Enter_Confirm_Password()  {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");

    }

    @Then("^User will click on Register button\\.$")
    public void user_will_click_on_Register_button()  {
        driver.findElement(By.id("register-button")).click();

    }

    @Then("^User will be on HomePage\\.$")
    public void user_will_be_on_HomePage()  {
        String title = driver.getTitle();
        System.out.println("Homepage Title:" +title);
        Assert.assertEquals("nopCommerce demo store. Register",title);
        driver.close();

    }


}












  //  @When("^User Enter \"([^\"]*)\" and \"([^\"]*)\" and Click on Login(\\d+)$")
  //  public void user_Enter_and_and_Click_on_Login(String arg1, String arg2, int arg3)  {



 //   @When("^user Enter \"([^\"]*)\" and \"([^\"]*)\" and Click on Login(\\d+)$")
 //   public void user_Enter_and_and_Click_on_Login(String arg1, String arg2, int arg3)  {



 //   @Then("^User is on login page and Verify the login page Title$")
 //   public void user_is_on_login_page_and_Verify_the_login_page_Title() {



  //  @When("^User Enter Username and Password and Click on Login(\\d+)$")
  //  public void user_Enter_Username_and_Password_and_Click_on_Login(int arg1, DataTable arg2)  {


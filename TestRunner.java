import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestRunner extends SetUp {

 LoginPage loginPage;
  @Test
    public void doLogin(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage= new LoginPage(driver);
        loginPage.doLogin();
         //String urlActual=driver.getCurrentUrl();
        //String urlExpected="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
       // Assert.assertTrue(urlActual.equals(urlExpected));

    }

    @Test
    public void NormalTest(){

       System.out.println("Normal Test");
    }
  @Test
    public void urlValidate(){
        String url = driver.getCurrentUrl();
        System.out.println("This is URL"+url);


    }

}

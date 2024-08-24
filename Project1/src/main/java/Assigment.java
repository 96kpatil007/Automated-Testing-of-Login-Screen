import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assigment {
    WebDriver driver = new ChromeDriver();                          // Creating a Instance of WebDriver by Upcasting
    @Test(description = "valid UserName and Valid Password")
    public void valid_UserName_And_ValidPassword(){
        driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");    // Launching the url

        WebElement email= driver.findElement(By.id("username"));                //Creating Webelement for username
        WebElement password= driver.findElement(By.id("password"));             //Creating Webelement for Password
        WebElement loginbtn=driver.findElement(By.cssSelector("button[type='submit']"));            //Creating Webelement for loginButton
        email.sendKeys("shubhkangune@gmail.com");                           // Sending the input for Username TextBox by sendkeys method
        password.sendKeys("Shubham11");                     //Sending the input for Password By sendkeys method
        loginbtn.click();                                   //Click on the login button

        String expectedUrl ="https://app.germanyiscalling.com/cv/upload/";              //Determine the expected url in String
        String actualUrl=driver.getCurrentUrl();                //fetching the Actual Url bu getCurrentUrl method
        assert actualUrl.equals(expectedUrl);                   // Using assert to verify the expected and outcome result
        driver.close();                                         // close the browser
    }
    @Test
    public void invalidEmailAndValidPassword(){
        driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");            // Launching the url

        WebElement email= driver.findElement(By.id("username"));                        //Creating Webelement for username
        WebElement password= driver.findElement(By.id("password"));                       //Creating Webelement for Password
        WebElement loginbtn=driver.findElement(By.cssSelector("button[type='submit']"));                //Creating Webelement for loginButton
        email.sendKeys("patiloopa@gmail.com");                                      // Sending the input for Username TextBox by sendkeys method
        password.sendKeys("Shubham11");                                             // Sending the input for Password TextBox by sendkeys method
        loginbtn.click();                                   //Click on the login button
        WebElement errorMessage=driver.findElement(By.cssSelector("div[class='alert alert-danger']"));          //Creating Webelement for ErrorMsg
        String expectedMsg="Please enter a correct username and password. Note that both fields may be case-sensitive.";    //Determine the expected text in String
        String actualMsg=errorMessage.getText();        //fetching the Actual Text  getText method
        assert actualMsg.equals(expectedMsg);           // Using assert to verify the expected and outcome result

    }

    @Test
    public void validUserName_InvalidPasswor(){
        driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");       // Launching the url

        WebElement email= driver.findElement(By.id("username"));                //Creating Webelement for username
        WebElement password= driver.findElement(By.id("password"));              //Creating Webelement for Password
        WebElement loginbtn=driver.findElement(By.cssSelector("button[type='submit']"));        //Creating Webelement for loginButton
        email.sendKeys("shubhkangune@gmail.com");                  // Sending the input for Username TextBox by sendkeys method
        password.sendKeys("Shubha1");               // Sending the input for Password TextBox by sendkeys method
        loginbtn.click();               //Click on the login button
        WebElement errorMessage=driver.findElement(By.cssSelector("div[class='alert alert-danger']"));                   //Creating Webelement for ErrorMsg
        String expectedMsg="Please enter a correct username and password. Note that both fields may be case-sensitive.";    //Determine the expected text in String
        String actualMsg=errorMessage.getText();         //fetching the Actual Text  getText method
        assert actualMsg.equals(expectedMsg);               // Using assert to verify the expected and outcome result
        // driver.close();

    }
    @Test
    public void nocredentials(){
        driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");       // Launching the url

        WebElement loginbtn=driver.findElement(By.cssSelector("button[type='submit']"));        //Creating Webelement for loginbutton
loginbtn.click();               //Click on the login button
WebElement errorMsg=driver.findElement(By.cssSelector("div[class='alert alert-danger']"));          //Creating Webelement for ErrorMsg
String accutalErrorMsg=errorMsg.getTagName();           //fetching the Actual tagname  getTagName method
String expectedErrorMsg="div";                          ////Determine the expected tagName in String
        assert accutalErrorMsg.equals(expectedErrorMsg);        // Using assert to verify the expected and outcome result
    }

}
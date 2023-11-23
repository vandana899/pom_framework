package orangehrm;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	public class login  {
	    WebDriver driver;
	    //constructor
	    //method having same class name
	    public login(WebDriver d){
	        super();
	        driver=d;
	        PageFactory.initElements(driver, this);
	    }
	    @FindBy(name = "username") 
	    WebElement username;
	    @FindBy(name = "password")
	    WebElement password;
	    @FindBy(className = "oxd-button")
	    WebElement button;
	    
	
	    
	    public void enterusername(String user) {
	        username.sendKeys(user);
	    }
	    
	    public void enterpassword(String pass) {
	        password.sendKeys(pass);
	    }
	    
	    public void click() {
	       
	        button.click();
	    }
	}


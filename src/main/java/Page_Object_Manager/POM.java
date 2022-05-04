package Page_Object_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.acation.BookNow;
import com.acation.Finalstep;
import com.acation.Login_Page;
import com.acation.Pom2;
import com.acation.RadioButton;

public class POM {
	public WebDriver driver;
	
	private Login_Page l;
	private Pom2 p;
	private RadioButton r;
    private BookNow b;
    private Finalstep f;
   
    public POM(WebDriver driver1) {
    	this.driver=driver1;
    	PageFactory.initElements(driver, this);
	}

	public Login_Page getInstanceDriver() {
		if (l==null) {
			 l = new Login_Page(driver);
			
		}
		return l;
	}

	public RadioButton getInstanceL() {
		if (r==null) {
			r=new RadioButton(driver);
			
		}
		return r;
	}

	public Pom2 getInstanceP() {
		if (p==null) {
			 p = new Pom2(driver);
			
		}
		return p;
	}

	public BookNow getInstanceB() {
		if (b==null) {
			 b = new BookNow(driver);
			
		}
		return b;
	}
    
    public Finalstep getInstanceF() {
    	if (f==null) {
    		f=new Finalstep(driver);
			
		}
		return f;
    }
    
    
    
    
}

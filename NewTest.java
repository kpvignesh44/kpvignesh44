package tsting;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

public class NewTest {
  @Test(groups= {"functional testing","retesting testing"})
  public void login() {
	  System.out.println("login");
  }
  @Test(groups= {"functional testing","retesting testing"})
  public void login2() {
	  System.out.println("login");
  }
  public void login3() {
	  System.out.println("login");
  }
  
}

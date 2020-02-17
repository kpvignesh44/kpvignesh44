package tsting;

import org.testng.annotations.Test;

public class NewTest2 {
	@Test(groups= {"functional testing","retesting testing"})
	  public void login() {
		  System.out.println("login");
	  }
	  @Test(groups= {"functional testing","retesting testing"})
	  public void login2() {
		  System.out.println("login");
	  }
}

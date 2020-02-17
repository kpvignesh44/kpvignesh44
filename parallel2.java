package tsting;

import org.testng.annotations.Test;

public class parallel2 {
	@Test(priority=4)
	  public void test1() {
		  
		  System.out.println("Test case 3");
	  }
	  @Test(priority=3)
	  public void test2() {
		  
		  System.out.println("Test case 4");
	  }
}

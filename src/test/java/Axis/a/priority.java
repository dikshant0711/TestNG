package Axis.a;

import org.testng.annotations.Test;

public class priority {
@Test
public void testcase1() {
	System.out.println("Testcase 1 executed sucessfully");
}
@Test(priority = 0)
public void testcase2() {
	System.out.println("Testcase 2 Executed successfully");
}

@Test(priority = 1)
public void testcase3() {
	System.out.println("Test case 3 executed success");	
}

}

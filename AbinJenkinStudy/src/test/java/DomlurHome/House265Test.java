package DomlurHome;

import org.testng.annotations.Test;

public class House265Test 
{
 @Test (groups ="smoke" )
 public void DistanceToLalBagh()
 {
	 System.out.println("Distance from Domlur house to Lalbagh is 8km");
 }
 @Test (groups ="smoke" )
 public void DistanceToQspiders() 
 {
	 System.out.println("Distance from Domlur house to Qspiders is 13km");
 }
 @Test (groups = "regression")
 public void DistanceToTestYantra() 
 {
	 System.out.println("Distance from Domlur house to TestYantra is 17km");
 }
 
}

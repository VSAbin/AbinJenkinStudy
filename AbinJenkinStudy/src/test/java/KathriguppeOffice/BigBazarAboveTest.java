package KathriguppeOffice;

import org.testng.annotations.Test;

public class BigBazarAboveTest
{
 @Test (groups ="smoke" )
 public void DistanceToNayandalli() 
 {
	 System.out.println("Distance from TestYantra to Nayandalli is 13km");
 }
 @Test (groups = "regression")
 public void DistanceToKengeri() 
 {
	 System.out.println("Distance from TestYantra to Kengeri is 26km");
 }
 @Test (groups = "regression")
 public void DistanceToMysore() 
 {
	 System.out.println("Distance from TestYantra to Mysore is 123km");
 }
}

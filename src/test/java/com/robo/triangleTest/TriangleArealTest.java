/**
 * Created by jakkab on 13/01/2016.
 */
package com.robo.triangleTest;

import com.robo.triangle.TraingleArea;
import org.junit.Assert;
import org.junit.Test;

public class TriangleArealTest {

   @Test
   public void areaCalculationForDouble() throws Exception {

      TraingleArea tArea = new TraingleArea();

      Assert.assertTrue( "area of triangle with height 11.11 and base 12.12 is not correct",tArea.calcAreaOfRightTriangle(11.11, 12.12)==67.3266);

   }

   @Test
   public void areaCalculationForZero() throws Exception {

      TraingleArea tArea = new TraingleArea();

      Assert.assertTrue( "area of triangle with height 0 and base 12.12 is not correct",tArea.calcAreaOfRightTriangle(0, 12.12)==0);

   }

   @Test
   public void areaCalculationForInt() throws Exception {

      TraingleArea tArea = new TraingleArea();

      Assert.assertTrue("area of triangle with height 11 and base 12 is not correct", tArea.calcAreaOfRightTriangle(11, 12) == 66.0);

   }

   @Test
   public void testareaCalculationThrowsExceptionForGreaterThan8Digits() {
      boolean thrown = false;
      TraingleArea tArea = new TraingleArea();
      try {
         tArea.calcAreaOfRightTriangle(111111111, 12);
      } catch (Exception e) {
         thrown = true;
      }

      Assert.assertTrue("Not throwing exception for more than 8 digits",thrown);
   }
   @Test
   public void testareaCalculationThrowsExceptionForNetgativeValues() {
      boolean thrown = false;
      TraingleArea tArea = new TraingleArea();
      try {
         tArea.calcAreaOfRightTriangle(-1, 12);
      } catch (Exception e) {
         thrown = true;
      }

      Assert.assertTrue("Not throwing exception for negative values",thrown);
   }
}

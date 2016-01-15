/**
 * Created by jakkab on 13/01/2016.
 */
package com.robo.triangle;

import org.junit.Assert;
import org.junit.Test;

public class TriangleAreaTest {

   @Test
   public void areaCalculationForDouble() throws Exception {

      TriangleAreaService tArea = new TriangleAreaService();

      Assert.assertTrue( "area of triangle with height 11.11 and base 12.12 is not correct", tArea.calcAreaOfRightTriangle(11.11, 12.12).equals("67.33"));

   }

   @Test
   public void areaCalculationForZero() throws Exception {

      TriangleAreaService tArea = new TriangleAreaService();

      Assert.assertTrue( "area of triangle with height 0 and base 12.12 is not correct",tArea.calcAreaOfRightTriangle(0, 12.12).equals("0.00"));

   }

   @Test
   public void areaCalculationForInt() throws Exception {

      TriangleAreaService tArea = new TriangleAreaService();

      Assert.assertTrue("area of triangle with height 11 and base 12 is not correct", tArea.calcAreaOfRightTriangle(11, 12).equals("66.00"));

   }

   @Test
   public void testAreaCalculationThrowsExceptionForGreaterThan8Digits() {
      boolean thrown = false;
      TriangleAreaService tArea = new TriangleAreaService();
      try {
         tArea.calcAreaOfRightTriangle(111111111, 12);
      } catch (Exception e) {
         thrown = true;
      }
      Assert.assertTrue("Not throwing exception for more than 8 digits",thrown);
   }
   @Test
   public void testAreaCalculationThrowsExceptionForNegativeValues() {
      boolean thrown = false;
      TriangleAreaService tArea = new TriangleAreaService();
      try {
         tArea.calcAreaOfRightTriangle(-1, 12);
      } catch (Exception e) {
         thrown = true;
      }

      Assert.assertTrue("Not throwing exception for negative values",thrown);
   }
}


/**
 * Created by jakkab on 13/01/2016.
 */

package com.robo.triangle;

import java.text.DecimalFormat;

public class TraingleArea {

   double height;
   double base;
   double areaOfTriangle;

   public double calcAreaOfRightTriangle(double height, double base) throws Exception {

      if(height>9999999.99||base>9999999.99||height<0||base<0){
         throw new Exception("you have entered more than 8 digits");
      }
      else {

         double r = (base * height) / 2;
         DecimalFormat twoDForm = new DecimalFormat("0.00");
         return r;
      }
   }
}

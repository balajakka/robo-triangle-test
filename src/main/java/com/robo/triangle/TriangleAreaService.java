package com.robo.triangle;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class TriangleAreaService {

   private static final String TWO_DECIMAL_PLACES = "0.00";
   private static final double MAX_INPUT_VALUE = 9999999.99;
   private static final int MIN_INPUT_VALUE = 0;

   /**
    * Calculate triangle area
    *
    * @param height The triangle height
    * @param base The triangle base.
    * @return The area.
    * @throws Exception In case of any errors.
    */
   public String calcAreaOfRightTriangle(double height, double base) throws Exception {
      if (height > MAX_INPUT_VALUE || base > MAX_INPUT_VALUE || height < MIN_INPUT_VALUE || base < MIN_INPUT_VALUE) {
         throw new Exception("you have entered more than 8 digits");
      } else {
         double r = (base * height) / 2;
         DecimalFormat decimalFormat = new DecimalFormat(TWO_DECIMAL_PLACES);
         System.out.println(decimalFormat.format(r));
         return decimalFormat.format(r);
      }
   }
}

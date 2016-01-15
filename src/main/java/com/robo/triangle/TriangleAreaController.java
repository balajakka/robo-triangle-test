package com.robo.triangle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * This does goes here
 */
@Controller
public class TriangleAreaController {

   @Autowired
   private TriangleAreaService triangleAreaService;

   /**
    * The controller to get triangle area
    *
    * @return The triangle area
    * @throws Exception if there are any errors.
    */
   @RequestMapping(value = {"/triangle/area/{height}/{base}"}, method = {RequestMethod.GET})
   @ResponseBody
   public String getTriangleArea(@PathVariable("height") String height, @PathVariable("base") String base) throws Exception {
      return triangleAreaService.calcAreaOfRightTriangle(Double.valueOf(height), Double.valueOf(base));

   }
}

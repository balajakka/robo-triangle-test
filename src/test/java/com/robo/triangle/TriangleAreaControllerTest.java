package com.robo.triangle;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class TriangleAreaControllerTest {

   @Mock
   private TriangleAreaService triangleAreaService;

   @InjectMocks
   private TriangleAreaController triangleAreaController;

   private MockMvc mockMvc;

   @Before
   public void setUp() {
      MockitoAnnotations.initMocks(this);
      this.mockMvc = MockMvcBuilders.standaloneSetup(triangleAreaController).build();
   }

   @Test
   public void testGetTriangleArea() throws Exception {
      Mockito.when(triangleAreaService.calcAreaOfRightTriangle(12.0, 11.0)).thenReturn("66.00");
      this.mockMvc.perform(get("/triangle/area/12.0/11.0")).andExpect(content().string("66.00"));
   }
}
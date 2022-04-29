package com.nuvalence.test.rectangle.controller;

import com.nuvalence.test.rectangle.utils.PredefinedRectangles;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class RectangleControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void callRectanglesEndpoint() throws Exception {
        this.mockMvc.perform(get("/rectangles")).andExpect(status().isOk());
    }

    @Test
    public void callDrawRectanglesEndpoint() throws Exception {
        this.mockMvc.perform(post("/rectangles/draw").flashAttr("rectangles", PredefinedRectangles.containedRectangles())).andExpect(status().isOk());
    }

}
package com.nuvalence.test.rectangle.controller;

import com.nuvalence.test.rectangle.model.Rectangle;
import com.nuvalence.test.rectangle.model.Rectangles;
import com.nuvalence.test.rectangle.services.AdjacencyCalculator;
import com.nuvalence.test.rectangle.services.ContainmentCalculator;
import com.nuvalence.test.rectangle.services.IntersectionCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RectangleController {
    @Autowired
    private IntersectionCalculator intersectionCalculator;

    @Autowired
    private ContainmentCalculator containmentCalculator;

    @Autowired
    private AdjacencyCalculator adjacencyCalculator;

    @GetMapping("/rectangles")
    public String rectangles(Model model) {
        //Default rectangles values
        Rectangle rectangle1 = new Rectangle(5, 5, 100, 200);
        Rectangle rectangle2 = new Rectangle(10, 20, 100, 100);
        Rectangles rectangles = new Rectangles(rectangle1, rectangle2);
        model.addAttribute("rectangles", rectangles);
        return "main";
    }

    @PostMapping("/rectangles/draw")
    public String draw(@ModelAttribute Rectangles rectangles, Model model) {
        rectangles.setIntersection(intersectionCalculator.find(rectangles));
        rectangles.setContainment(containmentCalculator.find(rectangles));
        rectangles.setAdjacency(adjacencyCalculator.find(rectangles));
        model.addAttribute("rectangles", rectangles);
        return "main";
    }

}

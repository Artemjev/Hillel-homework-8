package com.hillel.artemjev.homework_8.processor.elements;

import com.hillel.artemjev.homework_8.entities.Point;
import com.hillel.artemjev.homework_8.processor.ElementProcessor;

public class PrintPointElementProcessor implements ElementProcessor<Point> {
    @Override
    public void run(Point elem) {
        System.out.println(elem);
    }
}

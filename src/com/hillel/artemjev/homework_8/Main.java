package com.hillel.artemjev.homework_8;

import com.hillel.artemjev.homework_8.entities.Point;
import com.hillel.artemjev.homework_8.processor.ArrayProcessor;
import com.hillel.artemjev.homework_8.processor.ElementProcessor;
import com.hillel.artemjev.homework_8.processor.elements.PrintIntElementProcessor;
import com.hillel.artemjev.homework_8.processor.elements.PrintPointElementProcessor;

public class Main {

    public static void main(String[] args) {

        Integer[] arrayInt = new Integer[]{1, 2, 3};
        ElementProcessor<Integer> elementProcessorInt = new PrintIntElementProcessor();
        ArrayProcessor<Integer> processorInt = new ArrayProcessor<>(arrayInt);
        processorInt.process(elementProcessorInt);

        Point[] arrayPoint = new Point[]{
                new Point(0, 1),
                new Point(2, 3),
                new Point(4, 5),
                new Point(6, 7),
        };
        ElementProcessor<Point> elementProcessorPoint = new PrintPointElementProcessor();
        ArrayProcessor<Point> processorPoint = new ArrayProcessor<>(arrayPoint);
        processorPoint.process(elementProcessorPoint);
    }
}

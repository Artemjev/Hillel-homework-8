package com.hillel.artemjev.homework_8.processor.elements;

import com.hillel.artemjev.homework_8.processor.ElementProcessor;

public class PrintIntElementProcessor implements ElementProcessor<Integer> {
    @Override
    public void run(Integer elem) {
        System.out.println(elem);
    }
}

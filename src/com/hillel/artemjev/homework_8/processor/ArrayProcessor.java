package com.hillel.artemjev.homework_8.processor;


public class ArrayProcessor<T> {
    private T[] arrayT;

    public ArrayProcessor(T[] arrayT) {
        this.arrayT = arrayT;
    }

    public void process(ElementProcessor<T> elementProcessor) {
        for (T elem : arrayT) {
            elementProcessor.run(elem);
        }
    }
}

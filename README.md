***TODO:***
-----------------------------
Create a generic interface **ElementProcessor\<T>** containing a **run(T e)** method that takes a value of the given type and returns nothing.

Also develop a generic class **ArrayProcessor\<T>** containing an array of elements of type **T**. The class must have a **process** method that takes an **ElementProcessor** of the appropriate type and calls its **run** method on each array element.

 *For example, an implementation of an interface might look like:*
```
public class PrintIntElementProcessor implements ElementProcessor<Integer> {
  @Override
  public void run(Integer element) {
  System.out.println(elem);
  }
}
```
 *And the use of all this:*
```
Integer[] arr = new Integer[]{1,2,3};
ElementProcessor<Integer> elemProcessor = new PrintIntElementProcessor();
ArrayProcessor<Integer> processor = new ArrayProcessor<>(arr);
processor.process(elemProcessor);//will display all elements of the array
```

***Задание:***
-----------------------------
Написать шаблонный интерфейс **ElementProcessor\<T>** содержащий метод **run(T e)**, принимающий значение заданного типа и ничего возвращающий.

Так же написать шаблонный класс **ArrayProcessor\<T>**, хранящий массив элементов типа **T**. Класс должен иметь метод **process** принимающий **ElementProcessor** соответствующего типа и вызывающий его метод **run** на каждом элементе массива.

 *Например, реализация интерфейса может иметь вид:*
```
public class PrintIntElementProcessor implements ElementProcessor<Integer> {
  @Override
  public void run(Integer elem) {
  System.out.println(elem);
  }
}
```
 *А использование этого всего:*
```
Integer[] arr = new Integer[]{1,2,3};
ElementProcessor<Integer> elemProcessor = new PrintIntElementProcessor();
ArrayProcessor<Integer> processor = new ArrayProcessor<>(arr);
processor.process(elemProcessor);//выведет все элементы массива
```

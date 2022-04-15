***TODO:***
-----------------------------

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
 *А использование этого всего*
```
Integer[] arr = new Integer[]{1,2,3};
ElementProcessor<Integer> elemProcessor = new PrintIntElementProcessor();
ArrayProcessor<Integer> processor = new ArrayProcessor<>(arr);
processor.process(elemProcessor);//выведет все элементы массива
```

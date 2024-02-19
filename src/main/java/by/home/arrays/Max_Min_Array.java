package by.home.arrays;

import java.util.*;
import java.util.function.Consumer;

public class Max_Min_Array {
    public static void main(String[] args) {

//как обнаружить самый большой элемент в массиве традиционным способом.
        Integer[] a = new Integer[]{85, 18, 3, 50, 24};
        if (a.length == 0) throw new NoSuchElementException();
        Integer max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
        }
        System.out.println("max: " + max);
//простой алгоритм вычисления наибольшего элемента в коллекции (списочном массиве,)
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(32);
        arr.add(21);
        if (arr.isEmpty()) throw new NoSuchElementException();
        var largest = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > largest) {
                largest = arr.get(i);
            }
        }
        System.out.println("largest: " + largest);
//Для связного списка не существует эффективного
//произвольного доступа, но можно воспользоваться итератором:

// можно сделать мето, который будет принимать разные типы
// public static <Т extends Comparable> Т max(Collection<T> с)
        Collection<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(8);
        if (l.isEmpty()) throw new NoSuchElementException();
        Iterator<Integer> iter = l.iterator();
        Integer largest1 = iter.next();
        while (iter.hasNext()) {
            var next = iter.next();
            if (largest1.compareTo(next) < 0) {
                largest1 = next;
            }
        }
        System.out.println("largest1: " + largest1);
// Мы можем использовать методы min() и max() класса collections в Java.
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(5);

        int max1 = Collections.max(arr1);
        System.out.println("Maximum is : " + max1);

        int min = Collections.min(arr1);
        System.out.println("Minimum is : " + min);
// использовать sort
//Для нахождения минимального и максимального значений из ArrayList нам просто нужно найти первый и последний
// элемент ArrayList, поскольку ArrayList отсортирован в порядке возрастания,
// тогда первый элемент будет наименьшим, а последний элемент - наибольшим среди всех элементов.
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(85);
        arr2.add(75);
        arr2.add(69);

        Collections.sort(arr2);
        for (int i = 0; i < arr2.size(); i++) {
            System.out.print(arr2.get(i) + " ");
        }
        System.out.println();

        int min2 = arr2.get(0);
        int max2 = arr2.get(arr2.size() - 1);

        System.out.println("Maximum is : " + max2);
        System.out.println("Minimum is : " + min2);

// если несколько мax чисел
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(1);
        arr3.add(2);
        arr3.add(2);

        ArrayList<Integer> arr4 = new ArrayList<>();
        var max3 = arr3.get(0);
        // находим max
        for (int i=1; i<arr3.size(); i ++){
            if(arr3.get(i)>max3){
                max3=arr3.get(i);
            }
        }
        // все max добавляем в коллекцию
        for (int i=1; i<arr3.size(); i ++){
            if(max3==arr3.get(i)){
                arr4.add(arr3.get(i));
            }
        }

        for (Integer elem : arr4) {
            System.out.println(elem);
        }

    }
}

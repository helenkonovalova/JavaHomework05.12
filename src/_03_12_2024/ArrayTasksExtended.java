package _03_12_2024;

import java.util.Arrays;

public class ArrayTasksExtended {

    // 16. Найти все пары элементов, сумма которых равна заданному числу.
    public static void task16() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        for (int i = 0; i < array.length; i++) {
            for (int f = 0; f < array.length; f++) {
                if (array[i] + array[f] == target) {
                    System.out.println("(" + array[i] + ", " + array[f] + ")");
                }
            }
        }
    }

    // 17. Проверить, есть ли в массиве дубликаты.
    public static void task17() {
        int[] array = {1, 2, 3, 4, 2};
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && (i != j)) {
                    hasDuplicates = true;
                    break;
                }
            }
        }
        System.out.println(hasDuplicates);
    }


    // 18. Удалить все нули из массива и сдвинуть элементы влево.
    public static void task18() {
        int[] array = {0, 1, 0, 3, 0};
        int countZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countZero++;
            }
        }
        int[] newArray = new int[array.length - countZero];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[a++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }


    // 20. Найти количество чисел, делящихся на заданное число без остатка.
    public static void task20() {
        int[] array = {10, 15, 20, 25, 39};
        int divisor = 5;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0){
                count++;
            }
        }
        System.out.println(count);
    }

    // 21. Упорядочить массив по возрастанию.
    public static void task21() {
        int[] array = {4, 2, 7, 1, 3};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // 22. Найти индекс первого отрицательного элемента.
    public static void task22() {
        int[] array = {1, 2, -3, 4, -5};
        int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0){
                    index = i;
                    break;
                }
            }
            System.out.println(index);
        }

    // 23. Подсчитать сумму чисел на четных индексах.
    public static void task23() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i+=2) {
               sum = sum + array[i];
        }
        System.out.println(sum);
    }

    // 24. Найти произведение всех элементов массива.
    public static void task24() {
        int[] array = {1, 2, 3, 4};
        int mult = array[0];
        for (int i = 0; i < array.length; i++) {
            mult = mult * array[i];
        }
        System.out.println(mult);
    }

    // 25. Переместить все отрицательные числа в конец массива.
    public static void task25() {
        int[] array = {1, -2, 3, -4, 5};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0){
                for (int j = 0; j < array.length; j++) {
                    temp = array[j];
                    array[i] = array[j];
                    array[i] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // 26. Найти количество уникальных элементов в массиве.
    public static void task26() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && (i != j)){
                    break;
                }
                if (j == array.length - 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    // 27. Переставить минимальный элемент массива в начало.
    public static void task27() {
        int[] array = {3, 2, 1, 4, 5};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]){
                min = i;
            }
        }
        if (min != 0){
            int temp = array[min];
            array[min] = array[0];
            array[0] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    // 28. Найти длину самой длинной последовательности одинаковых элементов.
    public static void task28() {
        int[] array = {1, 1, 2, 2, 2, 3, 3};
    }

    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
    public static void task29() {
        int[] array = {1, -2, 3, 4, -5};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

            }

        }
    }

    // 30. Удалить все дубликаты из массива.
    public static void task30() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

    }

    public static void main(String[] args) {
    }
}
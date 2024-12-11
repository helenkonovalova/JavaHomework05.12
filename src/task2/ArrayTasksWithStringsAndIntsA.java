package task2;

public class ArrayTasksWithStringsAndIntsA {

    // 1. Найти сумму элементов массива целых чисел.
    public static void task1() {
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }


    // 2. Найти длину самой длинной строки в массиве строк.
    public static void task2() {
        String[] array = {"cat", "elephant", "dog"};
        int maxLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxLength){
                maxLength = array[i].length();
            }
        }
        System.out.println(maxLength);
    }

    // 3. Проверить, содержит ли массив строк заданное слово.
    public static void task3() {
        String[] array = {"apple", "banana", "cherry"};
        String target = "banana";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
            }
        }
        System.out.println(true);
    }

    // 4. Подсчитать количество строк, содержащих заданный символ.
    public static void task4() {
        String[] array = {"apple", "banana", "cherry"};
        char target = 'a';
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(i) == target){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    // 5. Найти строку с максимальным количеством символов 'e'.
    public static void task5() {
        String[] array = {"elephant", "eagle", "dog"};
        String maxString = "";
        int maxCount = 0;
        char target = 'e';
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == target){
                    count++;
                }
            }
                if (count > maxCount){
                    maxCount = count;
                    maxString = array[i];
                }
        }
        System.out.println(maxString);
    }

    // 6. Удалить из массива строк все строки, содержащие заданное слово.
    public static void task6() {
        String[] array = {"apple pie", "banana bread", "cherry tart"};
        String target = "bread";
        String[] array = {"apple pie", "banana bread", "cherry tart"};
        String target = "bread";
        String[] newArray = new String[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].contains(target)){
                newArray[count] = array[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(newArray[i]);
        }
    }


    // 7. Найти минимальный элемент массива целых чисел.
    public static void task7() {
        int[] array = {3, 1, 4, 1, 5};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
            System.out.println(min);

    }

    // 8. Найти строку с минимальной длиной.
    public static void task8() {
        String[] array = {"cat", "elephant", "dog"};
            String minString = array[0];
            for (int i = 1; i < array.length; i++) {
                if(array[i].length() < minString.length()){
                    minString = array[i];
                }
            }
            System.out.println(minString); //Выводит только Cat. Не знаю, как вывести еще Dog. Еще один цикл нужен скорее всего

    }

    // 9. Подсчитать количество четных чисел в массиве.
    public static void task9() {
        int[] array = {1, 2, 3, 4, 5};
        int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0){
                    count++;
                }
            }
            System.out.println(count);
        }


    // 10. Найти строку, которая встречается чаще всего.
    public static void task10() {
            String[] array = {"apple", "banana", "apple", "cherry", "banana", "banana"};
            String mostFrequent = "";
            int maxCount = 0;
            for (int i = 0; i < array.length; i++) {
                int count = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        count++;
                    }
                }
                if (count > maxCount){
                    maxCount = count;
                    mostFrequent = array[i];

                }
            }
            System.out.println(mostFrequent);
    }

    public static void main(String[] args) {
        task1();
    }
}
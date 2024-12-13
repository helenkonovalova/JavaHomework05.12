package taski2;

public class ArrayTasksWithStringsAndIntsB {

    // 11. Отсортировать массив строк по длине.
    public static void task11() {
        String[] array = {"elephant", "cat", "dog"};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].length() > array[j].length()){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                System.out.println(Arrays.toString(array));
    }

    // 12. Найти и вывести все строки одинаковой длины.
    public static void task12() {
        String[] array = {"apple", "banana", "cherry", "dog", "cat"};
                for (int i = 0; i < array.length; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i].length() == array[j].length()) {
                            System.out.println(array[i] + " " + array[j]);
                        }
                    }
                }
    }

    // 13. Сравнить содержимое двух массивов целых чисел.
    public static void task13() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
                if (Arrays.equals(array1, array2)){
                    System.out.println("Одинаковы");
                } else {
                    System.out.println("Различны");
                }
    }

    // 14. Генерация нового массива из сумм элементов двух массивов.
    public static void task14() {
                int[] array1 = {1, 2, 3};
                int[] array2 = {4, 5, 6};
                int[] arraySum = new int[array1.length];
                for (int i = 0; i < array1.length; i++) {
                    arraySum[i] = array1[i] + array2[i];
                }
                System.out.println(Arrays.toString(arraySum));
    }

    // 15. Найти уникальные значения в массиве строк.
    public static void task15() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
                for (int i = 0; i < array.length; i++) {
                    int count = 0;
                    for (int j = 0; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            count++;
                        }
                    }
                    if (count == 1){
                        System.out.println(array[i]);
                    }
                }
            }

    // 16. Удалить дубликаты из массива строк. - не дорешала
    public static void task16() {

                String[] array = {"apple", "banana", "apple", "cherry", "banana"};
                String[] newArray = new String[array.length];
                int newIndex = 0;
                boolean isDupl = false;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < newIndex; j++) {
                        if (array[i].equals(newArray[j])) {
                            isDupl = true;
                            break;
                        }
                    }
                    if (!isDupl){
                        newArray[newIndex] = array[i];
                        newIndex++;
                    }

                }
                String[] uniqArray = new String[newIndex];
                System.out.println(Arrays.toString(uniqArray));

            }

    // 17. Объединить два массива строк в один.
    public static void task17() {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cherry", "date"};
    }

    // 18. Проверить, упорядочен ли массив строк по алфавиту.
    public static void task18() {
        String[] array = {"apple", "banana", "cherry"};
    }

    // 19. Найти строки, начинающиеся с заданной буквы.
    public static void task19() {
        String[] array = {"apple", "banana", "apricot", "cherry"};
        char target = 'a';
    }

    // 20. Создать массив строк из первых букв элементов другого массива.
    public static void task20() {
        String[] array = {"apple", "banana", "cherry"};
    }
}
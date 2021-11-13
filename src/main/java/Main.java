

public class Main {
    public static void main(String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;


        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arr = array.length;
        for (int i = 0; i < arr; i++) {
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
        }
        System.out.println("first level:");
        for (int i = 0; i < arr; i++) {
            System.out.println(i + "-" + array[i]);
        }

    }


//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void SecondLevel(int black) {
        int[] arr = new int[black];
        System.out.println("second level");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = i + 1;
                System.out.println(arr[i] + " ");
            }

        }
    }


//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void ThirdLevel(int Odin) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int array = arr.length;
        for (int i = 0; i < array; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        for (int i = 0; i < array; i++) ;

    }


//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void FourthLevel(int square) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) {
                    array[i][j] = 1;

                }


                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;


    public static void FifthLevel(int len, int initialValue) {
        int arr[] = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }

    }
}









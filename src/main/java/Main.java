public class Main {
    public static void main(String[] args) {
        elrmentNumber();
        valuesNumber();
        numberMultiplication();
        integerArray();
        twoArguments();
        maxElements();
        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    }

    public static void elrmentNumber() {


        int[] element = {1, 0, 0, 0, 1, 1, 1, 0, 1, 0};
        for (int i = 0; i < element.length; i++) {
            if (element[i] == 1) {
                element[i] = 0;
                System.out.print(element[i] + " ");
            } else element[i] = 0;
            element[i] = 1;
            System.out.print(element[i] + " ");

        }
    }

    //Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void valuesNumber() {
        {
            System.out.println();
        }
        int[] values = new int[101];
        for (int i = 1; i < values.length; i++) {
            values[i] = i;
            System.out.print(values[i] + " ");
        }

    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void numberMultiplication() {
        {
            System.out.println();
        }
        int[] number = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 6) number[i] = number[i] * 2;
                System.out.print(number[i] + " ");
            }
        }
    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void integerArray() {
        {
            System.out.println();
        }
        int[][]array = new int [6][6];
        array[0][0] = 1;
        array[1][1] = 1;
        array[2][2] = 1;
        array[3][3] = 1;
        array[4][4] = 1;
        array[5][5] = 1;
        array[0][5] = 1;
        array[1][4] = 1;
        array[2][3] = 1;
        array[3][2] = 1;
        array[4][1] = 1;
        array[5][0] = 1;
        for (int i = 0; i < array.length; i++ ){
            for(int j = 0; j < array[0].length; j++)
            System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
    //Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static void twoArguments() {
        {
            System.out.println();
        }
        int[]len = new int[10];
        int initialValue = 6;
        for (int i = 0; i < len.length;i++ ){
            len[i] = initialValue;
            System.out.print(len[i] + " ");
        }

    }
    //* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    // Этот кусок кода работает не корректно,не пойму в чем дело. Подскажите пожалуйста. Не стал гуглить, смысла не вижу тогда
    //его вообще делать.
    public static void maxElements() {
        {
            System.out.println();
        }
        int[] maxEl = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = 0;
        int min = 0;
        for (int i = 0; i < maxEl.length;i++){
            if (maxEl[i] > max){
             max = maxEl[i];}
            else if (maxEl[i] < min){
                min = maxEl[i];

            }

            System.out.print(min);


        }


    }
}





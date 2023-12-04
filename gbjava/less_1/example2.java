package less_1;
// Задание №2

// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

public class example2 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };

        int counter = 0;
        int mxCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
                if (mxCounter < counter) {
                    mxCounter = counter;
                }
            }

            else {
                counter = 0;
            }

        }
        System.out.println(mxCounter);

    }

}

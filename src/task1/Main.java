package task1;
// 1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{3, 7, 2, 9, 8, 4, 1, 5, 6};
//        BobbleSort.bobbleSort(array);
        BobbleSort.write(array);
    }
}

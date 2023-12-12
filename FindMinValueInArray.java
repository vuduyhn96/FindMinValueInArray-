import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bước 1: Khai báo mảng số nguyên với SIZE phần tử
        System.out.print("Nhập kích thước của mảng: ");
        int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
        System.out.println("Nhập giá trị cho mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
        int minValue = array[0];

        // Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mang
        for (int i = 1; i < SIZE; i++) {
            // So sánh lần lượt các phần tử tiếp theo với giá trị nhỏ nhất
            if (array[i] < minValue) {
                // Nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất, gán giá trị nhỏ nhất là phần tử tiếp theo
                minValue = array[i];
            }
        }

        // Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất.
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
}

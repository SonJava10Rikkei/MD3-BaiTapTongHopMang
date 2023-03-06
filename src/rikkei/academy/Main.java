package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Nhập số lượng phần tử của mảng từ bàn phím
        System.out.print("Nhập số lượng phần tử của mảng: ");
        n = scanner.nextInt();

        // Khai báo mảng
        int[] arr = new int[n];

        // Vòng lặp chính để hiển thị menu và thực hiện các chức năng
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử có chỉ số Chẵn và tính tổng");
            System.out.println("4. In giá trị các phần tử có chỉ số lẻ và tính tổng");
            System.out.println("5. In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("6. In giá trị max và min của các phần tử trong mảng");
            System.out.println("7. Sắp xếp mảng giảm dần ");
            System.out.println("8. Nhập vào một số nguyên, thống kê số lượng phần tử có giá trị bằng giá trị nhập vào ");
            System.out.println("9. Thoát chương trình");
            System.out.print("\nVui lòng nhập lựa chọn của bạn (1-9): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập giá trị các phần tử mảng
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập giá trị của phần tử thứ " + (i + 1) + ": ");
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("");
                    break;
                case 2:
                    // Hiển thị giá trị các phần tử mảng
                    System.out.println("\nCác phần tử của mảng là: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("");
                    break;
                case 3:
                    // In giá trị các phần tử chẵn và tính tổng
                    int sum3 = 0;
                    System.out.println("Các phần tử chẵn trong mảng là: ");
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0) {
                            System.out.print(arr[i] + " ");
                            sum3 += arr[i];
                        }
                    }
                    System.out.println("\n --> Tổng các phần tử chẵn trong mảng là: " + sum3);
                    System.out.println("");
                    break;
                case 4:
                    // In giá trị các phần tử có chỉ số lẻ và tính tổng
                    int sum4 = 0;
                    System.out.println("Các phần tử có chỉ số lẻ trong mảng là: ");
                    for (int i = 0; i <= n; i++) {
                        if (i % 2 != 0) {
                            System.out.print(i + " ");
                            sum4 += i;
                        }
                    }
                    System.out.println("\n --> Tổng các phần tử có chỉ số lẻ trong mảng là: " + sum4);
                    System.out.println("");

                    break;
                case 5:
                    // In giá trị các phần tử là số nguyên tố trong mảng
                    System.out.println("--> Các phần tử là số nguyên tố trong mảng là: ");
                    for (int i = 0; i < n; i++) {
                        if (isPrime(arr[i])) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("");
                    break;
                case 6:

                    // In giá trị max và min của các phần tử trong mảng
                    int max = arr[0];
                    int min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Giá trị lớn nhất trong mảng là " + max);
                    System.out.println("Giá trị nhỏ nhất trong mảng là " + min);
                    System.out.println("");
                    break;
                case 7:
                    // Sắp xếp mảng giảm dần
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Mảng sau khi sắp xếp giảm dần:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    System.out.println("");
                    break;
                case 8:
//                    // Thống kê số lượng phần tử bằng giá trị nhập từ bàn phím
//                    System.out.print("Nhập số nguyên cần tìm trong mảng: ");
//                    int x = scanner.nextInt();
//                    int count = 0;
//                    for (int i = 0; i < n; i++) {
//                        if (arr[i] == x) {
//                            count++;
//                        }
//                    }
//                    if (count > 0) {
//                        System.out.println("Số phần tử có giá trị bằng " + x + " trong mảng là: " + count);
//                    } else {
//                        System.out.println("Không có phần tử nào trong mảng có giá trị bằng " + x);
//                    }
//                    System.out.println("\n");
//                    break;

                    // Thống kê số lượng phần tử bằng giá trị nhập từ bàn phím
                    System.out.print("\nNhập số nguyên cần tìm trong mảng: ");
                    int x = scanner.nextInt();
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == x) {
                            count++;
                            System.out.println("\nPhần tử có giá trị " + x + " xuất hiện ở vị trí " + i + " trong mảng");
                        }
                    }
                    if (count > 0) {
                        System.out.println("Số phần tử có giá trị bằng " + x + " trong mảng là: " + count);
                    } else {
                        System.out.println("\nKhông có phần tử nào trong mảng có giá trị bằng " + x);
                    }
                    System.out.println("\n");
                    break;
                case 9:
                    // Thoát chương trình
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình! ");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    System.out.println("\n");

            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
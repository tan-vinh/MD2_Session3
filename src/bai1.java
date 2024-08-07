import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran:");
        int row = sc.nextInt();
        System.out.println("Nhap so cot cua ma tran:");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        do {
            System.out.println("----MENU-----");
            System.out.println("1. Nhap phan tu cua ma tran");
            System.out.println("2. Hien thi phan tu cua m tran");
            System.out.println("3. Tinh tong phan tu cua ma tran");
            System.out.println("4. Hien thi so phan tu chan cua ma tran");
            System.out.println("5. Hien thi cac phan tu duoi dang ma tran");
            System.out.println("6. Tinh tong duong cheo chinh");
            System.out.println("7. In ra duong bien");
            System.out.println("8. Thoat");
            System.out.println("Hay nhap tu 1 den 8");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("Nhap phan tu thu %d cua cot thu %d \n", (j + 1), (i + 1));
                            arr[i][j] = sc.nextInt();
                        }

                    }
                    break;
                case 2:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("Phan tu thu %d cua cot thu %d trong ma tran la %d \n", (j + 1), (i + 1), arr[i][j]);
                        }
                    }
                    break;
                case 3:
                    int total = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            total += arr[i][j];
                        }
                    }
                    System.out.printf("Tong phan tu cua ma tran la %d \n", total);
                    break;
                case 4:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (arr[i][j] % 2 == 0) {
                                System.out.printf("Phan tu chan cua ma tran la %d \n", arr[i][j]);
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Phan tu duoi dang ma tran");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("\t %d", arr[i][j]);
                        }
                        System.out.println("\n");
                    }
                    break;
                case 6:
                    int totalDiagonal = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i == j) {
                                totalDiagonal += arr[i][j];
                            }
                        }
                    }
                    System.out.println("Tong phan tu theo duong cheo cua ma tran la " + totalDiagonal);
                    break;
                case 7:
                    System.out.println("Duong bien");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                                System.out.printf("\t %d", arr[i][j]);
                            }else {
                                System.out.printf("\t ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 8:
                    System.out.println("Da thoat menu");
                    System.exit(0);
                default:
                    System.out.println("Nhap khong hop le");
            }
        } while (true);
    }
}

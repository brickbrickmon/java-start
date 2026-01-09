package loop;

public class LoopEx {

    static void main(String[] args) {

        // 1

        int count = 1;

        // 내가 함
//        while (true) {
//            if (count>10){
//                break;
//            }
//            System.out.println(count);
//            count++;
//        }
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        for (count = 1; count <= 10; count++) {
            System.out.println(count);
        }


        // 2
        int num = 2;
//        for (num = 1; num <= 20; num++) {
//            if (num%2 == 0){
//                System.out.println(num);
//            }
//        }
        for (num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }

//        while (num <= 20) {
//            if (num % 2 == 0) {
//                System.out.println(num);
//            }
//        }
        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }


        // 3
        int max = 100;

        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);


        // 4
        for (i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int muliti = i * j;
                System.out.println(i +" x "+ j + " = "+ muliti);
            }
        }


        // 5  몰랐음
        int rows = 5;
        for (int count1 = 1; count1 <= rows; count1++) {
            for (int j = 1; j <= count1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        *
//        **
//        ***
//        ****
//        *****







    }
}

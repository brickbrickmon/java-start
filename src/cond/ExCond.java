package cond;

import java.sql.SQLOutput;

public class ExCond {
    static void main(String[] args) {

        // 1
        int score = 50;
        String grade;

        if (score >= 90){
            grade =  "A";
        } else if (80 <= score && score > 90) {
            grade = "B";
        } else if (70 <= score && score > 80) {
            grade = "C";
        } else if (60 <= score && score > 70) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("학점은 " + grade + "입니다.");


        // 2
        int distance = 10;
        String trans = ""; // string 변수는 초기화를 해주어야 한다.
                           // 위의 string 선언과 다른 이유는 else 영역에서 무조건적으로 값을 넣어주기 때문이지만
                           // 여기에는 else가 없으므로 선 초기화를 해주어야 한다.

        if (distance > 100) {
            trans = "비행기";
        } else if (distance > 10 && distance <= 100) {
            trans = "자동차";
        } else if (distance > 1 && distance <= 10) {
            trans = "자전거";
        } else if (distance <= 1) {
            trans = "도보";
        }
        System.out.println( trans + "를 이용하세요.");


        // 3
        int dollar = 3;
        int won = dollar * 1300;

        if (dollar <0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은 "+won+"입니다.");
        }


        // 4
        double rating =7;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }


        // 5
        String gradeA = "";

        switch (gradeA) {
            case "A":
                System.out.println("탁월한 성과입니다.");
                break;
            case "B":
                System.out.println("좋은 성과입니다.");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }

        // 6
        int a =100;
        int b =20;

        int max = (a > b) ? a : b ;

        System.out.println("더 큰 숫자는 "+max+"입니다.");


        // 7
        int x = 11;

        String result = (x % 2 == 0) ? "짝수" : "홀수" ;

        System.out.println("x는 "+result+"입니다.");

    }
}

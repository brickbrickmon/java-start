package loop;

public class For1 {
    static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) { // (초기식; 조건식; 증감식)
            sum = sum + i;
            System.out.println("i="+i+" sum="+sum);
        }
    }
}


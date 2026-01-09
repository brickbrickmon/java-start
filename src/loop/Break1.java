package loop;

public class Break1 {
    static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true){
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i="+i+" sum="+sum); // i=5, sum=15
                break; // break는 해당 루프에서 아랫줄로 더이상 가지 않고 바로 빠져나온다.
            }
            i++;
        }

        // 위의 whil문을 for문으로 바꾼다면
        for (; ;){
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i="+i+" sum="+sum); // i=5, sum=15
                break; // break는 해당 루프에서 아랫줄로 더이상 가지 않고 바로 빠져나온다.
            }
            i++;
        }
    }
}

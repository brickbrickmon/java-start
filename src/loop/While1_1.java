package loop;

public class While1_1 {
    static void main(String[] args) {

         int sum = 0;
         int i = 1;
         int endNum = 10; // i가 endNum이 될때까지 while문을 돌린다.

        // 만약 i 의 수를 +1, +2, +3 하고 싶다면
//         sum = sum + i;
//         System.out.println("i="+i+" sum="+sum);
//         i++;
//
//        sum = sum + i;
//        System.out.println("i="+i+" sum="+sum);
//        i++;
//
//        sum = sum + i;
//        System.out.println("i="+i+" sum="+sum);
//        i++;

        while(i<=endNum){
            sum = sum + i;
            System.out.println("i="+i+" sum="+sum);
            i++;
        }



    }
}

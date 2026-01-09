package operator;

public class operator4 {
    static void main(String[] args) {

        // 전위연산자
        int a =0;
        int b;
        b = ++a; //  a에 1을 더한 값을 써!
        System.out.println("a = " + a + ", b = " + b); // a=1, b=1

        // 후위연산자
        int c = 0;
        int d;
        d = c++; // 일단 c의 값을 먼저써. 쓰고 돌려 받은 후 1 을 더한다.
        System.out.println("c = " + c + ", d = " + d); // c=1, d=0


        // 자기자신만 있을 때는 순서의 상관이 없다.
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

    }
}

package operator;

public class operator4 {
    static void main(String[] args) {

        // 전위연산자
        int a =0;
        int b;
        b = ++a;
        System.out.println("a = " + a + ", b = " + b); // a=1, b=1

        // 후위연산자
        int c = 0;
        int d;
        d = c++;
        System.out.println("c = " + c + ", d = " + d); // c=1, b=0


        // 자기자신만 있을 때는 순서의 상관이 없다.
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

    }
}

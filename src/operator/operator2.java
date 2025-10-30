package operator;

public class operator2 {
    public static void main(String[] args) {

        // 문자열 + 문자열 1
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + s2);

        // 문자열  + 문자열 2
        String s3 = "hello" + "world222";
        System.out.println(s3);

        // 문자열 + 숫자 1 -> 숫자도 문자열로 바뀌어 버림.
        int s4 = 10;
        String s5 = "문자열 옆에 숫자가 붙으면 같이 문자열이 되어버리지." + s4;
        System.out.println(s5);

        // 문자열 + 숫자 2
        int s6 = 20;
        String s7 = "숫자가 아닌 변수로 더해도 똑같지." + s6;
        System.out.println(s7);
    }
}

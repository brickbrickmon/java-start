package loop;

public class Continue1 {
    static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; // 여기에서 바로 while (i <= 5) <<라인으로 넘어간다.
            }
            System.out.println(i); // 1, 2, 4, 5
            i++;
        }
    }
}

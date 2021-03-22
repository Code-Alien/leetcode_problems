package easy.index_of;

public class Main {
    public static void main(String[] args) {
        double counter = 0;

        int i1 = 100000;
        for (int i = 0; i < i1; i++) {
            double v = Math.pow(Math.random(), 2) + Math.pow(Math.random(), 2);
            System.out.println(v);
            if (v <= 1 ){
                counter ++;
            }
        }
        System.out.println(counter / i1);
    }
}

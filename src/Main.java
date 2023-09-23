public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.printf("0010 + 0111 = %s\n", bins.sum("0010", "0111"));
        System.out.printf("0010 * 0011 = %s\n", bins.mult("0010", "0011"));
    }
}
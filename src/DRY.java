public class DRY {
    static double total(double precio) {
        return precio * 1.12;
    }

    public static void main(String[] args) {
        System.out.println(total(100));
        System.out.println(total(200));
    }
}
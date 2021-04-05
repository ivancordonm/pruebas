class Pruebas {
    public static void main(String[] args) {
        System.out.println(sum1(3));
    }

    public static int sum1(int b) {
        return sum(1,b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
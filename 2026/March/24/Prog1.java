class OperatorDemo{
    public static void main(String[] args) {
        int x = 10;
        int y = x++;
        int z = ++x;

        int a = x++ + ++x;

        int b = x++ + ++x + --x;

        System.out.println(b);
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
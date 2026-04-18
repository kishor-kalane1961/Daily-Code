class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Java");
        sb.replace(6, 10, "World");

        System.out.println(sb);
    }
}
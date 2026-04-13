class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("append: " + sb);
        sb.insert(5, " Java");
        System.out.println("insert: " + sb);
        sb.replace(6, 10, "C++");
        System.out.println("replace: " + sb);
        sb.delete(6, 10);
        System.out.println("delete: " + sb);
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt: " + sb);
        sb.reverse();
        System.out.println("reverse: " + sb);
        System.out.println("capacity: " + sb.capacity());
        System.out.println("length: " + sb.length());
        System.out.println("charAt(2): " + sb.charAt(2));
        sb.setCharAt(2, 'X');
        System.out.println("setCharAt: " + sb);

    }
}

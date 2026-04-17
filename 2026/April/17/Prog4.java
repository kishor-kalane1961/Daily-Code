class Demo {
    public static void main(String[] args) {

        String names[] = {"Kishor", "Karan", "Amit", "Kunal", "Sneha"};

        int count = 0;

        for (String name : names) {
            if (name.startsWith("K")) {
                count++;
            }
        }

        System.out.println("Names starting with K: " + count);
    }
}
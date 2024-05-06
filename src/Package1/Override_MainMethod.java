package Package1;

class Test1
{
    public static void main(String[] args) {
        System.out.println("This is the main method in Parent class");
    }
}

class Test2 extends Test1 {
    // Attempting to override the main method
    public static void main(String[] args) {
        System.out.println("This is the main method in Child class");
    }
}

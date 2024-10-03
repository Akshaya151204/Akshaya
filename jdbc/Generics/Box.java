package jdbc.Generics;
public class Box<T> {
    private T book;
    public void setBook(T book) {

        this.book = book;
    }
    public T getBook() {

        return book;
    }
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        integerBox.setBook(10);
        System.out.println("Integer Value: " + integerBox.getBook());
        stringBox.setBook("Hello Generics");
        System.out.println("String Value: " + stringBox.getBook());
    }
}

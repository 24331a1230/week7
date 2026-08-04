/*
5.Create a class called Person with a member variable name. Save it
 in a file called Person. java

Create a class called Employee that will inherit the Person class. 
The other data members of the Employee class are annual salary (double), 
the year the employee started to work, and the national

insurance number which is a String. Save this in a file called Employee. 
java

Your class should have the necessary 
constructors and getter/setter methods.

Write another class called TestEmployee, 
containing a main method to fully test your class definition.
 */
class Author {
    // Member variables
    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Book {
    // Member variables
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Parameterized Constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Author object
        Author author = new Author("J.K. Rowling", "jkrowling@gmail.com", 'F');

        // Create Book object
        Book book = new Book("Harry Potter", author, 499.99, 20);

        // Print Book Details
        System.out.println("Book Details");
        System.out.println("------------");
        System.out.println("Book Name : " + book.getName());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity in Stock : " + book.getQtyInStock());

        System.out.println("\nAuthor Details");
        System.out.println("--------------");
        System.out.println("Name : " + book.getAuthor().getName());
        System.out.println("Email : " + book.getAuthor().getEmail());
        System.out.println("Gender : " + book.getAuthor().getGender());
    }
}
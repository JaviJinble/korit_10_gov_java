package study.ch20.Ex;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//### 문제 19. 도서 관리
//
//`Book` 클래스(isbn, title, author, price)와 `Library` 클래스를 구현하시오.
//
//- `Library` 내부: `Map<String, Book>` (ISBN→Book)
//- `void addBook(Book b)` — 등록
//- `Book findByIsbn(String isbn)` — ISBN 검색
//- `List<Book> findByAuthor(String author)` — 저자별 검색
//- `List<Book> findByPriceRange(int min, int max)` — 가격 범위 검색
//- `void printAll()` — 전체 도서 출력


// 등록: 978-1("자바의 정석", "남궁성", 35000),
//       978-2("스프링 입문", "김영한", 32000),
//       978-3("이펙티브 자바", "조슈아", 36000)
// 저자 "남궁성" 검색: [자바의 정석]
// 가격 33000~36000: [자바의 정석, 이펙티브 자바]
@Data
@Builder
@AllArgsConstructor
class Book {
    private String isbn; // 책 고유 번호 (ID 역할)
    private String title; // 책 제목
    private String author; // 저자
    private int price; // 가격

//    Book(String isbn, String title, String author, int price) {
//        this.isbn = isbn;
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }
//
//
//    @Override
//    public String toString() {
//        return title + "(" + author + ", " + price + "원)";
//    }
}

//- `Library` 내부: `Map<String, Book>` (ISBN→Book)
//- `void addBook(Book b)` — 등록
//- `Book findByIsbn(String isbn)` — ISBN 검색
//- `List<Book> findByAuthor(String author)` — 저자별 검색
//- `List<Book> findByPriceRange(int min, int max)` — 가격 범위 검색

interface Library { // 인터페이스를 만들어 추상화해준다
void addBook(Book b);
Book findByIsbn(String isbn);
List<Book> findByAuthor(String author);
List<Book> findByPriceRange(int min, int max);
void printAll();
}

@Data
//@Builder
class LibraryImpl implements Library {
    private Map<String, Book> bookMap;
    // Ctrl + i 눌러 오버라이딩

    public LibraryImpl() { // private Map<String, Book> bookMap; 생성자를 만들어 에 초기값을 넣어준다
        bookMap = new HashMap<>();
    }

    @Override
    public void addBook(Book b) { // 책 추가
        bookMap.put(b.getIsbn(), b);
    }

    @Override
    public Book findByIsbn(String isbn) { // 책 찾기
        return bookMap.get(isbn); // isbn으로 도서 찾기
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>(); // List<Book>을 리턴해줘야하니 생성해준다
        for (Book book : bookMap.values()) {
            if (book.getAuthor().equals(author)) foundBooks.add(book);
        }
        return foundBooks;
    }

    @Override
    public List<Book> findByPriceRange(int min, int max) { // 가격 범위 검색
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookMap.values()) {
            if (book.getPrice() >= min && book.getPrice() <= max) foundBooks.add(book);
        }
        return foundBooks;
    }

    @Override
    public void printAll() {
        for (Book book : bookMap.values()) {
            System.out.println(book);
        }
    }
//    private Map<String, Book> books = new HashMap<>();
//
//    void addBook(Book b) {
//        books.put(b.getIsbn(), b);
//    }
//
//    List<Book> findByAuthor(String author) { // — 저자별 검색
//        List<Book> result = new ArrayList<>();
//        for (Book b : books.values()) {
//            if (b.getAuthor().equals(author)) result.add(b);
//        }
//        return result;
//    }
//
//    List<Book> findByPriceRange(int min, int max) {
//        List<Book> result = new ArrayList<>();
//        for (Book b : books.values()) {
//            if (b.getPrice() >= min && b.getPrice() <= max) {
//                result.add(b);
//            }
//        }
//        return result;
//    }
//
//    void printAll() {
//
//    }

}
// 등록: 978-1("자바의 정석", "남궁성", 35000),
//       978-2("스프링 입문", "김영한", 32000),
//       978-3("이펙티브 자바", "조슈아", 36000)
// 저자 "남궁성" 검색: [자바의 정석]
// 가격 33000~36000: [자바의 정석, 이펙티브 자바]

public class EX19 {
    public static void main(String[] args) {
        String searchAuthor = "남궁성";
        Library library = new LibraryImpl();
        library.addBook(new Book("978-1", "자바의 정석", "남궁성", 35000));
        library.addBook(new Book("978-2", "스프링 입문", "김영한", 32000));
        library.addBook(new Book("978-3", "이펙티브 자", "조슈아", 36000));
        library.addBook(new Book("978-4", "이펙티브 자1", "조슈아", 36000));
        library.addBook(new Book("978-5", "이펙티브 자2", "남궁성", 36000));
        library.addBook(new Book("978-6", "이펙티브 자3", "조슈아", 36000));
        library.addBook(new Book("978-7", "이펙티브 자4", "남궁성", 36000));
        library.addBook(new Book("978-8", "이펙티브 자5", "김영한", 36000));

        Book foundBook = library.findByIsbn("978-2");
        System.out.println(foundBook);
        library.findByAuthor(searchAuthor).forEach(System.out::println); // library.findByAuthor(searchAuthor)이건 리스트니 기억해둘것
        System.out.println(library.findByPriceRange(35000, 36000)); // 리스트랑 비슷함 리스트 형태로 출력
        library.printAll();

//        // 라이브러리 생성
//        List<Book> books = new ArrayList<>();
//
//        books.addAll(List.of(
//                Book.builder().isbn("978-1").title("자바의 정석").author("남궁성").price(35000).build(),
//                Book.builder().isbn("978-2").title("스프링 입문").author("김영한").price(32000).build(),
//                Book.builder().isbn("978-3").title("이펙티브 자바").author("조슈아").price(36000).build()
//        ));
//
//
//        Map<String, List<Book>> authorMap = new HashMap<>(); //  만약 Map이라면 .values() values()는 Map 전용 메서드다
//        for (Book b : books) {
//            authorMap.computeIfAbsent(b.getAuthor(), k -> new ArrayList<>()).add(b);
//        }
//
//        System.out.println(authorMap.get("남궁성"));


    }
}

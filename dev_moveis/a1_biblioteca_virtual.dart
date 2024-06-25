class Book {
  String title;
  String author;
  int year;
  String genre;

  Book(this.title, this.author, this.year, this.genre);

  @override
  String toString() {
    return 'Book(Title: $title, Author: $author, Year: $year, Genre: $genre)';
  }
}

class VirtualLibrary {
  List<Book> _books = [];

  List<Book> get books => _books;

  void addBook(String title, String author, int year, String genre) {
    Book newBook = Book(title, author, year, genre);
    _books.add(newBook);
    print("Book '$title' added successfully!");
  }

  void removeBookByTitle(String title) {
    int initialLength = _books.length;
    _books.removeWhere((book) => book.title == title);
    if (_books.length < initialLength) {
      print("Books removed with title='$title'.");
    } else {
      print("No books found with title='$title'.");
    }
  }

  void listBooks() {
    if (_books.isEmpty) {
      print("The library is empty.");
    } else {
      for (var book in _books) {
        print(book);
      }
    }
  }
}

void main() {
  VirtualLibrary library = VirtualLibrary();
  library.addBook("Clean Code", "Robert Cecil Martin", 2012, "Computing");
  library.addBook("data scientist for business", "Tom Fawcett", 1899, "Computing");
  library.listBooks();

  library.removeBookByTitle("Clean Code");
  library.listBooks();
}

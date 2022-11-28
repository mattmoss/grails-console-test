package demo

class BookController {

    BookDataService bookDataService

    List<Book> index() {
        render bookDataService.list()
    }

}


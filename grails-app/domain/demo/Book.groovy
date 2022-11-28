package demo

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Book {
    String title
    String author

    @Override
    String toString() {
        "Book(author='${author}', title='${title}')"
    }
}

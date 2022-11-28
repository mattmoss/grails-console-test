package demo

import grails.gorm.services.Service

@Service(Book)
interface BookDataService {
    List<Book> list()
}


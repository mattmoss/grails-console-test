package demo

import grails.gorm.transactions.Transactional

class BootStrap {

    def init = { servletContext ->
        createSampleBooks()
    }

    @Transactional
    def createSampleBooks() {
        new Book(title: 'A Wizard of Earthsea', author: 'Ursula K. Le Guin').save()
    }
}

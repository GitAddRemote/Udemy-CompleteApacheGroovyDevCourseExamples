package com.presstronic.tuts.groovy.udemy.section11

import groovy.xml.MarkupBuilder

List books = [
        new Book(isbn: "978-1935182443", title: "Groovy in Action 2nd Edition", author: "Dierk Koenig", price: 50.58)
        , new Book(isbn: "978-1935182948", title: "Making Java Groovy", author: "Ken Kousen", price: 33.96)
        , new Book(isbn: "978-1937785307", title: "Programming groovy 2: Dynamic Productivity for the Java Developer", author: "Venkat Subramaniam", price: 28.92)
]

MarkupBuilder builder = new MarkupBuilder()
builder.books{
    books.each { currentBook ->

        book(isbn:currentBook.isbn) {
            title currentBook.title
            author currentBook.author
            price currentBook.price
        }
    }
}
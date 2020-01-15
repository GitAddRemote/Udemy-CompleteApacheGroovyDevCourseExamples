package com.presstronic.tuts.groovy.udemy.section11

import groovy.xml.MarkupBuilder

List books = [
        new Book(isbn: "978-1935182443", title: "Groovy in Action 2nd Edition", author: "Dierk Koenig", price: 50.58)
        , new Book(isbn: "978-1935182948", title: "Making Java Groovy", author: "Ken Kousen", price: 33.96)
        , new Book(isbn: "978-1937785307", title: "Programming groovy 2: Dynamic Productivity for the Java Developer", author: "Venkat Subramaniam", price: 28.92)
]
// Create file writer and pass to markup builder
FileWriter writer = new FileWriter("html/about.html")
MarkupBuilder builder = new MarkupBuilder(writer)
builder.html {
    head {
        title "My Groovy Books"
        style(type: "text/css", '''
            html,
            body {
              padding: 0;
              margin: 0;
            }
            table {
                display: grid;
                min-width: 100%;
                grid-template-columns:
                    minmax(150px, 1fr)
                    minmax(150px, 1.67fr)
                    minmax(150px, 1.67fr)
                    minmax(150px, 1.67fr)                    
            }
            thead,
            tbody,
            tr {
              display: contents;
            }
            
            th,
            td {
              padding: 15px;
              overflow: hidden;
              text-overflow: ellipsis;
              white-space: nowrap;
            }
            
            th {
              position: sticky;
              top: 0;
              background: #6c7ae0;
              text-align: left;
              font-weight: normal;
              font-size: 1.1rem;
              color: white;
            }
            
            th:last-child {
              border: 0;
            }
            
            td {
              padding-top: 10px;
              padding-bottom: 10px;
              color: #808080;
            }
            
            tr:nth-child(even) td {
              background: #f8f6ff;
            }
        ''')

    }
    body{
        table{
            thead{
                tr{
                    th("ISBN")
                    th("Title")
                    th("Author")
                    th("Price")
                }
            }
            tbody{
                books.each { currentBook ->
                    tr {
                        td(currentBook.isbn)
                        td(currentBook.title)
                        td(currentBook.author)
                        td(currentBook.price)
                    }
                }
            }
        }




//        div(class:"container") {
//            div(class:"grid-item", "ISBN")
//            div(class:"grid-item", "Title")
//            div(class:"grid-item", "Author")
//            div(class:"grid-item", "Price")
//            books.each { currentBook ->
//                div(class:"grid-item") {
//                    title currentBook.title
//                    author currentBook.author
//                    price currentBook.price
//                }
//            }
//
//        }
    }
}

println writer


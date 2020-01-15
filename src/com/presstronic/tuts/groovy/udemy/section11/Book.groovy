package com.presstronic.tuts.groovy.udemy.section11

import groovy.transform.ToString

@ToString
class Book {
    String isbn
    String title
    String author
    BigDecimal price
}

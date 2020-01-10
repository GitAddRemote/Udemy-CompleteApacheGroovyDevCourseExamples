package com.presstronic.tuts.groovy.udemy.section4

class Account {

    BigDecimal balance = 0.0
    String type

    def deposit( BigDecimal amount ){
        balance += amount
    }

    def withdraw( BigDecimal amount ){
        balance -= amount
    }

    BigDecimal plus( Account other ){
        this.balance + other.balance
    }

}

package com.presstronic.tuts.groovy.udemy.section7

class Account {

    BigDecimal balance = 0.0

    def deposit(BigDecimal amount){

        try{
            if(amount < 0) { throw new Exception("Amount is less then zero")}
            println amount
        }
        catch(Exception e){
            println e
        }
    }

    def deposit(BigDecimal... deposits){

        try{
            for(amount in deposits){
                deposit(amount)
            }
        }
        catch(Exception e){
            println e
        }
    }
}

Account account = new Account();
account.deposit(-30.00);

account.deposit(-30.00, 10.00, 23.00);

package com.presstronic.tuts.groovy.udemy.section9

//Expando e1 = new Expando()
//e1.name = "Demian"
//e1.writeCode = { -> println "$name loves to write code..." }
//e1.writeCode()

class Developer {

}
// Adding to existing custom class using expando
Developer rudy = new Developer()
rudy.metaClass.name = "Rudy"
rudy.metaClass.writeCode = { -> println "$name loves to write code..." }
rudy.writeCode()

// Adding to existing Groovy class using expando
Integer.metaClass.plusTen = { delegate + 10 }
println 3.plusTen()

// Adding to existing Groovy class using category
class IntegerCategory {
    static Integer timeTwo(Integer number){
        number * 2
    }
}
use(IntegerCategory){
    println 63.timeTwo()
}
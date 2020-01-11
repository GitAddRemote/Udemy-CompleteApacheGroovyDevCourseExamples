package com.presstronic.tuts.groovy.udemy.section6

/*
    Create basic closures
 */
 def calculateShipping( weight, closure ) {
     closure(weight)
 }

def nextDayAirShipping = { weight ->
    weight * 1.7
}

println calculateShipping(3, nextDayAirShipping)


/*
    Use closure for list
 */

List employeeList = ["Jenna", "Sara", "Tim", "Clark"]

employeeList.each {
    println it
}

/*
    Use closure for map
 */

Map employeeMap = [1:"Jenna", 2:"Sara", 3:"Tim", 4:"Clark"]

employeeMap.each { key, value ->
    println "$key, $value"
}


/*
    Curry
 */

Map adminMap = [1:"Jenna", 2:"Sara", 3:"Tim", 4:"Clark"]

def showUsers = { String role, Integer id, String name ->
    println "[$role], $id, $name"
}

def showAdminUsers = showUsers.curry("admin")
adminMap.each { key, value ->
    showAdminUsers(key, value)
//    println "$key, $value"
}


/*
    GDK find vs. findAll
*/

List employeeFindList = ["Jenna", "Sara", "Tim", "Clark", "Sara"]

println employeeFindList.find {
    it == "Sara"
}

println employeeFindList.findAll {
    it == "Sara"
}

/*
    GDK any vs. every
*/
List employeeAnyEveryList = ["Jenna", "Sara", "Tim", "Clark", "Sara"]

println employeeAnyEveryList.any {
    it.equals("Sara")
}

println employeeAnyEveryList.every {
    it.equals("Sara")
}

/*
    GDK groupBy
*/
Map employeeRolesMap = [1:[role: "admin", name: "Jenna"], 2:[role: "editor", name: "Sara"], 3:[role: "admin", name: "Tim"], 4:[role: "writer", name: "Clark"]]

employeeRolesMap.each { id, emp ->
    println "[$id] -- $emp.role: $emp.name"
}

def empByRole = employeeRolesMap.groupBy { id, emp -> emp.role}

println empByRole



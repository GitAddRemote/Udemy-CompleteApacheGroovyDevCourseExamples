package com.presstronic.tuts.groovy.udemy.section5

/*
 * Enum code
 */

//enum Days {
//    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
//}
//
////  Range is ..
//def daysInRange = Days.SUNDAY..Days.SATURDAY
//println daysInRange.size()
//
//println "Range includes WEDNESDAY ${daysInRange.contains(Days.WEDNESDAY)}"
//println "Range FROM element is ${daysInRange.from}"
//println "Range TO element is ${daysInRange.to}"


/*
 * List code
 */

//def daysList = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
//
//println daysList
//println "Size of daysList is ${daysList.size()}"
//daysList.removeLast()
//println daysList
//
//daysList << "Saturday"
//
//daysList.each { day ->
//    println day
//}
//
//println daysList[3]

/*
 * Map code
 */
Map daysMap = [1:"Sunday", 2:"Monday", 3:"Tuesday", 4:"Wednesday", 5:"Thursday", 6:"Friday", 7:"Saturday"]

println daysMap
println daysMap.getClass().name
println daysMap.size()
println daysMap.values()




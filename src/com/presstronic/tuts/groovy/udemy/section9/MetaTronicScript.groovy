package com.presstronic.tuts.groovy.udemy.section9

class MetaTronic {

    String first
    String last
    String email
    List languages

    MetaTronic(){

    }

    @Override
    def invokeMethod(String method, Object args) {
        println("invokeMethod(String, Object) called for method name $method with $args")
//        return super.invokeMethod(s, o) // Causes stackoverflow because it keeps calling itself???
    }

    @Override
    def getProperty(String property) {
        println "getProperty(String) called with property: $property"
        metaClass.getProperty(this, property)
    }

    @Override
    void setProperty(String property, Object newValue) {
        println "setProperty(Strong, Object) called with name: $property and newValue: $newValue"
        metaClass.setProperty(this, property, newValue)
    }

}

// Call non-existent method
MetaTronic meta = new MetaTronic(first: "Sam", last: "smith", email:"ssmith@presstronic.com")
meta.runMe("Wooo")

// properties
println meta.first

meta.languages = ["Groovy", "Java", "JavaScript"]
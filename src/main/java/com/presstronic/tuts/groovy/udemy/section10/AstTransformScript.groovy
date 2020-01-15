package com.presstronic.tuts.groovy.udemy.section10

import groovy.transform.Field

@Field Map cars = [porsche:"911", ferrari:"488 GTB", audi:"R8"]

/**
 *
 * @return
 */
def orderCarsByMake() {
    cars.sort{ a, b ->
        a.key <=> b.key
    }
}
println orderCarsByMake()
assert orderCarsByMake() == [audi:"R8", ferrari:"488 GTB", porsche:"911"]

/**
 *
 * @return
 */
def orderCarsByModel() {
    cars.sort{ a, b ->
        a.value <=> b.value
    }
}
println orderCarsByModel()
assert orderCarsByModel() == [ferrari:"488 GTB", porsche:"911", audi:"R8"]

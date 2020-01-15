package com.presstronic.tuts.groovy.udemy

@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='9.4-1205-jdbc42')

import groovy.sql.GroovyRowResult
import groovy.sql.Sql

def dbUrl      = "jdbc:postgresql://localhost/udemy-groovy-test-database"
def dbUser     = "demianseiler"
def dbPassword = ""
def dbDriver   = "org.postgresql.Driver"

def sql = Sql.newInstance(dbUrl, dbUser, dbPassword, dbDriver)

//List<GroovyRowResult> cars1 = sql.rows('''SELECT * FROM "car-club-of-orlando".vehicle''')
//println cars1
//
//sql.execute('''INSERT INTO "car-club-of-orlando".vehicle (make, model) VALUES ('Ferrari', '458')''');

List<GroovyRowResult> cars2 = sql.rows('''SELECT * FROM "car-club-of-orlando".vehicle''')
println cars2

/**
 * Generate CSV
 */


def file = new File("cars.csv")

file.write("id, make, model\n")

cars2.each { row ->
    file.append("$row.id, $row.make, $row.model\n")
}









sql.close()
//insert into "udemy-groovy-test-database"."car-club-of-orlando".vehicle (make, model) values ('Porsche', '911');
//insert into "udemy-groovy-test-database"."car-club-of-orlando".vehicle (make, model) values ('Porsche', '356');
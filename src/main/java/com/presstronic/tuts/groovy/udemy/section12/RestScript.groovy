//import groovyx.net.http.HTTPBuilder
//import static groovyx.net.http.Method.GET
//import static groovyx.net.http.ContentType.JSON
//
//try{
//    def https = new HTTPBuilder( 'https://api.spacexdata.com/v3' )
//    https.request( GET, JSON ) {
//        uri.path = '/launches/latest'
//        uri.query = [ v:'1.0', q: 'Calvin and Hobbes' ]
//
//        response.success = { resp, json ->
//            assert json.size() == 3
//            println "Query response: "
//            json.responseData.results.each {
//                println "  ${it.titleNoFormatting} : ${it.visibleUrl}"
//            }
//        }
//    }
//}
//catch(Exception e){println e}

import groovyx.net.http.HTTPBuilder

import static groovyx.net.http.ContentType.JSON
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.TEXT

// initialize a new builder and give a default URL
def http = new HTTPBuilder( 'https://api.spacexdata.com/v3/launches/latest' )

http.request(GET,TEXT) { req ->
//    uri.path = '/launches/latest' // overrides any path in the default URL
    headers.'User-Agent' = 'Mozilla/5.0'

    response.success = { resp, reader ->
        assert resp.status == 200
        println "My response handler got response: ${resp.statusLine}"
        println "Response length: ${resp.headers.'Content-Length'}"
        System.out << reader // print response reader
    }

    // called only for a 404 (not found) status code:
    response.'404' = { resp ->
        println 'Not found'
    }
}

// initialize a new builder and give a default URL
def https = new HTTPBuilder( 'https://api.spacexdata.com/v3/launches/latest' )

https.request(GET,JSON) { req ->
//    uri.path = '/launches/latest' // overrides any path in the default URL
    headers.'User-Agent' = 'Mozilla/5.0'

    response.success = { resp, json ->

        println json
//        json.each {
//            println "  ${it.titleNoFormatting} : ${it.visibleUrl}"
//        }
    }

    // called only for a 404 (not found) status code:
    response.'404' = { resp ->
        println 'Not found'
    }
}
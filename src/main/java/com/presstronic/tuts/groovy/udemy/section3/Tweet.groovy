package com.presstronic.tuts.groovy.udemy.section3

import groovy.transform.ToString

@ToString
class Tweet {

    // Would be user obj
    def String id
    def String username
    def String displayName

    // Would be tweet object
    def String tweet
    def Set retweets = new HashSet()
    def Set favorites = new HashSet()

    Tweet(String id, String username, String displayName, String tweet) {
        this.id = id
        this.username = username
        this.displayName = displayName
        this.tweet = tweet
    }

    def addRetweet(String username){
        print "username is $username \n"
        this.retweets << username
    }

    def addFavorite(String username){
        this.favorites << username
    }

    def removeFavorite(String username){
        this.favorites.remove(username);
    }

}
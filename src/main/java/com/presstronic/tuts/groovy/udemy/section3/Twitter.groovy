package com.presstronic.tuts.groovy.udemy.section3



def tweets = [
        new Tweet("asd8fa", "bsmith", "Billy Smithy", "this is my first tweet")
        , new Tweet("s9dfu9e", "djones", "Diane Jone", "Is this thing on?")
        , new Tweet("32jddw", "rigby", "Robert Igby", "Rigby, but kind of a jerk")
        , new Tweet("039rfjw", "dking", "Dave King", "Ready for 2020 to start!")]

for(tweet in tweets){

    def username = tweet.username
    println username

    if(username.startsWith("r")){
        tweet.addRetweet("bsmith")
        tweet.addRetweet("djones")
        println tweet.toString()

        tweet.addFavorite("dking")
        println tweet.toString()

        tweet.removeFavorite("dking")
        println tweet.toString()
    }
}


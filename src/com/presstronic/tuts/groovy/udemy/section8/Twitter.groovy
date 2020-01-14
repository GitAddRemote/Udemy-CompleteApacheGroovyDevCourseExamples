package com.presstronic.tuts.groovy.udemy.section8




def tweets = [
        new Tweet("asd8fa", "bsmith", "Billy Smithy", "this is my first tweet #FirstTweet")
        , new Tweet("s9dfu9e", "djones", "Diane Jone", "Is this thing on?")
        , new Tweet("32jddw", "rigby", "Robert Igby", "Rigby, but kind of a #jerk #rigby")
        , new Tweet("039rfjw", "dking", "Dave King", "Ready for 2020 to start! Let's do this @bsmith")]

for(tweet in tweets){

    def username = tweet.username
    println username

//    if(username.startsWith("r")){

        tweet.retweet("bsmith")
        tweet.retweet("djones")
        println tweet.toString()

        tweet.favorite("dking")
        println tweet.toString()

        tweet.favorite("dking")
        println tweet.toString()

        def hashtags = tweet.getHashTags()
        println "Hashtags: $hashtags"

        def mentions = tweet.getMentions()
        println "Mentions by $tweet.username are $mentions"
//    }
}


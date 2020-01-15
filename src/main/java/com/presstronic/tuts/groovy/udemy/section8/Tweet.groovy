package com.presstronic.tuts.groovy.udemy.section8

import groovy.transform.ToString

@ToString
class Tweet {

    private String id
    private String username
    private String displayName
    private String post
    private tweetDate

    def Set retweets = new HashSet()
    def Set favorites = new HashSet()
    def Set mentions = new HashSet()
    def Set hashtags = new HashSet()

    /**
     * Arg constructor
     *
     * @param id
     * @param username
     * @param displayName
     * @param tweet
     */
    Tweet(String id, String username, String displayName, String post) {
        this.id = id
        this.username = username
        this.displayName = displayName
        this.post = post
    }

    /**
     * add/remove retweet
     * @param username
     * @return
     */
    def retweet(String username){
        (this.retweets.find {it.equals(username)}) ? this.retweets.remove(username) : this.retweets << username
    }

    /**
     * add/remove favorite
     * @param username
     * @return
     */
    def favorite(String username){
        (this.favorites.find {it.equals(username)}) ? this.favorites.remove(username) : this.favorites << username
    }

    def getMentions(){
        String pattern = /\B@[a-z0-9_-]+/
        post.findAll(pattern)
    }

    def getHashTags() {
        String pattern = ~/(?:\s|\A)[##]+([A-za-z0-9-_]+)/
        post.findAll(pattern)
    }

}
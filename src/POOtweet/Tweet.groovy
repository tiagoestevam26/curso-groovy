package POOtweet

class Tweet {
    String username, text;
    Map<String, String> comments = [:]
    List<String> likes = []
    List<String> retweets = []


    void likeTweet(String user){
        likes.add(user);
    }
    void retweetTweet(String user){
        retweets.add(user);
    }
    void commentTweet(String user, String comment) {
        comments.put(user, comment)
    }

    void getEverything(){
        println("LIKES: "+likes);
        println("RETWEETS: "+retweets);
        println("COMMENTS: "+comments);

    }


}

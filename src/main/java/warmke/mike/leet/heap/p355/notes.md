

# Design Twitter

followers data structure would be a Map<String, Set<String>>
    were usedId, set of followeeIds 

there needs to be some sort of data structure for all tweets
then some other structure for the 10 most recent tweets 

like the twitter design in  DDIA 

---
### User Timeline Solution

each user would have a timeline as a list and the get news feed would just take those 10 most recent tweets

* follow
* unfollow
* getNewsFeed
* postTweet

follow and unfollow will both have constant time since we are just adding and removing from a HashSet

getNewsFeed would also be constant since we are just getting the 10 last elements from there feed

postTweet would have to add the tweet to every Followee's timeline.

O(m) where m is the number of followees for that user

---

### Global Tweet Collection Solution 

follow and unfollow will stay the same for this implementation

post tweet will now just store a user's tweets into a HashMap of userId -> TweetId,Count

getNewsFeed will now have to the users that they follow and put there tweets into a maxHeap to get the ten most recent

postTweet now becomes constant

getNewsFeed now becomes O(m) where m is the total number of followee tweets



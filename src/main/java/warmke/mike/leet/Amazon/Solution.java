package warmke.mike.leet.Amazon;

import java.util.*;

class Solution {

    static class Twitter {
        Map<Integer, List<Integer>> tweetsByUser;
        Map<Integer, Set<Integer>> friendsByUser;
        public Twitter() {
            tweetsByUser = new HashMap<>();
            friendsByUser = new HashMap<>();
        }

        public void postTweet(int userId, int tweetId) {
            if (!tweetsByUser.containsKey(userId)) {
                tweetsByUser.put(userId, new ArrayList<>());
            }
            tweetsByUser.get(userId).add(tweetId);
        }

        public List<Integer> getNewsFeed(int userId) {
            Set<Integer> friends = friendsByUser.get(userId);
            Set<Integer> usersToGet = new HashSet<>(friends);
            usersToGet.add(userId);
            return tweetsByUser.entrySet().stream()
                    .filter(entry -> friends.contains(entry.getKey()))
                    .flatMap(entry -> entry.getValue().stream())
                    .sorted(Comparator.reverseOrder())
                    .limit(10)
                    .toList();
        }

        public void follow(int followerId, int followeeId) {
            if (!friendsByUser.containsKey(followerId)) { friendsByUser.put(followerId, new HashSet<>()); }
            friendsByUser.get(followerId).add(followeeId);
        }

        public void unfollow(int followerId, int followeeId) {
            Set<Integer> friends = friendsByUser.get(followerId);
            if (friends != null) {
                friends.remove(followeeId);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 1);
        twitter.postTweet(2, 2);
        twitter.getNewsFeed(1);

        int[] array = {1, 2, 3 ,4 ,5};
        Arrays.binarySearch(array, 3);

    }
}
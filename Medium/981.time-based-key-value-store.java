/*
 * @lc app=leetcode id=981 lang=java
 *
 * [981] Time Based Key-Value Store
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;

class Pair {
    int timestamp;
    String value;

    Pair(int ts, String val) {
        timestamp = ts;
        value = val;
    }
}

class TimeMap {
    private HashMap<String, ArrayList<Pair>> timeKeyMap;

    public TimeMap() {
        timeKeyMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        ArrayList<Pair> pairList = timeKeyMap.getOrDefault(key, new ArrayList<>());
        pairList.add(new Pair(timestamp, value));
        timeKeyMap.put(key, pairList);
    }

    public String get(String key, int timestamp) {
        String closest = "";

        if (timeKeyMap.containsKey(key)) {
            ArrayList<Pair> list = timeKeyMap.get(key);
            int start = 0;
            int end = list.size() - 1;
            int mid;

            // System.out.println(timestamps.toString());

            while (start <= end) {
                mid = start + (end - start) / 2;
                Pair pair = list.get(mid);
                if (pair.timestamp == timestamp) {
                    return pair.value;
                } else if (pair.timestamp < timestamp) {
                    closest = pair.value;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return closest;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
// @lc code=end

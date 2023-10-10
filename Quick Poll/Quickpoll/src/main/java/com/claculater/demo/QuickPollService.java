package com.claculater.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class QuickPollService {
    private Map<Long, Integer> pollVotes = new HashMap<>();

    public int getVoteCount(long pollId) {
        return pollVotes.getOrDefault(pollId, 0);
    }

    public void vote(long pollId) {
        pollVotes.put(pollId, pollVotes.getOrDefault(pollId, 0) + 1);
    }

    // You can add more methods and functionality as needed for your application.
}

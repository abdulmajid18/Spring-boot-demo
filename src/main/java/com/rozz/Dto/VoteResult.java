package com.rozz.Dto;

import java.util.Collection;

public class VoteResult {
    private int totalVotes;
    private Collection<OptionCount> results;

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;

    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setResults(Collection<OptionCount> results) {
        this.results = results;
        
    }

    public Collection<OptionCount> getResults() {
        return results;
    }
}
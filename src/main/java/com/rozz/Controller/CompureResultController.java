package com.rozz.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rozz.Domain.Vote;
import com.rozz.Dto.VoteResult;
import com.rozz.Repository.VoteRepository;

@RestController
public class CompureResultController {
    private VoteRepository voteRepository;

    @GetMapping("/computeresult")
    public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = voteRepository.findByPoll(pollId);
        // Algorithm to count votes
        return new ResponseEntity<VoteResult>(voteResult,
                HttpStatus.OK);
    }
}

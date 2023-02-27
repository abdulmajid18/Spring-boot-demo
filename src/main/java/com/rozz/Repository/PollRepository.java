package com.rozz.Repository;

import org.springframework.data.repository.CrudRepository;

import com.rozz.Domain.Poll;

public interface PollRepository extends CrudRepository<Poll, Long> {

}

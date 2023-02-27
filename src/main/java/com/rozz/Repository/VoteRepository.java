package com.rozz.Repository;

import org.springframework.data.repository.CrudRepository;

import com.rozz.Domain.Vote;

public interface VoteRepository extends CrudRepository<Vote, Long> {

}

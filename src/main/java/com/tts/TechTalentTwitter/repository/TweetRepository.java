package com.tts.TechTalentTwitter.repository;

import com.tts.TechTalentTwitter.model.Tweet;
import org.springframework.data.repository.CrudRepository;

public interface TweetRepository extends CrudRepository<Tweet, Long> {
}

package com.tanvn.springboot2.springboot2learning;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository
	extends ReactiveCrudRepository<Chapter, String> {

}

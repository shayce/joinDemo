package com.training.pms.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.pms.model.Story;
public interface StoryRepository extends CrudRepository<Story, Integer> {

}

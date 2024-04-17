package com.example.DMs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.DMs.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}

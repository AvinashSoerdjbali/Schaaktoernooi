package com.SET.Schaaktoernooi.controller;


import com.SET.Schaaktoernooi.Model.Schaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SchaakRepository extends CrudRepository<Schaker, Long> {

}

package com.SET.Schaaktoernooi.API;


import com.SET.Schaaktoernooi.Model.Schaker;
import com.SET.Schaaktoernooi.controller.SchaakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchakerEndpoint {

    @Autowired
    private SchaakRepository mijnSchaakRepository;

    @GetMapping("geefalleschakers")
    public Iterable<Schaker> geefalleschakers() {
        return mijnSchaakRepository.findAll();
    }

    @PostMapping("toevoegen")
    public String toevoegen(@RequestBody Schaker schaker) {
        mijnSchaakRepository.save(schaker);
        return "het is gelukt";


    }
}

package com.SET.Schaaktoernooi.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Schaker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public long Id;

    public String voornaam;
    public String achternaam;
    public String tussenvoegsel;
    public Date   birthdate;
    public int    wins;
    public int    ties;
    public int    losses;
}

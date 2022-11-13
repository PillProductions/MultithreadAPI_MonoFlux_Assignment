package com.example.aflevering_november.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Nationality {
    public ArrayList<Country> country;
    public String name;
}

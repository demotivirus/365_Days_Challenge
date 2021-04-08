package com.demotivirus.Day_107;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "dictionary_city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name;
    String code;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    Country country;
}

package com.demotivirus.Day_107;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "dictionary_airplane")
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String airplaneModel;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            })
    @JoinTable(name = "dictionary_airplane_places",
            joinColumns = @JoinColumn(name = "airplane_id"),
            inverseJoinColumns = @JoinColumn(name = "place_id"))
    List<Place> places;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    Company company;

    String descr;
}

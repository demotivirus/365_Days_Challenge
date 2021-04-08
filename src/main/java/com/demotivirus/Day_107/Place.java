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
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "dictionary_place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    char line;
    int seat;

    @ManyToMany(mappedBy = "places")
    List<Airplane> airplanes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dictionary_airplane_classes_id", referencedColumnName = "id")
    AirplaneClasses airplaneClasses;
}

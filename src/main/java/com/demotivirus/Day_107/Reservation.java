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
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "flight_id", referencedColumnName = "id")
    Flight flight;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dictionary_place_id", referencedColumnName = "id")
    Place place;

    String clientComment;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passanger_id", referencedColumnName = "id")
    Passenger passenger;

    LocalDateTime reserveDatetime;
    String code;
}

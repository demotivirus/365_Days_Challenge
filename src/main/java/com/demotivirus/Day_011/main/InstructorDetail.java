package com.demotivirus.Day_011.main;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//NOT WORK CORRECTLY FOR CASCADE
@Entity
@Table(name = "instructor_detail")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class InstructorDetail {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(mappedBy = "instructorDetail",
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            })
    private Instructor instructor;

    @NonNull
    @Column(name = "youtube_channel")
    private String youtubeChannel;

    @NonNull
    @Column(name = "hobby")
    private String hobby;

    @Override
    public String toString() {
        return "InstructorDetail{" +
                "id=" + id +
                ", youtubeChannel='" + youtubeChannel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}

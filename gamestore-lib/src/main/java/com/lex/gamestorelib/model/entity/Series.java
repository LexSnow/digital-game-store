package com.lex.gamestorelib.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "series")
@Getter
@Setter
@NoArgsConstructor
public class Series {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "title")
    String title;
    @OneToMany(mappedBy = "series")
    Set<Game> games;
    public Series(String title){
        this.title = title;
    }
}

package com.lex.gamestorelib.model.entity;

import com.lex.gamestorelib.model.Currency;
import com.lex.gamestorelib.model.GamePlatform;
import com.lex.gamestorelib.model.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Collection;

@Entity
@Table(name = "game")
@Getter
@Setter
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private  String title;
    @Column(name = "release_date")
    private LocalDate releaseDate;
    @Column(name = "price")
    private  Double price;
    @Enumerated(EnumType.STRING)
    @Column(name = "currency")
    private Currency currency;
    @ManyToOne
    @JoinColumn(name = "developer_id", nullable = true)
    private Company developer;
    @ManyToOne
    @JoinColumn(name = "publisher_id", nullable = true)
    private  Company publisher;
    @Enumerated(EnumType.STRING)
    @Column(name = "platform")
    private GamePlatform gamePlatform;
    @ElementCollection(targetClass = Genre.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "game_genre")
    @Column(name = "genre")
    private Collection<Genre> genres;
    @ManyToOne
    @JoinColumn(name = "series_id")
    private Series series;
}

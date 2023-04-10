package com.lex.gamestorelib.model.entity;

import com.lex.gamestorelib.model.CompanyType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Entity
@Table(name = "company")
@Getter
@Setter
public class  Company {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;
    @ElementCollection(targetClass = CompanyType.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "company_type")
    @Column(name = "type")
    private Collection<CompanyType> companyType;
    @OneToMany(mappedBy = "developer")
    private Collection<Game> gamesDeveloped;
    @OneToMany(mappedBy = "publisher")
    private Collection<Game> gamesPublished;
}

package com.rozz.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Vote {
    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Option options;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Option getOptions() {
        return options;

    }

    public void setOptions(Option options) {
        this.options = options;

    }

}

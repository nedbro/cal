package com.kocsisrobert.cal.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class BodyInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    @NotNull
    @Min(value = 120)
    @Max(value = 250)
    private Integer height;

    @NotNull
    @Min(value = 35)
    @Max(value = 300)
    private Double weight;

}

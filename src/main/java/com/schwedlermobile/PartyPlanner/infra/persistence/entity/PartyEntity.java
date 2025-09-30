package com.schwedlermobile.PartyPlanner.infra.persistence.entity;

import com.schwedlermobile.PartyPlanner.core.domain.enums.TypeParty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "tb_party")
public class PartyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String location;
    private LocalDateTime dateParty;
    private Integer capacity;
    @Enumerated(value = EnumType.STRING)
    private TypeParty typeParty;
}

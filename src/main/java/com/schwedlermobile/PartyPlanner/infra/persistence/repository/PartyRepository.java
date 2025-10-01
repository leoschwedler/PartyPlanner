package com.schwedlermobile.PartyPlanner.infra.persistence.repository;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.infra.persistence.entity.PartyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PartyRepository extends JpaRepository<PartyEntity,Long> {

    Optional<PartyEntity> findByName(String name);
}

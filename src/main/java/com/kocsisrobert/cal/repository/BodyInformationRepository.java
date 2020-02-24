package com.kocsisrobert.cal.repository;

import com.kocsisrobert.cal.domain.BodyInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyInformationRepository extends JpaRepository<BodyInformation, Long> {
}

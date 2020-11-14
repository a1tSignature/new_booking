package com.a1tSign.backend.repository;

import com.a1tSign.backend.domain.HotelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<HotelModel, Long> {
}

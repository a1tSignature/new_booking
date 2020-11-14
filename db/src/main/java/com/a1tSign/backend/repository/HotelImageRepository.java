package com.a1tSign.backend.repository;

import com.a1tSign.backend.domain.HotelImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelImageRepository extends JpaRepository<HotelImage, Long> {
}

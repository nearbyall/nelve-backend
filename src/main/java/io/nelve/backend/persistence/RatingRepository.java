package io.nelve.backend.persistence;

import io.nelve.backend.persistence.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}

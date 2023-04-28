package io.mindbridge.backend.persistence;

import io.mindbridge.backend.persistence.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}

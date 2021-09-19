package com.tiagodeluna.coachplanner.persistence;

import com.tiagodeluna.coachplanner.domain.Training;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository extends JpaRepository<Training, Long> {

}

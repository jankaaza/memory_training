package kg.gamezone.memory_training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.LongSummaryStatistics;

public interface NumberRepository extends JpaRepository<Number, Long> {
}

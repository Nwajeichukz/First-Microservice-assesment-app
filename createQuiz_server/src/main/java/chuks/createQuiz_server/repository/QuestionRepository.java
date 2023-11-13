package chuks.createQuiz_server.repository;

import chuks.createQuiz_server.Entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<QuizQuestion, Long> {
    Optional<QuizQuestion> findById(long id);
}
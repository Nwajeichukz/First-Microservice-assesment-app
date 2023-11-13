package chuks.getQuiz_server.repository;

import chuks.getQuiz_server.Entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionRepository extends JpaRepository<QuizQuestion, Long> {
}
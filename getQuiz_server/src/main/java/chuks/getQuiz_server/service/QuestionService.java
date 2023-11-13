package chuks.getQuiz_server.service;

import chuks.getQuiz_server.Dto.QuestionDto;
import chuks.getQuiz_server.Dto.QuizAppResponse;
import org.springframework.data.domain.Pageable;

import java.util.Map;

public interface QuestionService {
    QuizAppResponse<Map<String, Object>> getAllQuestion(Pageable pageable);

    QuizAppResponse<QuestionDto> getQuestionById(long id);
//
//    public QuizAppResponse<Map<String, Object>> getRandom(Pageable pageable);
//    QuizAppResponse<String> createQuestion(PostQuestionDto postQuestionDto);

//    QuizAppResponse<String> updatingQuestion(long id, PostQuestionDto postQuestionDto);

//    void deleteById(long id);

}

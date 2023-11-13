package chuks.ansQuiz_server.service;


import chuks.ansQuiz_server.Dto.PostQuestionDto;
import chuks.ansQuiz_server.Dto.QuestionDto;
import chuks.ansQuiz_server.Dto.QuizAppResponse;
import org.springframework.data.domain.Pageable;

import java.util.Map;

public interface QuestionService {
    Map<String, Object> getAllQuestion(Pageable pageable);

    QuestionDto getQuestionById(long id);

//    public QuizAppResponse<Map<String, Object>> getRandom(Pageable pageable);
    String createQuestion(PostQuestionDto postQuestionDto);

//    QuizAppResponse<String> updatingQuestion(long id, PostQuestionDto postQuestionDto);

//    void deleteById(long id);

}

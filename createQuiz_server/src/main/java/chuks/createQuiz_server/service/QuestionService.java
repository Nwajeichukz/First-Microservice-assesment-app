package chuks.createQuiz_server.service;

import chuks.createQuiz_server.Dto.PostQuestionDto;
import chuks.createQuiz_server.Dto.QuizAppResponse;

import java.util.Map;

public interface QuestionService {
//    QuizAppResponse<Map<String, Object>> getAllQuestion(Pageable pageable);
//
//    QuizAppResponse<QuestionDto> getQuestionById(long id);
//
//    public QuizAppResponse<Map<String, Object>> getRandom(Pageable pageable);
    QuizAppResponse<String> createQuestion(PostQuestionDto postQuestionDto);

//    QuizAppResponse<String> updatingQuestion(long id, PostQuestionDto postQuestionDto);

//    void deleteById(long id);

}

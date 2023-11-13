package chuks.getQuiz_server.controller;

import chuks.getQuiz_server.Dto.QuestionDto;
import chuks.getQuiz_server.Dto.QuizAppResponse;
import chuks.getQuiz_server.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequiredArgsConstructor
@RequestMapping("/questions")
public class QuestionController {
    private final QuestionService questionServiceImpl;

    @GetMapping
    public ResponseEntity<QuizAppResponse<Map<String, Object>>> getAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") int page,
            @RequestParam(value = "size", required = false, defaultValue = "10") int size
    ){
        return ResponseEntity.ok(questionServiceImpl.getAllQuestion(PageRequest.of(page, size)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuizAppResponse<QuestionDto>> getQuestionById(@PathVariable long id){
        return  ResponseEntity.ok(
                questionServiceImpl.getQuestionById(id)
        );
    }

//    @GetMapping("/random")
//    public ResponseEntity<QuizAppResponse<Map<String, Object>>> getRandom(Pageable page){
//        return ResponseEntity.ok(questionServiceImpl.getRandom(page));
//    }

}
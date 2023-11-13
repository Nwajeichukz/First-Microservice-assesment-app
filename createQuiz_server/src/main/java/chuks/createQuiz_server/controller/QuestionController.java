package chuks.createQuiz_server.controller;

import chuks.createQuiz_server.Dto.PostQuestionDto;
import chuks.createQuiz_server.Dto.QuizAppResponse;
import chuks.createQuiz_server.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;


@RestController
@RequiredArgsConstructor
@RequestMapping("/questions")
public class QuestionController {
    private final QuestionService questionServiceImpl;

//    @PreAuthorize("hasRole('ADMIN')")
//    @PatchMapping("/{id}")
//    public ResponseEntity<QuizAppResponse<String>> updatingQuestion(@PathVariable long id, @RequestBody PostQuestionDto postQuestionDto){
//        return
//                ResponseEntity.ok(
//                        questionServiceImpl.updatingQuestion(id, postQuestionDto)
//                );
//    }


//    @GetMapping("/ans/{questionId}/{optionId}")
//    public ResponseEntity<QuizAppResponse<Integer>> getAnsAndQuestion(@PathVariable("questionId")long questionId , @PathVariable("optionId") long optionId){
//        return ResponseEntity.ok(questionOptionService.getAnsAndQuestion(questionId, optionId));
//    }


//    @PostMapping("/all-answer")
//    public ResponseEntity<List<AnswerResponse>> getAllAnsAndQuestion(@RequestBody List<AnswersDto> answersDto){
//        return ResponseEntity.ok(questionOptionService.getAllAnsAndQuestion(answersDto));
//    }


//    @PreAuthorize("hasRole('ADMIN')")
//    @PatchMapping("opt/{id}")
//    public ResponseEntity<QuizAppResponse<OptionDto>> updatingOptions(@PathVariable long id, @RequestBody UpdateOptionsDto val){
//        return
//                ResponseEntity.ok(
//                        questionOptionService.updateOption(id, val)
//                );
//    }
//
//    @PreAuthorize("hasRole('ADMIN')")
//    @DeleteMapping("/{id}")
//    public void deleteQuestion(@PathVariable long id){
//        questionServiceImpl.deleteById(id);
//    }

    @PostMapping("/add") //create_question
    public ResponseEntity<QuizAppResponse<String>> create(@Valid @RequestBody PostQuestionDto postQuestionDto){
        return ResponseEntity.ok(
                questionServiceImpl.createQuestion(postQuestionDto)
                );
    }

}
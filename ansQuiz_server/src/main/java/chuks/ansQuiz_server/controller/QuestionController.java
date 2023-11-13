package chuks.ansQuiz_server.controller;

import chuks.ansQuiz_server.Dto.PostQuestionDto;
import chuks.ansQuiz_server.Dto.QuestionDto;
import chuks.ansQuiz_server.Dto.QuizAppResponse;
import chuks.ansQuiz_server.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;


@RestController
@RequiredArgsConstructor
@RequestMapping("/get")
public class QuestionController {
    private final QuestionService questionServiceImpl;

    @GetMapping
    public Map<String, Object> getAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") int page,
            @RequestParam(value = "size", required = false, defaultValue = "10") int size
    ){
        return questionServiceImpl.getAllQuestion(PageRequest.of(page, size));
    }

    @GetMapping("/{id}")
    public QuestionDto getQuestionById(@PathVariable long id){
               return questionServiceImpl.getQuestionById(id);
    }

//    @GetMapping("/random")
//    public ResponseEntity<QuizAppResponse<Map<String, Object>>> getRandom(Pageable page){
//        return ResponseEntity.ok(questionServiceImpl.getRandom(page));
//    }

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
    public String create(@Valid @RequestBody PostQuestionDto postQuestionDto){
        return questionServiceImpl.createQuestion(postQuestionDto);
    }


}
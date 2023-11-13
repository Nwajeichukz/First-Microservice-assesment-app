package chuks.getQuiz_server.Dto;

import chuks.getQuiz_server.Entity.QuizQuestion;
import lombok.*;

import java.util.Collection;
import java.util.stream.Collectors;

@Data
public class QuestionDto {

    private Long id;


    private String question;

    Collection<OptionDto> options;


    public QuestionDto(QuizQuestion question){
        id = question.getId();
        this.question = question.getQuestion();

        options = question.getOptions().stream()
                        .map(o -> new OptionDto(o)
                        ).collect(Collectors.toList());
    }


    public QuestionDto(QuestionDto questionDto) {
    }

}
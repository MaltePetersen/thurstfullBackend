package dhsh.app.thurstfull.api;

import dhsh.app.thurstfull.domain.Sentence;
import dhsh.app.thurstfull.dto.SentenceDto;
import dhsh.app.thurstfull.services.SentenceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SentenceController {
    private SentenceService sentenceService;

    SentenceController(SentenceService sentenceService) {
        this.sentenceService = sentenceService;
    }
    
    @GetMapping("/sentences")
    public List<SentenceDto> getAllSentences() {
         return sentenceService.getAllSentences();
    }
    @GetMapping("sentence/{id}")
    public SentenceDto getSentenceById(@PathVariable int id){
        return sentenceService.getSentenceById(id);
    }
    @PostMapping("/sentence")
    public HttpStatus createSentence(@RequestBody SentenceDto sentenceDto) {
        return sentenceService.createSentence(sentenceDto);
    }
}

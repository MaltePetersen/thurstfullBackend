package dhsh.app.thurstfull.services;

import dhsh.app.thurstfull.domain.QuestType;
import dhsh.app.thurstfull.domain.Sentence;
import dhsh.app.thurstfull.dto.SentenceDto;
import dhsh.app.thurstfull.repository.QuestTypeRepository;
import dhsh.app.thurstfull.repository.SentenceRepository;
import dhsh.app.thurstfull.repository.VersionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SentenceService {
    private SentenceRepository sentenceRepository;
    private QuestTypeRepository questTypeRepository;
    private VersionService versionService;

    public SentenceService(SentenceRepository sentenceRepository, QuestTypeRepository questTypeRepository, VersionService versionService) {
        this.sentenceRepository = sentenceRepository;
        this.questTypeRepository = questTypeRepository;
        this.versionService = versionService;

    }

    public List<SentenceDto> getAllSentences() {
        List<SentenceDto> list = new ArrayList<>();
        sentenceRepository.findAll().forEach(sentence -> list.add(new SentenceDto(sentence.getName(), sentence.getQuestType().getId())));
        return list;
        // return StreamSupport.stream(sentenceRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public HttpStatus createSentence(SentenceDto sentenceDto) {
        if (questTypeRepository.findById(sentenceDto.getQuestType()).isPresent()) {
            sentenceRepository.save(new Sentence(sentenceDto.getName(), questTypeRepository.findById(sentenceDto.getQuestType()).get()));
            versionService.updateTimestamp();
            return HttpStatus.CREATED;
        }
        return HttpStatus.BAD_REQUEST;
    }

    public SentenceDto getSentenceById(int id) {
        Optional<Sentence> sentence = sentenceRepository.findById(id);
        if (sentence.isPresent()) {
           return new SentenceDto(sentence.get().getName(), sentence.get().getQuestType().getId());
        }
        return null;
    }
}

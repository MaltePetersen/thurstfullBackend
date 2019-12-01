package dhsh.app.thurstfull;

import dhsh.app.thurstfull.domain.QuestType;
import dhsh.app.thurstfull.domain.Sentence;
import dhsh.app.thurstfull.repository.QuestTypeRepository;
import dhsh.app.thurstfull.repository.SentenceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    SentenceRepository sentenceRepository;
    @Autowired
    QuestTypeRepository questTypeRepository;
    private static final Logger logger = LoggerFactory.getLogger(CommandLineAppStartupRunner.class);
    @Override
    public void run(String...args) throws Exception {
        logger.info("Application started with command-line arguments: {} . \n To kill this application, press Ctrl + C.", Arrays.toString(args));
        questTypeRepository.save(new QuestType("Umfrage"));
        questTypeRepository.save(new QuestType("Spiel"));
        questTypeRepository.save(new QuestType("Virus"));
        questTypeRepository.save(new QuestType("Pflicht"));
        questTypeRepository.save(new QuestType("Hab noch nie"));
        sentenceRepository.save(new Sentence("Wer hatte am meisten Sexpartner?", questTypeRepository.findByCategory("Umfrage")));
        sentenceRepository.save(new Sentence("user sucht sich einen Trinkbuddy aus", questTypeRepository.findByCategory("Spiel")));
        sentenceRepository.save(new Sentence("Biersorten aufzählen. user fängt an", questTypeRepository.findByCategory("Virus")));
        sentenceRepository.save(new Sentence("user erzählt seine peinlichste Suffstory", questTypeRepository.findByCategory("Pflicht")));
        sentenceRepository.save(new Sentence("Wer hatte noch nie Analsex", questTypeRepository.findByCategory("Hab noch nie")));
        sentenceRepository.save(new Sentence("Wer hatte das beste Abitur?", questTypeRepository.findByCategory("Umfrage")));
        sentenceRepository.save(new Sentence("Wasserfall user fängt an", questTypeRepository.findByCategory("Spiel")));
        sentenceRepository.save(new Sentence("Schauspieler aufzählen, user fängt an", questTypeRepository.findByCategory("Virus")));
        sentenceRepository.save(new Sentence("user lehrt sein  Getränk", questTypeRepository.findByCategory("Pflicht")));
        sentenceRepository.save(new Sentence("Ich hab noch nie mit einem der Mitspieler geschlafen", questTypeRepository.findByCategory("Hab noch nie")));

    }
}
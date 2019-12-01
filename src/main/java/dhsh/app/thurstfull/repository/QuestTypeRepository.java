package dhsh.app.thurstfull.repository;

import dhsh.app.thurstfull.domain.QuestType;
import org.springframework.data.repository.CrudRepository;

public interface QuestTypeRepository extends CrudRepository<QuestType,Integer> {
    QuestType findByCategory(String category);
}

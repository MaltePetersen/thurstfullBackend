package dhsh.app.thurstfull.repository;

import dhsh.app.thurstfull.domain.Version;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VersionRepository extends CrudRepository<Version,Integer> {
}

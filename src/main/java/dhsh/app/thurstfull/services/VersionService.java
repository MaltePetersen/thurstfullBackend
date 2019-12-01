package dhsh.app.thurstfull.services;

import dhsh.app.thurstfull.domain.Version;
import dhsh.app.thurstfull.repository.VersionRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class VersionService {
    VersionRepository versionRepository;

    public VersionService(VersionRepository versionRepository) {
        this.versionRepository = versionRepository;
    }

    public long getCurrentTimeStamp() {
        Optional<Version> version = versionRepository.findById(1);
        if (version.isPresent())
            return version.get().getTimestamp();

        return 0;
    }

    public void updateTimestamp() {
        Optional<Version> version = versionRepository.findById(1);
        if (version.isPresent()) {
            version.get().setTimestamp(Instant.now().getEpochSecond());
            versionRepository.save(version.get());
        } else {
            versionRepository.save(new Version( 1,Instant.now().getEpochSecond()));
        }
    }
}

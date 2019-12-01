package dhsh.app.thurstfull.api;

import dhsh.app.thurstfull.services.VersionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class VersionController {
   private VersionService versionService;

    VersionController(VersionService versionService) {
        this.versionService = versionService;
    }

    @GetMapping("/version")
    long getVersion() {
        return versionService.getCurrentTimeStamp();
    }
}

package dhsh.app.thurstfull.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Version {
    @Id
    private int id;
    private long timestamp;

    public Version(int id, long timestamp) {
        this.id = id;
        this.timestamp = timestamp;
    }

    public Version() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}

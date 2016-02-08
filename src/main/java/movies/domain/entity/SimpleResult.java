package movies.domain.entity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.Map;

/**
 * Created by grosal3 on 2/5/16.
 */
@NodeEntity
@QueryResult
public class SimpleResult {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @GraphId Long id;

    private Map<String, String> awesomenessByActor;

    private long count;

    public Map<String, String> getAwesomenessByActor() {
        return awesomenessByActor;
    }

    public void setAwesomenessByActor(Map<String, String> awesomenessByActor) {
        this.awesomenessByActor = awesomenessByActor;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}

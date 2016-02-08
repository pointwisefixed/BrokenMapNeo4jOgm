package movies.domain;

import movies.domain.entity.SimpleResult;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

/**
 * Created by grosal3 on 2/8/16.
 */
public interface SimpleRepository extends GraphRepository<SimpleResult> {


    @Query("match (n:SimpleCheck) return count(n.name) as count, n as awesomenessByActor")
    List<SimpleResult> getSimpleResult();
}

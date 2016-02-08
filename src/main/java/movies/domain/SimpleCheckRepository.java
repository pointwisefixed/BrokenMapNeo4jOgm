package movies.domain;

import movies.domain.entity.SimpleCheck;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by grosal3 on 2/8/16.
 */
public interface SimpleCheckRepository extends GraphRepository<SimpleCheck> {


    SimpleCheck save(SimpleCheck check);
}

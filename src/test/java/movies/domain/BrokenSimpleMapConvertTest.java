package movies.domain;

import movies.domain.entity.Application;
import movies.domain.entity.SimpleCheck;
import movies.domain.entity.SimpleResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration
public class BrokenSimpleMapConvertTest {

    @Autowired private SimpleRepository repository;
    @Autowired private SimpleCheckRepository simpleCheckRepository;

    @Test
    public void testConvertion() {
        SimpleCheck sc = new SimpleCheck();
        sc.setAwesomenessLevel("Awesome");
        sc.setName("Johnny Cash");
        simpleCheckRepository.save(sc);
        SimpleCheck sc2 = new SimpleCheck();
        sc2.setAwesomenessLevel("Not Awesome");
        sc2.setName("Keanu Reeves");
        simpleCheckRepository.save(sc2);

        List<SimpleResult> results = repository.getSimpleResult();

        Assert.assertEquals(2, results.size());
    }


}

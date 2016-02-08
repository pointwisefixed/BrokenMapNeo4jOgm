package movies.domain.entity;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class SimpleCheck {
    @GraphId private Long id;

    private String name;
    private String awesomenessLevel;
    private String test1Value;
    private String test2Value;

    public String getAwesomenessLevel() {
        return awesomenessLevel;
    }

    public void setAwesomenessLevel(String awesomenessLevel) {
        this.awesomenessLevel = awesomenessLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTest2Value() {
        return test2Value;
    }

    public void setTest2Value(String test2Value) {
        this.test2Value = test2Value;
    }

    public String getTest1Value() {
        return test1Value;
    }

    public void setTest1Value(String test1Value) {
        this.test1Value = test1Value;
    }
}

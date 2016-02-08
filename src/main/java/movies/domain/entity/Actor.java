package movies.domain.entity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

@NodeEntity
public class Actor {

    @GraphId private Long id;
    private String name;

    @Relationship(type = "ACTS_IN", direction = "OUTGOING") private Set<Movie> movies = new HashSet<>();

    private String awesomenessLevel;

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    public void actsIn(Movie movie) {
        movies.add(movie);
        movie.getActors().add(this);
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

    public String getAwesomenessLevel() {
        return awesomenessLevel;
    }

    public void setAwesomenessLevel(String awesomenessLevel) {
        this.awesomenessLevel = awesomenessLevel;
    }
}

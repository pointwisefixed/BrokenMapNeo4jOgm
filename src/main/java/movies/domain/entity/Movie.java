package movies.domain.entity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

@NodeEntity
public class Movie {

    @GraphId private Long id;
    private String title;
    private int released;

    @Relationship(type = "ACTS_IN", direction = "INCOMING") Set<Actor> actors;

    public Movie() {
    }

    public Movie(String title, int year) {
        this.title = title;
        this.released = year;
        this.actors = new HashSet<>();
    }

    public Set<Actor> getActors() {
        return this.actors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }
}

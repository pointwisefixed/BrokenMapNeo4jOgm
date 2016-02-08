package movies.domain;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.server.InProcessServer;
import org.springframework.data.neo4j.server.Neo4jServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by grosal3 on 2/8/16.
 */
@Configuration
@EnableNeo4jRepositories(basePackageClasses = {SimpleRepository.class, SimpleCheckRepository.class})
@EnableTransactionManagement
public class Neo4jConfig extends Neo4jConfiguration {

    public static final String[] ENTITY_PKGS = {"movies.domain.entity"};

    @Bean
    public Neo4jServer neo4jServer() {
        return new InProcessServer();
    }

    @Bean
    public SessionFactory getSessionFactory() {
        // with domain entity base package(s)
        return new SessionFactory(ENTITY_PKGS);
    }

    // needed for session in view in web-applications
    @Bean
    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Session getSession() throws Exception {
        return super.getSession();
    }
}

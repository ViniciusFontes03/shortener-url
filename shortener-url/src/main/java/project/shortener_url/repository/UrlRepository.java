package project.shortener_url.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import project.shortener_url.entities.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}

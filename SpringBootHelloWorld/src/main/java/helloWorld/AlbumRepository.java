package helloWorld;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Integer> {
	@Query(value = "Select * from Albums", nativeQuery = true)
	Iterable<Album> getAllAlbums();
}

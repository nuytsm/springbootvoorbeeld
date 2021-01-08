package helloWorld;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import helloWorld.Artist;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Integer>{
	
	@Query(value = "Select * from Artist", nativeQuery = true)
	Iterable<Artist> getAllArtists();
	
	@Query(value = "Select * from Artist where artistid = ?1", nativeQuery = true)
	Artist filterById(int id);

	@Query(value = "Select * from Artist", nativeQuery = true)
	Iterable<Artist> filterByName(@Param("name") String name);
}

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
	
//	@Query(value = "select * from Artist where ArtistId = 1", nativeQuery = true)
	Artist findById(int id);

//	@Query("select u from User u where u.firstname like %?1")
	@Query("select a from Artists a where a.name like %?1%")
	Iterable<Artist> findByNameContains(@Param("name") String name);
}

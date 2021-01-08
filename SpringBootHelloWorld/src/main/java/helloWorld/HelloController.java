package helloWorld;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	

	@Autowired
	private ArtistRepository artistRep;
	
	@GetMapping("/")
    public Iterable<Artist> index() {
        return artistRep.findAll();
    }
	
	@GetMapping("/byid")
	@ResponseBody
    public String byId(@RequestParam int id) {
		
        return "ID : " +id;
    }
	
	@GetMapping("/byname")
    public Iterable<Artist> byName(@RequestParam String name) {
		System.out.println("******* NMAE: " + name);
        return artistRep.filterByName(name);
    }
	  
	  

}

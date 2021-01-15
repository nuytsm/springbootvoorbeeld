package helloWorld;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="Albums")
public class Album {
	@Id
	@GeneratedValue
	@Column(name="Albumid")
	private Integer albumId;
	@Column(name="Title")
	private String title;
	@ManyToOne
	@JoinColumn(name = "Artistid", referencedColumnName = "Artistid")
	private Artist artist;

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
}

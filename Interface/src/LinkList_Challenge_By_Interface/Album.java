package LinkList_Challenge_By_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
	private String albumName;
	private String albumArtist;
	private ArrayList<Song> songsList;
	
	public Album(String albumName,String albumArtist) {
		//System.out.println(albumName);
		this.albumName=albumName;
		this.albumArtist=albumArtist;
		this.songsList=new ArrayList<Song>();
	}
	
	public boolean addSongs(String name,String duration) {
		if(findSong(name)==null) {
			//System.out.println("Add to Playlist" + name);
			this.songsList.add(new Song(name,duration));
			return true;
		}
		return false;
	}
	
	public Song findSong(String name) {
		for(Song checkSong : this.songsList) {
			if(checkSong.getTitle().equals(name)) {
				return checkSong;
			}
		}
		return null;
	}
	
	public boolean addToPlaylist(int trackNumber,List<Song> playlist) {
		int index=trackNumber-1;
		if(index >=0 && index <= this.songsList.size()) {
			//System.out.println("Track Number "+ trackNumber);
			playlist.add(this.songsList.get(index));
			return true;
		}
		System.out.println("This album does not have a track "+trackNumber);
		return false;
	}
	
	public boolean addToPlaylist(String trackName, List<Song> playlist) {
			Song checkSong=findSong(trackName);
			if(checkSong !=null) {
				playlist.add(checkSong);
				return true;
			}
			System.out.println("The song "+ trackName+ " is not in this album");
			return false;
		}
}


package LinkList_Challenge;

import java.util.*;

public class Main {
	
	public static ArrayList<Album> albums=new ArrayList<Album>();
	
	public static void main(String[] args) {
		Album album =new Album("Khohinoor","DIVINE");
		album.addSongs("Khohinoor", "4.23");
		album.addSongs("Machayenge", "3.14");
		album.addSongs("Bombay to punjab", "4.56");
		album.addSongs("Khohinoor again ", "5.67");
		album.addSongs("Machayenge2 remix", "2.78");
		album.addSongs("Bombayhighway", "2.55");
		albums.add(album);
		
		album =new Album("MC Album","Honey Singh");
		
		album.addSongs("Abala ka dabra", "3.45");
		album.addSongs("boom boom robota", "4.56");
		album.addSongs("chehra tera", "5.35");
		album.addSongs("Dekha tuze", "6.66");
		album.addSongs("Emran mera bhai", "7.50");
		album.addSongs("ye Fugli fugli Kya hey", "8.89");
		albums.add(album);
		
		LinkedList<Song> playlist=new LinkedList<Song>();
		albums.get(0).addToPlaylist("Machayenge", playlist);
		albums.get(0).addToPlaylist("Bombayhighway", playlist);
		albums.get(0).addToPlaylist("Nothing ", playlist);       // Does not exists in First Album.
		
		albums.get(0).addToPlaylist(5, playlist);
		albums.get(1).addToPlaylist(6, playlist);
		albums.get(1).addToPlaylist(4, playlist);
		albums.get(1).addToPlaylist(3, playlist);
		
		albums.get(1).addToPlaylist(24, playlist);
		
		play(playlist);
	}
	
	private static void play(LinkedList<Song> playlist) {
		Scanner sc =new Scanner(System.in);
		boolean quit =false;
		boolean forward=true;
		ListIterator<Song> listIterator =playlist.listIterator();
		if(playlist.size()==0) {
			System.out.println("No Songs in playlist");
		}
		else{
			System.out.println("Now Playing "+ listIterator.next().toString());
			printMenu();
		}
		while(!quit) {
			int action =sc.nextInt();
			sc.nextLine();
			switch(action) {
			case 0: 
					System.out.println("PlayList Complete");
					quit =true;
					break;
			case 1:
					if(!forward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						forward=true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now Playing "+ listIterator.next().toString());
					}else{
						System.out.println("We have reached the end of playlist");
						forward=false;
					}
					break;
			case 2:
					if(forward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						forward=false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now Palying "+ listIterator.previous().toString());
					}else {
						System.out.println("We are at start of the playlist");
						forward=true;
					}
				break;
			case 3:
					if(forward) {
						if(listIterator.hasPrevious()) {
							System.out.println("Now Playing "+ listIterator.previous().toString());
							forward=false;
						}else {
							System.out.println("We are at start of the list");
						}
					}else {
						if(listIterator.hasNext()) {
							System.out.println("Now Playing "+ listIterator.next().toString());
							forward=true;
						}
						else {
							System.out.println("We have reached the end of the list");
						}
					}
					break;
			case 4:
					printList(playlist);
					break;
			case 5:
					printMenu();
					break;
					
			case 6 : 
					if(playlist.size()>0) {
						if(listIterator.hasNext()) {
						Song songs=listIterator.next();
						listIterator.remove();
						System.out.println("Now Playling "+ songs);
						}else {
							if(listIterator.hasPrevious()) {
								Song songs=listIterator.previous();
								listIterator.remove();
								System.out.println("Now Playling "+ songs);
							}
						}
					}
					break;
			}
		}
		sc.close();
	}

	private static void printMenu() {
		System.out.println("Available actions :\npress");
		System.out.println("0 - to quit\n"
				+ "1 - to play next song\n"
				+ "2 - to play previous song\n"
				+ "3 - to replay the current song\n"
				+ "4 - list songs in the playlist\n"
				+ "5 - print available actions\n"
				+ "6 - to remove current song");
	}

	private static void printList(LinkedList<Song> playlist) {
			Iterator<Song> iterator = playlist.listIterator();
			System.out.println("======================================");
			
			while(iterator.hasNext()) {
				System.out.println(iterator.next().toString());
			}
			System.out.println("======================================");
	}
	
}

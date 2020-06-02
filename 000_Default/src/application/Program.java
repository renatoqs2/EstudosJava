package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.text.SimpleAttributeSet;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awsome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Titulo", "Viajando para Nova Zelãndia", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Have a nice trip!");
		Comment c4 = new Comment("Wow that's awsome!");
		Post p2 = new Post(sdf.parse("21/06/2018 13:05:44"), "Titulo", "Viajando para Nova Zelãndia", 12);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		
		
		System.out.println(p1);
		System.out.println(p2);
		
		
//		sc.close();
	
	}

}

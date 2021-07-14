package application;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awsome!");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post p1 = new Post(
                sdf.parse("21/06/2021 21:40:44"),
                "Traveling to New Zeland",
                "I'm going to visit tihs wonderful countery!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);
        
        System.out.println(p1);  
        System.out.println();
        
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post p2 = new Post(
                sdf.parse("28/07/2021 21:41:44"),
                "Good morning guys",
                "See you later",
                5);
        p2.addComment(c3);
        p2.addComment(c4);
        
        System.out.println(p2);
    }
    
}

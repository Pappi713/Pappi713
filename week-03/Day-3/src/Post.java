import Classes.PostIt;
import Classes.BlogPost;

public class Post {
    public static void main(String[] args) {

        PostIt p1 =new PostIt("orange","Idea 1","blue");
        PostIt p2 =new PostIt("pink","Awesome","black");
        PostIt p3 =new PostIt("yellow","Superb!","green");

        BlogPost bp1=new BlogPost("John Doe","Lorem Ipsum","Lorem ipsum dolor sit amet.","2000.05.04.");
        BlogPost bp2=new BlogPost("Tim Urban","Wait but why","A popular long-form, stick-figure-illustrated blog about almost everything.","010.10.10.");
        BlogPost bp3=new BlogPost("William Turton","One Engineer Is Trying to Get IBM to Reckon With Trump","Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.","2017.03.28.");

    }
}

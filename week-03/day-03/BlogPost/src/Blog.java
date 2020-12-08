import java.util.ArrayList;
import java.util.List;

public class Blog {

    //    store a list of BlogPosts
    //    add BlogPosts to the list
    //    delete(int) one item at given index
    //    update(int, BlogPost) one item at the given index and update it with another BlogPost
    List<BlogPost> BlogList =new ArrayList<>();
//    public ArrayList<BlogPost> BlogList;
//
//    public Blog() {
//        BlogList = new ArrayList<>();
//    }

    public void addBlog(BlogPost blogPost) {
        BlogList.add(blogPost);

    }

    public void delete(int index) {
        BlogList.remove(index);
    }

    public void update(int index, BlogPost blogPost) {
        BlogList.add(index, blogPost);
    }


}

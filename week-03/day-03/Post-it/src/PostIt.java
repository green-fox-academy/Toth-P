public class PostIt {
//    - Create a `PostIt` class that has
//    - a `backgroundColor` represented by a String
//    - a `text` on it
//    - a `textColor` represented by a String


    String backgroundColor;
    String text;
    String textColor;

}

    //    - Create a few example post-it objects:
    //            - an orange with blue text: "Idea 1"
    //            - a pink with black text: "Awesome"
    //            - a yellow with green text: "Superb!"

    public static void main(String[] args) {
        PostIt postit1 = new PostIt();
        PostIt postit2 = new PostIt();
        PostIt postit3 = new PostIt();


        postit1.backgroundColor = "orange";
        postit1.text = "Idea 1";
        postit1.textColor = "blue";

        postit2.backgroundColor = "pink";
        postit2.text = "Awesome";
        postit2.textColor = "black";

        postit3.backgroundColor = "yellow";
        postit3.text = "Superb";
        postit3.textColor = "green";


    }
}

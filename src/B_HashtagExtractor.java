/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    // int - string.indexOf (m', 10 ) --> starts counting at 0 not 1 , when has two parameters its gonna be string than int
    //boolean  string.contains (k')
    //  string.substring
    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        int hashIndex = post.indexOf("#");
       while (hashIndex != -1 ) { // if there is not another hashtag to be found don't keep going
           int spaceIndex = post.indexOf(" ", hashIndex); // find first space after the hashtag
           if(spaceIndex == -1) {
               spaceIndex = post.length();// number of characters in the string

           }
           System.out.println("Hashtag: " + post.substring(hashIndex, spaceIndex));
           hashIndex = post.indexOf("#", spaceIndex);
       }

    }

}

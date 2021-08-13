public class Poem extends Literature {
    //private String title;
    //private String author;
    private String style;

    public Poem(String title,String author, String style){
        super(title, author);
        this.style = style;
    }
    public  void Print() {
        System.out.println("Poem: " + title);
        System.out.println("\tWritten By: " + author );
        System.out.println("\tIn the Style of: " + style);
    }
}

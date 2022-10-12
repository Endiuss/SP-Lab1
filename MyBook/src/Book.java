import java.util.ArrayList;

public class Book {
    private String name;
    private Author author;
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    private ArrayList<String> paragraphs = new ArrayList<String>();
    private ArrayList<String> images= new ArrayList<String>();
    private ArrayList<String> tables= new ArrayList<String>();
    Book(String name){
        this.name=name;

    }
    public void addAuthor(Author a ){this.author=a;}
    public int createChapter(String chapterName){
       chapters.add(new Chapter(chapterName));
       return chapters.size()-1;
    }
    public Chapter getChapter(int chapterIndex){return this.chapters.get(chapterIndex);}
    public void createNewParagraph(String paragraphName){
        this.paragraphs.add(paragraphName);
    }
    public void createNewImage(String imageName){
        this.images.add(imageName);
    }
   public void print(){
           System.out.println(name + " de "+ author.getName());
        for(Chapter c: chapters){
            c.print();
        }
   }
    }


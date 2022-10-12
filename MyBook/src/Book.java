import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList<String> paragraphs = new ArrayList<String>();
    private ArrayList<String> images= new ArrayList<String>();
    private ArrayList<String> tables= new ArrayList<String>();
    Book(String name){
        this.name=name;

    }
    public void createNewParagraph(String paragraphName){
        this.paragraphs.add(paragraphName);
    }
    public void createNewImage(String imageName){
        this.images.add(imageName);
    }
    public void createNewTable(String tableName){
        this.tables.add(tableName);}
        public void print(){
            String paragraph="";
            for(String p : paragraphs){paragraph+=p+",";}
            System.out.println("Book name: "+name+" paragraphs:"+paragraph);
        }
    }


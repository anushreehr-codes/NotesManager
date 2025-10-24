import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
class Note{
    String title;
    String content;
    LocalDateTime createdAt;

    public Note(String title,String content, LocalDateTime createdAt)
    {
        this.title=title;
        this.content=content;
        this.createdAt=createdAt;
    }
    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    
    }
    @Override
    public String toString(){
        return "Title: "+title+"\nContent: "+content+"\nCreated At: "+createdAt.toString();
    }
}
class NoteApp{
    public void addNote(Note note) throws IOException
    {
        // Code to add the note
        File file=new File("notes.txt");
        FileWriter writer=new FileWriter(file,true);
        writer.write(note.toString()+"\n");
        writer.close();
    }
    public void viewNotes() throws IOException
    {
        // Code to view notes
        File file=new File("notes.txt");
        if(!file.exists())
        {
            System.out.println("No notes found.");
            return;// this return statement is to come out of the method if the file is not found.
        }
        FileReader reader=new FileReader(file);//filereader is used to read the file.
        BufferedReader bf=new BufferedReader(reader);//buffered reader is used to read the file line by line.
       //bufferd reader cannot directly interact with the file it need some underlying reder object.so that reader object is FileReader reader.
        String line=bf.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line=bf.readLine();
        }
        bf.close();
        reader.close();
    }
}
public class NoteManager {
    public static void main(String[] args) throws IOException  {
    Scanner sc= new Scanner(System.in);
    NoteApp app=new NoteApp();
    boolean flag=true;
    while (flag) 
    {
        System.out.println("1. Add Note");
        System.out.println("2.veiw Note");
        System.out.println("3.exit");
        System.out.println("Enter the choice");
        int choice=sc.nextInt();
        sc.nextLine(); // Consume newline
        switch (choice) {
            case 1:
            System.out.println("Creating the note in the notes.txt ");
            System.out.println("enter the title");
            String title=sc.nextLine();
            System.out.println("enter the content");
            String content=sc.nextLine();
            //System.out.println("enter the date");//need not to add.
            LocalDateTime createdAt=LocalDateTime.now();
            Note note = new Note (title,content,createdAt);
            app.addNote(note);
            System.out.println("Note added successfully.");
            break;
            case 2:
            System.out.println("viewing the notes from the notes.txt");
            app.viewNotes();
            break;
            case 3:
            System.out.println("Exsiting");
            flag=false;
            break;
            default:
            System.out.println("enterd the wrong choice");
            break;
        }
    } 
}
}



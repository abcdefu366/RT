import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Varen varen = new Varen("Варен");
        Morel morel = new Morel("Морель");
        Narrator Narrator = new Narrator();
        Narrator.addPhrase(varen.getPhrase());
        Narrator.addPhrase(morel.getPhrase());
        Narrator.addPhrase(varen.getPhrase());
        Narrator.addPhrase(morel.getPhrase());
        Narrator.addPhrase(varen.getPhrase());
        Narrator.addPhrase(morel.getPhrase());
        Narrator.addPhrase(varen.getPhrase());
        Narrator.addPhrase(morel.getPhrase());
        Narrator.addPhrase(varen.getPhrase());
        Narrator.sayPhrase();
        Narrator.sayPhrase();
        Narrator.sayPhrase();
        Narrator.sayPhrase();
        Narrator.sayPhrase();
        Narrator.sayPhrase();
    }
}
class Narrator {
    private ArrayList<String> phrases = new ArrayList<>();
    public void addPhrase(String phrase) {
        phrases.add(phrase);
    }
    public void sayPhrase() {
        int a = (int) Math.ceil(Math.random()*8);
        System.out.println(phrases.get(a));
    }
}
class Varen {
    private String name;
    private String phrase = "Это моя фраза!";
    public String getPhrase() {
        return phrase;
    }
    public Varen(String name) {
        this.name = name;
    }
}
class Morel {
    private String name;
    private String phrase = "А это моя фраза!";
    public String getPhrase() {
        return phrase;
    }
    public Morel(String name) {
        this.name = name;
    }
}
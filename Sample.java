import java.util.ArrayList;
public class Sample {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(1, "133");
        System.out.println(pitches.remove(1));
    }
}


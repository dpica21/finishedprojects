import java.io.Console;
 
public class Introductions {

public static void main(String[] args) {
        Console console = System.console();
        String ageString = console.readLine("How old are you?  ");
        int age = Integer.parseInt(ageString);
        String lie;
        if (age < 18) {
          console.printf("You are too young to use this program. Program is turning off.\n");
          System.exit(0);
        }
        if (age > 18) {
          lie = console.readLine("Are you lying? ");
          if (lie.equalsIgnoreCase("yes") ||
              lie.equalsIgnoreCase("yep") || 
              lie.equalsIgnoreCase("yeah") ||
              lie.equalsIgnoreCase("sure") ||
              lie.equalsIgnoreCase("maybe") ||
              lie.equalsIgnoreCase("definitely") ||
              lie.equalsIgnoreCase("obviously")) {
          console.printf("Thanks for your honesty, but you are too young to use this program. Program is turning off.\n");
          System.exit(0);
          }
          
        }
        String name = console.readLine("Name(not your own):  ");
        String adj =  console.readLine("Adjective:  ");
        String verb = console.readLine("Verb( -ing):  ");
        String partofbody = console.readLine("Part of body:  ");
        String number = console.readLine("Number:  ");
        String noun = console.readLine("Noun:  "); 
        String adverb = console.readLine("Adverb (usually ends in -ly):  ");
        String emotion = console.readLine("Emotion:  ");
        String yourname = console.readLine("Your Name:  ");
        console.printf("I didn't write this, I got it from online.\n");
        console.printf(" Dear %s,\n", name);
        console.printf("You are extremly %s and I'm %s you! I want to kiss your %s %s times. You make my %s burn with desire. When I first saw you, I %s stared at you and fell in love.\n", adj, verb, partofbody, number, noun, adverb);
        console.printf("Will you please go out with me? Don't let your parents discourage you, they are just %s.\n", emotion);
        console.printf("Love, %s\n", yourname);

  
  
  
}

}

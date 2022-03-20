import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

  String text = "Eve’ryone could notice that people often complain and say that it was better before. It may be a little nostalgia;\n" +
          "the old people would like to return in the 50s, forty-years-old people prefer the 70s.\n" +
          "It can be explained of the life period when they were younger. As it’s known people like their youth time.\n" +
          "In general living is better now. We live when there aren’t as many wars in the world as before. And\n" +
          "people live longer; the level of lifespan is higher than it was 40 years ago. People work less and they\n" +
          "can afford to go to the vacation and buy more things.\n" +
          "So, it is true that there is more pollution now than in the last century but there is more conveniences.\n" +
          "Everyone has a shower, a TV, a fridge, a computer, etc. And now there are more means of communication\n" +
          "than before. Earlier it was dangerous to travel and it was almost impossible to go around the world.\n" +
          "Someone say that people were kinder before. But now people are more educated and now everyone has an\n" +
          "opportunity to go to school and to get education. It’s better to think of advantages to live in the\n" +
          "modern world than to regret something that no longer exists.";

    System.out.println(splitTextIntoWords(text));

  }
  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод

    StringBuilder string = new StringBuilder("");
    int repeat = 0;
    String regex = "([A-z’]+)\\s*";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);

    while (matcher.find())
    {
//      string.append(Objects.equals(string, "") ? matcher.group(1) : "\n" + matcher.group(1)); // не хочет сравнивать пустую строку
      string.append(repeat == 0 ? matcher.group(1) : "\n" + matcher.group(1));
      repeat++;
    }
    return string.toString();

  }
}

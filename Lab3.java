/*
 * C3 = 2, тип текстових змінних: String
 * C13 = 4, дія з рядком: В кожному реченні заданого тексту змінити місцями перше та останнє слово, не змінивши довжини речення.
 */

import java.util.ArrayList;

public class Lab3 {
    public static <LinkedList> void main(String[] args) {
        String text = "Ранок. І розступалися скелі, маючи тінями. І розбігалися злякано сосни й смереки, кидаючись урозтіч. " +
                "Заскочений нагло сохатий прикипав на галявині, паралізований жахом... А далі зривався й, " +
                "ламаючи ноги та обдираючи шкіру, гнав скільки духу у безвість. ";
        String[] string = text.split("(\\. )|(\\? )|(\\! )|(\\.\\.\\. )");
        ArrayList<String> textParts = new ArrayList();

        for (int i = 0; i < string.length ; i++) {
            String[] parts = string[i].split(" ");

            if (parts.length > 1) {
                String first = parts[0];
                parts[0] = parts[parts.length - 1];
                parts[parts.length - 1] = first;
                String result = String.join(" ", parts);
                String sentence = result + ".";
                String lowerSentence = sentence.toLowerCase();
                String resultString = lowerSentence.substring(0, 1).toUpperCase() + lowerSentence.substring(1);
                textParts.add(resultString);
                //System.out.println(result.length());
            }

            else {
                String result = String.join(" ", parts);
                String resultString = result + ".";
                textParts.add(resultString);
                //System.out.println(result.length());
            }
            //System.out.println(string[i].length());
        }

        String resultText = String.join(" ", textParts);
        System.out.println(resultText);
    }
}

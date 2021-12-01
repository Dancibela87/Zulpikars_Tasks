package tasks1;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word = "AAABBBBBCCCCDDDD";
        String removeDup = "";

        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);

            if(removeDup.contains(""+each)){
                continue;
            }
            removeDup += each;

        }

        System.out.println("removeDup = " + removeDup);

        String result ="";
        for (int j = 0; j <= removeDup.length()-1; j++) {

            char ch = removeDup.charAt(j);
            int frequency = 0;

            for (int i = 0; i <= word.length() - 1; i++) {
                char each = word.charAt(i);
                if (each == ch) {
                    frequency++;
                }
            }
            result+="" +ch + frequency;

        }
        System.out.println(result);



    }






}

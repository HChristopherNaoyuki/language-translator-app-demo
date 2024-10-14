package languagetranslator;

public class TranslatorApp 
{
    public static void main(String[] args) 
    {
        // Array of English words to be translated
        String[] ENGLISH_WORDS = 
        {
            "sky", 
            "run", 
            "study", 
            "music", 
            "dog"
        };
        
        // Number of English words
        int numberOfEnglishWords = ENGLISH_WORDS.length;

        // 2D array of translated words in Dutch, French, and Italian
        String[][] TRANSLATED_WORDS = 
        {
            {"hemel", "ciel", "cielo"},
            {"rennen", "courir", "correre"},
            {"studie", "etude", "studia"},
            {"muziek", "musique", "musica"},
            {"hond", "chien", "cane"}
        };
        
        // Print the header for the output table
        System.out.println("WORD IN ENGLISH\tDUTCH\t\tFRENCH\t\tITALIAN");
        System.out.println("-----------------------------------------------------------");
        
        // Loop through each English word and its translations
        for (int i = 0; i < numberOfEnglishWords; i++) 
        {
            // Print the English word
            System.out.print(ENGLISH_WORDS[i] + "\t\t");
            
            // Loop through the translations and print them
            for (String translation : TRANSLATED_WORDS[i]) 
            {
                System.out.print(translation + "\t\t");
            }
            
            // Move to the next line after printing all translations for the current word
            System.out.println();
        }
        System.out.println();
    } 
}

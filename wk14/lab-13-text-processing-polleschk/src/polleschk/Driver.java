/*
 * Course: CSC-1110
 * Assignment: Text Processing
 * Name: Kaiden Pollesch
 */
package polleschk;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.File;

/**
 * Driver class for the lab 12 with processing text files and creating text files.
 */
public class Driver {
    private static final String DATA_FOLDER = "data";
DecimalFormat format = new DecimalFormat("#0.##")
    public static void main(String[] args) throws FileNotFoundException {
        // Instantiate your collections and other variables here
        List<Word> vocabEntryArray = new ArrayList<>();
        List<BasicWord> basicWordArray = new ArrayList<>();
        List<Word> bigramArray = new ArrayList<>();

        // ask user for file
        Scanner scanner = new Scanner(System.in);
        String input = getInput(scanner, "File ? : ");

        // read file into Scanner
        Scanner fileReader = new Scanner(input);

        // trim heading out of file
        removeHeader(fileReader);

        // generate words and add to a list
        addWords(basicWordArray, fileReader);

        // generate bigrams from list
        addBigrams(bigramArray, basicWordArray);

        // generate vocabulary from list
        addVocabulary(vocabEntryArray, basicWordArray);

        // sort the data
        bigramArray.sort(Collections.reverseOrder());
        vocabEntryArray.sort(Collections.reverseOrder());

        // Save vocabulary as a text file
        saveFile(vocabEntryArray, new File(DATA_FOLDER, "vocabulary.txt"));

        // Save bigrams as a text file
        saveFile(bigramArray, new File(DATA_FOLDER, "bigrams.txt"));

        // generate reports
        // Ask for how many top entries to show
        int topEntries = Integer.parseInt(getInput(scanner,
                "How many top entries to do you want shown?"));

        // report the top entries for vocabulary
        report(vocabEntryArray, "Vocabulary", topEntries);

        // report the top entries for bigrams
        report(bigramArray, "Bigrams", topEntries);

    }
    private static String getInput(Scanner in, String message) {
        System.out.println(message);
        return in.nextLine();
    }
    private static void removeHeader(Scanner read) {
        while (read.hasNextLine()){
            String currentLine = read.nextLine();
            if (currentLine.endsWith("*** START OF THE PROJECT GUTENBERG EBOOK")){
                break;
            }
        }
    }
    private static void addWords(List<BasicWord> words, Scanner read) {
        long index = 0;
        while (read.hasNext()){
            String currentLine = read.nextLine();
            if (currentLine.contains("*** END OF THE PROJECT GUTENBERG EBOOK")){
                break;
            }
            String[] wordsInLine = currentLine.split(" ");
            for (String word : wordsInLine){
                String normalizedWord = normalize(word);
                if (!normalizedWord.isEmpty()){
                    words.add(new BasicWord(normalizedWord, index++));
                }
            }
        }
    }
    private static void addBigrams(List<Word> bigrams, List<BasicWord> words) {
        for (int i = 0; i <words.size() - 1; i++) {
            BasicWord word1 = words.get(i);
            BasicWord word2 = words.get(i + 1);
            Bigram bigram = new Bigram(word1, word2);
            if (bigrams.contains(bigram)) {
                int index = bigrams.indexOf(bigram);
                bigrams.get(index).addLocation(word1.getLocation());
            } else {
                bigrams.add(bigram);
            }
        }
    }
    private static void addVocabulary(List<Word> vocabulary, List<BasicWord> words) {
        for (BasicWord word : words){
            VocabularyEntry vocabEntry = new VocabularyEntry(word);
            if (vocabulary.contains(vocabEntry)){
                int index = vocabulary.indexOf(vocabEntry);
                vocabulary.get(index).addLocation(word.getLocation());
            } else {
                vocabulary.add(vocabEntry);
            }
        }
    }
    private static void saveFile(List<Word> list, File output) throws FileNotFoundException {
        try (PrintWriter printWriter = new PrintWriter(output)){
            for (Word word : list){
                printWriter.println(word.toString());
            }
        }
    }
    private static void report(List<Word> list, String type, int topEntries) {
        System.out.println(type);
        System.out.println("Occurrences\tWord");
        int counter = 0;
        for (Word word : list){
            if (counter >= topEntries){
                break;
            }
            System.out.printf("%-5d\t\t%s%n", word.toString());
            counter++;
        }
    }
    private static String normalize(String s) {
        String normalized = s.replaceAll("\\p{Punct}", "").toLowerCase();
        return normalized;
    }
}

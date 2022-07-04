package com.ulrictodman.madlibs.service;

import com.ulrictodman.madlibs.enumeration.PartOfSpeech;
import com.ulrictodman.madlibs.model.MadLib;
import com.ulrictodman.madlibs.model.Word;

import java.util.*;

public class MadLibServiceImpl implements MadLibService {
    //Madlib Game steps
    //1. Verify user input.
    //1a. Verify that the user input matches words in the word bank.
    //1b. Verify that the user input matches the parts of speech in the story.
    //1c. If invalid inform user and ask them to try again.

    //2. Print the story.

    private MadLib madLib = new MadLib ("The %s brown %s jumped over the %s %s");

    private List<String> userInputList = new ArrayList<> ();

    @Override
    public void printMadLib(List<String> userInput ) {
        System.out.println (String.format ( madLib.getStory (), userInput.toArray () ));
    }

    public void printBlankMadLib( ) {
        System.out.println (String.format ( madLib.getStory ().replace ( "%s", "%1$s" ) , "_________________"));
    }

    @Override
    public  void playGame( ) {

        setUpMadlib ();

        printWelcomeScreen ();

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Please enter your words to complete the mad lib: ");
        String userInput = scanner.nextLine ();

        if( !verifyUserInput ( userInput )){
            return;
        };
        printMadLib (userInputList);




    }

    private void printWelcomeScreen() {
        System.out.println ("Welcome to Mad Libs!");
        System.out.println ("These are the available words in the word bank:");
        for(Word word : madLib.getWordBank ()){

            System.out.println ("Word: "+ word.getWord ()+ "\n   Parts of Speech: "+word.getPartsOfSpeech ()+"\n");

        }

        printBlankMadLib ();
    }



    private void setUpMadlib() {
        Word word1 = new Word("dumb", Collections.singletonList ( PartOfSpeech.ADJECTIVE ) );
        Word word2 = new Word ("cat", Collections.singletonList ( PartOfSpeech.NOUN ) );
        Word word3 = new Word ("smelly", Collections.singletonList ( PartOfSpeech.ADJECTIVE ) );
        Word word4 = new Word ("crackhead", Arrays.asList ( PartOfSpeech.NOUN, PartOfSpeech.ADJECTIVE ) );
        List<Word> wordList = Arrays.asList ( word1, word2, word3, word4 );
        madLib.setWordBank ( wordList );
    }

    @Override
    public boolean verifyUserInput( String userInput ) {

        userInputList = Arrays.asList (  userInput.split ( " " ));

        for (Word word : madLib.getWordBank ()){
            if(!userInput.contains ( word.getWord () )){
                System.out.println ("Please enter valid words");
                return false;
            }
        };

        System.out.println ("Input Validation Successful");
        return true;
    }


    public static void main( String[] args ) {
    MadLibService madLibService  = new MadLibServiceImpl ();

    madLibService.playGame ();
    }
}




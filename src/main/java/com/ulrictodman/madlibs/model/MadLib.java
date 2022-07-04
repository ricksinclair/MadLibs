package com.ulrictodman.madlibs.model;
import java.util.List;

import com.ulrictodman.madlibs.enumeration.PartOfSpeech;

public class MadLib {
    private String story;
    private List<Word> wordBank;
    private List<PartOfSpeech> partsOfSpeech;

    public MadLib(){

    }


    public MadLib( String story) {
        this.story = story;

    }


    public MadLib( String story, List<Word> wordBank, List<PartOfSpeech> partsOfSpeech) {
        this.story = story;
        this.wordBank = wordBank;
        this.partsOfSpeech = partsOfSpeech;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public List<Word> getWordBank() {
        return wordBank;
    }

    public void setWordBank( List<Word> wordBank ) {
        this.wordBank = wordBank;
    }

    public List<PartOfSpeech> getPartsOfSpeech() {
        return partsOfSpeech;
    }

    public void setPartsOfSpeech( List<PartOfSpeech> partsOfSpeech) {
        this.partsOfSpeech = partsOfSpeech;
    }





}

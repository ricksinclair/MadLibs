package com.ulrictodman.madlibs.model;

import com.ulrictodman.madlibs.enumeration.PartOfSpeech;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private String word;
    private List<PartOfSpeech> partsOfSpeech;

    
    public Word(){
    }

    public Word ( String word, List<PartOfSpeech> partsOfSpeech){
        this.word = word;
        this.partsOfSpeech = partsOfSpeech;
    }

    public String getWord() {
        return word;
    }

    public void setWord( String word ) {
        this.word = word;
    }

    public List<PartOfSpeech> getPartsOfSpeech() {
        return partsOfSpeech;
    }

    public void setPartsOfSpeech( List<PartOfSpeech> partsOfSpeech ) {
        this.partsOfSpeech = partsOfSpeech;
    }

    public static void main( String[] args ) {




    }
    
}

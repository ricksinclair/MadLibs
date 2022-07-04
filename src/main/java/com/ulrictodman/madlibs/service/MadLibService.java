package com.ulrictodman.madlibs.service;

import java.util.List;

public interface MadLibService {

    public  void printMadLib( List<String> userInput);
    public void playGame( );
    public boolean verifyUserInput(String userInput);



}

package com.said.destek.serviceImpl;

import com.said.destek.service.IDistinctElements;

import java.util.ArrayList;
import java.util.List;

public class DistinctElementsImpl implements IDistinctElements {

    @Override
    public List<Character> getDistinctCharacterInString(String value) {
        List<Character> characterList = new ArrayList<>(); //list of distinct character in string value

        for (int indexOfValue=0;indexOfValue<value.length();indexOfValue++) {
            boolean hasCharacterInList = false;  //firstly for each character represent not exist

            for (int indexOfList = 0; indexOfList < characterList.size(); indexOfList++) {
                //if character already exits do nothing
                if (characterList.get(indexOfList) == value.charAt(indexOfValue)) {
                    hasCharacterInList = true;
                }
            }
            //if has is false list not contain this character and add this character
            if (!hasCharacterInList) {
                characterList.add(value.charAt(indexOfValue));
            }
        }
        return characterList;
    }
}

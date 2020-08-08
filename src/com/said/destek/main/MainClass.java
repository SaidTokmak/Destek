package com.said.destek.main;

import com.said.destek.serviceImpl.DistinctElementsImpl;

import java.util.List;

public class MainClass {

    public static void main(String[] args){
        DistinctElementsImpl distinctElements = new DistinctElementsImpl();
        List<Character> str = distinctElements.getDistinctCharacterInString("helloworldtest");
        System.out.println(str);
    }
}

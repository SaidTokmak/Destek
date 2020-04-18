package com.said.destek.converter;

import com.said.destek.model.MoneyModel;

public class ConverterMoneyString implements ConverterMoneyToString {

    @Override
    public String convertMoneyToString(MoneyModel money) {

        //turkish numbers pronounce
        String[] number = {"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
        String[] decadeNumbers = {"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
        String[] bigNumbers = {"","yüz","bin","milyon","milyar","trilyon","katrilyon","kentilyon","sekstilyon"};

        String beforeComma, afterComma = "";
        String moneyStr = "";

        //money to be converted
        String moneyValue = money.getMoneyAmount();

        if(moneyValue.contains(",")){
            moneyValue = moneyValue.replace(',','.');
        }

        //has number after dot (penny control)
        if(moneyValue.indexOf(".") > 0){
            beforeComma = moneyValue.substring(0,moneyValue.indexOf("."));
            afterComma = moneyValue.substring(moneyValue.indexOf("."),moneyValue.length());
        }else{
            moneyStr = moneyValue;
        }

        return null;
    }

}

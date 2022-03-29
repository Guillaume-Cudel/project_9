package com.openclassrooms.realestatemanager;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UtilsUnitTest {

    @Test
    public void conversion_is_ok() throws Exception{
        int euro = 100;
        int goodResult = 110;
        int dollar = Utils.convertEuroToDollar(euro);

        assertEquals(goodResult, dollar);
    }

    @Test
    public void displayDateInFrench() throws Exception{

        DateFormat dateFormatFrench = new SimpleDateFormat("dd/MM/yyyy");
        String frenchDate = dateFormatFrench.format(new Date());

        DateFormat dateFormatEnglish = new SimpleDateFormat("yyyy/MM/dd");
        String englishDate = dateFormatEnglish.format(new Date());

        assertEquals(frenchDate, Utils.getTodayDate());
        assertNotEquals(englishDate, Utils.getTodayDate());
    }
}

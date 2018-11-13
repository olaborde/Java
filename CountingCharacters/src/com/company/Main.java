package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Fear No More by William Shakespeare

        int count = 0;

        String sampletext = "Fear no more the heat o' the sun; \n" +
                "Nor the furious winter's rages, \n" +
                "Thou thy worldly task hast done, \n" +
                "Home art gone, and ta'en thy wages; \n" +
                "Golden lads and girls all must, \n" +
                "As chimney sweepers come to dust. \n" +
                "\n" +
                "Fear no more the frown of the great, \n" +
                "Thou art past the tyrant's stroke: \n" +
                "Care no more to clothe and eat; \n" +
                "To thee the reed is as the oak: \n" +
                "The sceptre, learning, physic, must \n" +
                "All follow this, and come to dust. \n" +
                "\n" +
                "Fear no more the lightning-flash, \n" +
                "Nor the all-dread thunder-stone; \n" +
                "Fear not slander, censure rash; \n" +
                "Thou hast finished joy and moan; \n" +
                "All lovers young, all lovers must \n" +
                "Consign to thee, and come to dust. \n" +
                "\n" +
                "No exorciser harm thee! \n" +
                "Nor no witchcraft charm thee! \n" +
                "Ghost unlaid forbear thee! \n" +
                "Nothing ill come near thee! \n" +
                "Quiet consummation have; \n" +
                "And renowned be thy grave! ";


        int length = sampletext.length();

        /*
        *  step 1: Use a hash map
        *
        *  conveet
        *
        *
        * */

////        System.out.println(sampletext);
//        Map<String, Integer> charCount = new HashMap<>();
//
//        char[] charactersInString = sampletext.toCharArray();
//
//        System.out.println(charactersInString);
//
//        for (char achar : charactersInString
//             ) {
//            System.out.println(achar);
//
//            charCount.put(achar, count++);
//
//
//
//        }


        char[] chars = sampletext.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char c: chars) {
            if(charMap.containsKey(c)){
                int currentCount = charMap.get(c);
                currentCount++;

                charMap.put(c, currentCount);

            }
            else {
                charMap.put(c, 1);
            }

        }

        for (Map.Entry<Character, Integer> entry: charMap.entrySet()){

            System.out.println(entry.getKey() + " : "+ entry.getValue());

        }
 




    }
}

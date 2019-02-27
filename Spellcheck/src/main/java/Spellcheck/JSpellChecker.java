package Spellcheck;


import org.languagetool.JLanguageTool;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.rules.RuleMatch;

import java.util.List;

public class JSpellChecker {

    JLanguageTool langTool;

    public JSpellChecker(){
        langTool = new JLanguageTool(new AmericanEnglish());
    }

    public String correction(String sentence){

        try {
            List<RuleMatch> matches = langTool.check(sentence);
            for (RuleMatch match : matches) {
                System.out.println("Potential error at line: \"" +
                        match.getSentence().getText() + "\"\nDid you mean: " +
                        match.getSuggestedReplacements());
            }
        } catch (Exception e){

        }

        return null;
    }
}
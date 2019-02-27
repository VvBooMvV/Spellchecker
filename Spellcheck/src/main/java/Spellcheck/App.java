package Spellcheck;


/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        String input = "";
        if(args.length == 0){
            input = "speling erroor everwhere.";
        } else {
            //concate
            for(int i = 0; i < args.length; i++){
                input += args[i] + " ";
            }
        }

        JSpellChecker jSpell = new JSpellChecker();

        jSpell.correction(input);
    }
}


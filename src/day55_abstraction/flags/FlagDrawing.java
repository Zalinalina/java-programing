package day55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {

        public static void main(String[] args) {
            RussianFlag russianFlag = new RussianFlag();
            russianFlag.draw();

            FrenchFlaf frenchFlaf = new FrenchFlaf();
            frenchFlaf.draw();

            UkranianFlag ukranianFlag = new UkranianFlag();
            ukranianFlag.draw();
        }
    }
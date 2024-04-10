package com.example.spacca;

public class Carta {


        // Costanti per i semi delle carte
        public static final int CUORI = 0;
        public static final int QUADRI = 1;
        public static final int FIORI = 2;
        public static final int PICCHE = 3;

        // Costanti per i valori delle carte
        public static final int DUE = 2;
        public static final int TRE = 3;
        public static final int QUATTRO = 4;
        public static final int CINQUE = 5;
        public static final int SEI = 6;
        public static final int SETTE = 7;
        public static final int OTTO = 8;
        public static final int NOVE = 9;
        public static final int DIECI = 10;
        public static final int JACK = 11;
        public static final int REGINA = 12;
        public static final int RE = 13;
        public static final int ASSO = 14;

        private int seme;
        private int valore;

        // Costruttore della carta
        public Carta(int seme, int valore) {
            this.seme = seme;
            this.valore = valore;
        }

        // Metodi getter per ottenere il seme e il valore della carta
        public int getSeme() {
            return seme;
        }

        public int getValore() {
            return valore;
        }

        // Metodo per ottenere una rappresentazione testuale della carta
        @Override
        public String toString() {
            String semeStringa = "";
            String valoreStringa = "";

            switch (seme) {
                case CUORI:
                    semeStringa = "Cuori";
                    break;
                case QUADRI:
                    semeStringa = "Quadri";
                    break;
                case FIORI:
                    semeStringa = "Fiori";
                    break;
                case PICCHE:
                    semeStringa = "Picche";
                    break;
            }

            switch (valore) {
                case DUE:
                    valoreStringa = "Due";
                    break;
                case TRE:
                    valoreStringa = "Tre";
                    break;
                case QUATTRO:
                    valoreStringa = "Quattro";
                    break;
                case CINQUE:
                    valoreStringa = "Cinque";
                    break;
                case SEI:
                    valoreStringa = "Sei";
                    break;
                case SETTE:
                    valoreStringa = "Sette";
                    break;
                case OTTO:
                    valoreStringa = "Otto";
                    break;
                case NOVE:
                    valoreStringa = "Nove";
                    break;
                case DIECI:
                    valoreStringa = "Dieci";
                    break;
                case JACK:
                    valoreStringa = "Jack";
                    break;
                case REGINA:
                    valoreStringa = "Regina";
                    break;
                case RE:
                    valoreStringa = "Re";
                    break;
                case ASSO:
                    valoreStringa = "Asso";
                    break;
            }

            return valoreStringa + " di " + semeStringa;
        }
    }



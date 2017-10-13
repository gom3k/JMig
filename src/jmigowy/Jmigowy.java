package jmigowy;

import java.util.Arrays;

public class Jmigowy {

    //sprawdza czy X tag lezy w obu tagów (a, b), potem generuje 0 i 1 do tablicy
    private static int znajdz(String zrodlo1, String zrodlo2, String klucz) {
        Boolean czyjest1 = Arrays.asList(zrodlo1.split(" ")).contains(klucz);
        Boolean czyjest2 = Arrays.asList(zrodlo2.split(" ")).contains(klucz);
        if (czyjest1 == czyjest2) {
            return 0;
        } else {
            return 1;
        }
    }

    // szukanie maksymalny wartosc w kazdym kolumnie
    public static int znajdzMax(int[] wejscie) {
        int max = 0;

        for (int i = 1; i < wejscie.length; i++) {

            if (wejscie[i] > wejscie[max]) {
                max = i;
            }
        }
        return max;
    }

    private static String znajdzWord(String zrodlo, String klucz) {
        String[] splitWord = zrodlo.split(",");
        //Boolean czyjest1 = Arrays.asList(zrodlo.split(",")).contains(klucz);
        String element1 = splitWord[0]; // słowo
        String element2 = splitWord[1]; // tagi

        String[] splitKey = klucz.split(" ");
        String elementTag1 = splitKey[0]; // 1 tag
        String elementTag2 = splitKey[1]; // 2 tag
//        String elementTag3 = splitKey[2]; // 3 tag

        Boolean czyjest1 = Arrays.asList(element2.split(" ")).contains(elementTag1);
        Boolean czyjest2 = Arrays.asList(element2.split(" ")).contains(elementTag2);
//        Boolean czyjest3 = Arrays.asList(element2.split(" ")).contains(elementTag3);

        if (czyjest1 == true) {
            if (czyjest2 == true) {
//                if(czyjest3 == true){
                    return element1;
//                }else{
//                    return null;
//                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private static String splitWord(String zrodlo) {
        String[] parts = zrodlo.split(",");
        //Boolean czyjest1 = Arrays.asList(zrodlo.split(",")).contains(klucz);
        String part1 = parts[0]; // słowo
        String part2 = parts[1]; // tagi
        return part1;
    }

    public static void main(String[] args) {

        String[] tags = new String[57];
        tags[0] = "PG";
        tags[1] = "PS";
        tags[2] = "1CZ";
        tags[3] = "2CZ";
        tags[4] = "1R";
        tags[5] = "2R";
        tags[6] = "PI";
        tags[7] = "PW";
        tags[8] = "DS";
        tags[9] = "DG";
        tags[10] = "WA";
        tags[11] = "RS";
        tags[12] = "RR";
        tags[13] = "RN";
        tags[14] = "RP";
        tags[15] = "RPP";
        tags[16] = "RPL";
        tags[17] = "RDR";
        tags[18] = "RD";
        tags[19] = "RG";
        tags[20] = "RT";
        tags[21] = "ON";
        tags[22] = "ZN";
        tags[23] = "RK";
        tags[24] = "CM";
        tags[25] = "A";
        tags[26] = "B";
        tags[27] = "C";
        tags[28] = "D";
        tags[29] = "E";
        tags[30] = "F";
        tags[31] = "G";
        tags[32] = "H";
        tags[33] = "I";
        tags[34] = "J";
        tags[35] = "K";
        tags[36] = "L";
        tags[37] = "M";
        tags[38] = "N";
        tags[39] = "O";
        tags[40] = "P";
        tags[41] = "R";
        tags[42] = "S";
        tags[43] = "T";
        tags[44] = "U";
        tags[45] = "W";
        tags[46] = "Y";
        tags[47] = "Z";
        tags[48] = "1";
        tags[49] = "2";
        tags[50] = "3";
        tags[51] = "4";
        tags[52] = "5";
        tags[53] = "6";
        tags[54] = "7";
        tags[55] = "8";
        tags[56] = "9";

        String[] filmik = new String[100];
        //          "Słowo, Tagi              /- przykładowe tagi -/
        filmik[0] = "Adres, PG B 2CZ 2R";
        filmik[1] = "Alkoholik, M N 2CZ PS 2R";
        filmik[2] = "Alkomat, PS M 2CZ 1R";
        filmik[3] = "Allegro, PI PS 1CZ A DG 2R";
        filmik[4] = "Aparat słuchowy, PG WA 1CZ 1R";
        filmik[5] = "Apteczka, 2CZ H B PS 2R";
        filmik[6] = "Areszt, 2R PS 5 PI 1CZ";
        filmik[7] = "Autobus, 2R A PI RR PS 1CZ";
        filmik[8] = "Autostrada, 2R U RN PS 1CZ";
        filmik[9] = "Awatura, 1CZ 2R 5 PI PS RP";
        filmik[10] = "Badania, 1CZ 2R H PI PS";
        filmik[11] = "Bank, PI A 2R 1CZ RD PS";
        filmik[12] = "Bezpieczny, 1R 1CZ B RS PS DS";
        filmik[13] = "Będzie, 1R 1CZ M RP PS";
        filmik[14] = "Bić, 2R 1CZ B PI PS RPL";
        filmik[15] = "Brak, 2R 1CZ B H PS";
        filmik[16] = "Brat, 2R 2CZ PW PS RPR";
        filmik[17] = "Czasami, 2R 1CZ PS PW RN DG";
        filmik[18] = "Czekać, 1R 1CZ PS DS 1 RD";
        filmik[19] = "Czy, 1R 1CZ PS RPP CZ";
        filmik[20] = "Czerwony, 1R 1CZ RG PW RPP";
        filmik[21] = "Dać, 1R 1CZ M PS RDP DS";
        filmik[22] = "Czerwiec, 2R 1CZ H PS ON";
        filmik[23] = "Dobry, 1R 1CZ O RG RDP RP";
        filmik[24] = "Dom, 2R 1CZ M PS ZN";
        filmik[25] = "Dowód osobisty, 2R 2CZ PW PS O RD DS";
        filmik[26] = "Droga, 2R 1CZ M RR RP RDP PS";
        filmik[27] = "Drzwi, 2R 1CZ B PS ON";
        filmik[28] = "Dziadek, 1R 1CZ WA PG ON";
        filmik[29] = "Dziś, 2R 1CZ O RD PS";
        filmik[30] = "Dzień dobry, 2R 2CZ O M PS PG RDP RG"; // L Bk : 78 k )| P Bk : 78 k # XII I VII # L Bk : 38 t ll .. P Bk : 38 t pp
        filmik[31] = "Do widzenia, 2R 2CZ M PI U PS PG RDP RPL";
        filmik[32] = "Dziękuję, M PG RD 2R 1CZ PS";
        filmik[33] = "Facebook, 2R 1CZ PG B RN";
        filmik[34] = "Fałszywy, 1CZ 1R PS B RK";
        filmik[35] = "Film, 2R 1CZ PS M WA RK";
        filmik[36] = "Fotelik, 1CZ 2R CM RT PS";
        filmik[37] = "Garaż, 2R 1CZ B O RDP PS";
        filmik[38] = "Gaśnica, 2R 2CZ M RD E RDP PS";
        filmik[39] = "Gdzie, 2R 1CZ 5 RN RPP RPL PS";
        filmik[40] = "Głośno, 2R 1CZ C RG PS RG";
        filmik[41] = "Głowa, 1R 1CZ PW PG";
        filmik[42] = "Godzina, 1R 1CZ U PS";
        filmik[43] = "Grudzień, 2R 1CZ PW PS ON";
        filmik[44] = "Haker, 2R 2CZ H RP 5 PS RPL";
        filmik[45] = "Hałas, 2R 1CZ I RG PS PG";
        filmik[46] = "Hamować, 2R 1CZ 5 PS RDP";
        filmik[47] = "Hasło, 1R 2CZ PS PG 1 C RPP";
        filmik[48] = "Holowanie, 2R 1CZ PW RPL PS";
        filmik[49] = "Imię, 1R 1CZ I ON";
        filmik[50] = "Internet, 2R 2CZ H";
        filmik[51] = "Interwencja, 2R 2CZ A PS PW RS RDR";
        filmik[52] = "Ja, 1R 1CZ PW PS";
        filmik[53] = "Jak, 1R 1CZ PS I ON";
        filmik[54] = "Jaki, 1R 1CZ PS I ON";
        filmik[55] = "Jechać, 1R 1CZ WA ON RDP RK";
        filmik[56] = "Jesień, 1R 1CZ 5 PS RD";
        filmik[57] = "Jest, 2R 1CZ 1 PI RDP RP PS";
        filmik[58] = "Jutro, 1R 1CZ PG 1 ON RDP";
        filmik[59] = "Kamera, 2R 1CZ M WA PS ON RK";
        filmik[60] = "Kara, 2R 1CZ K ON PS";
        filmik[61] = "Kiedy, 1R 1CZ K ON PS";
        filmik[62] = "Kierowca, 2R 1CZ PI ON PS";
        filmik[63] = "Kobieta, 1R 1CZ PG P";
        filmik[64] = "Kolega, 2R 2CZ PG PS PW PI";
        filmik[65] = "Koleżanko, 2R 2CZ PG PS P PI";
        filmik[66] = "Komputer, 2R 1CZ 5 RN PS DG";
        filmik[67] = "Komunikacja, 2R 1CZ N PS RP";
        filmik[68] = "Kto, 1R 1CZ K ON RP";
        filmik[69] = "Ktoś, 1R 1CZ K ON RP";
        filmik[70] = "Kwiecień, 1R 1CZ PW PG PS RDP";
        filmik[71] = "Lato, 1R 1CZ PG CH";
        filmik[72] = "Lekarz, 2R 1CZ PI PS H";
        filmik[73] = "Lipiec, 1R 1CZ PG 1 RD";
        filmik[74] = "Listopad, 2R 1CZ U RR RPL PS";
        filmik[75] = "Lubić, 2R 1CZ PS M RD";
        filmik[76] = "Luty, 2R 1CZ H RDP B PS";
        filmik[77] = "Maj, 1R 1CZ M J RPL";
        filmik[78] = "Małżeństwo, 2R 1CZ M RP ON";
        filmik[79] = "Mam, 1R 1CZ M PS RS";
        filmik[80] = "Mama, 1R 1CZ N PG";
        filmik[81] = "Marzec, 2R 1CZ M PS";
        filmik[82] = "Miasto, 2R 1CZ M ON PS";
        filmik[83] = "Miejsce, 2R 1CZ M RN RP PS";
        filmik[84] = "Można, 1R 1CZ 5 E RS PS";
        filmik[85] = "Mój, 1R 1CZ O RS PS";
        filmik[86] = "Mówić, 1R 1CZ 5 RN PG";
        filmik[87] = "Muzyka, 2R 1CZ PW RN RP";
        filmik[88] = "Na, 2R 1CZ M N PS";
        filmik[89] = "Napad, 2R 1CZ 3 RP PS";
        filmik[90] = "Napisać, 2R 1CZ M E RPL PRP PS";
        filmik[91] = "Nie, 1R 1CZ N E PS";
        filmik[92] = "Nie chcieć, 2R 1CZ M RD PS";
        filmik[93] = "Nie lubić, 1R 1CZ 5 PS RK";
        filmik[94] = "Nie wolno, 2R 1CZ PW PS RPP RPL";
        filmik[95] = "Niebezpieczny, 2R 1CZ C PS RK";
        filmik[96] = "Niedziela, 1R 1CZ N RPP PS";
        filmik[97] = "Numer, 2R 1CZ PI PW RP PS";
        filmik[98] = "Około, 1R 1CZ 5 ON PS";
        filmik[99] = "Okulary, 2R 1CZ O PG";

        int[][] tablica = new int[filmik.length * 100][tags.length];
        int[] suma = new int[tags.length];


        //stworzenie / dodawanie 0 i 1 do tablicy (a, b)
        int i;
        int wiersz = 0;
        for (i = 0; i < filmik.length; i++) {
            //System.out.print(i+" ");
            int j;
            for (j = 0; j < filmik.length; j++) {
                if (j > i) {
                    System.out.print("(" + i + ", " + j + ") =  ");
                    for (int e = 0; e < tags.length; e++) {
                        //System.out.print(e+" ");
                        System.out.print(znajdz(filmik[i], filmik[j], tags[e]) + "  ");
                        tablica[wiersz][e] = znajdz(filmik[i], filmik[j], tags[e]);
                        suma[e] += tablica[wiersz][e];
                    }
                    wiersz++;
                    //System.out.print(wiersz);
                    System.out.println();
                }
            }
        }
        
//        System.out.print("\n1 iter =  " + suma[0] + "  " + suma[1] + "  " + suma[2] + "  " + suma[3] + "  " + suma[4] + "  " + suma[5] + "  " + suma[6] + "  " + suma[7] + "  " + suma[8] + "\n");
        System.out.print("\n1 iter = ");
        for (int s = 0; s < tags.length; s++) {
            System.out.print(suma[s] + "  ");
        }
        System.out.println("\nWybrany "+(znajdzMax(suma)+1)+" kolumnę z największą liczbę " + suma[znajdzMax(suma)] + ", czyli najlepszy tag: " + tags[znajdzMax(suma)]);
        String aktualnyNajlepszytag = tags[znajdzMax(suma)];

        /* Metoda wykonania iterację */
        //System.out.println();
        int ilosc_iteracja = 0;
        while (ilosc_iteracja <= 100) {
            /* Usuwanie cały wiersz jeśli jest 1 w kolumnie */
            int n, m;
            for (int e = 0; e < wiersz; e++) {
                for (int f = 0; f < tags.length; f++) {
                    if (tablica[e][znajdzMax(suma)] == 1) {
                        for (f = 0; f < tags.length; f++) {
                            tablica[e][f] = 0;

                        }
                    }
                    //tablica[e][znajdzMax(suma)] = 0;
                }
            }
            /* Wyswietla tabelę po usuwaniu kolumnę 1 */
//        for (int e = 0; e < wiersz; e++) {
//            System.out.print("          ");
//            for (int f = 0; f < tags.length; f++) {
//                System.out.print(tablica[e][f] + "  ");
//                suma[f] = 0;
//            }
//            System.out.println();
//        }
            // Wyzeruje sumę po iteracji 
            for (int f = 0; f < tags.length; f++) {
                suma[f] = 0;
            }

            /* Sumuje wszystkie 1 po kazdym kolumnie */
            int w;
            for (w = 0; w < wiersz; w++) {
                for (int j = 0; j < tags.length; j++) {
                    suma[j] += tablica[w][j];
                }
            }
            ilosc_iteracja++;
            //System.out.println(znajdzMax(suma));
            if (znajdzMax(suma) == 0 && suma[0] == 0) {
                //System.out.print((ilosc_iteracja + 1) + " iter =  " + suma[0] + "  " + suma[1] + "  " + suma[2] + "  " + suma[3] + "  " + suma[4] + "  " + suma[5] + "  " + suma[6] + "  " + suma[7] + "  " + suma[8] + "\n");
                System.out.print((ilosc_iteracja + 1) + " iter =  ");
                for (int s = 0; s < tags.length; s++) {
                    System.out.print(suma[s] + "  ");
                }
                System.out.println("\nCzyli już wszystko 0 -> działanie zakończone. ");
                break;
            } else {
                String newNajlepszytag = tags[znajdzMax(suma)];
                aktualnyNajlepszytag = aktualnyNajlepszytag + " " + newNajlepszytag;

                //System.out.print((ilosc_iteracja + 1) + " iter =  " + suma[0] + "  " + suma[1] + "  " + suma[2] + "  " + suma[3] + "  " + suma[4] + "  " + suma[5] + "  " + suma[6] + "  " + suma[7] + "  " + suma[8] + "\n");
                System.out.print((ilosc_iteracja + 1) + " iter =  ");
                for (int s = 0; s < tags.length; s++) {
                    System.out.print(suma[s] + "  ");
                }
                System.out.println();
                System.out.println("Wybrany "+(znajdzMax(suma)+1)+" kolumnę z największą liczbę " + suma[znajdzMax(suma)] + ", czyli najlepszy tag: " + tags[znajdzMax(suma)]);
            }
        }
        System.out.println("\nNajlepsze tagi są to (po kolei): " + aktualnyNajlepszytag);

        //Po skończeniu działania, po wybieraniu najlepsze tagi - szukamy słowa które maja właśnie te tagi.
        System.out.print("\nWg pierwsze i drugie najlepsze tagi, są to: ");
        for (int x = 0; x < filmik.length; x++) {
            String znajdowanieSlowa = znajdzWord(filmik[x], aktualnyNajlepszytag);
            if(znajdowanieSlowa == null){
                //continue;
            }else{
                System.out.print(znajdowanieSlowa + "  ");
            }
        }
        System.out.println();
    }
}
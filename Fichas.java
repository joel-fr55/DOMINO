//clase para sellecionar las fichas
public class Fichas {
    // las variables para sellecioar
    public int Fi1, Fi2, Fi3, Fi4, Fi5, Fi6, Fi7, Fi8, Fi9, Fi10, Fi11, Fi12, Fi13, Fi14;
    public int Fi15, Fi16, Fi17, Fi18, Fi19, Fi20, Fi21, Fi22, Fi23, Fi24, Fi25, Fi26, Fi27, Fi28;

    // variables para coger las manos de las fichas
    public String mano1, mano2, mano3, mano4, mano5, mano6, mano7;
    public String mano8, mano9, mano10, mano11, mano12, mano13, mano14;
    public String mano15, mano16, mano17, mano18, mano19, mano20, mano21;
    public String mano22, mano23, mano24, mano25, mano26, mano27, mano28;

    // nombrar los 26 equipos
    String[] fichas = new String[28];

    // SELECCIONAR LAS 28 FICHAS
    public void sellecionar() {
        Fi1 = (int) (Math.random() * 28) + 1;
        do {
            Fi2 = (int) (Math.random() * 28) + 1;
        } while (Fi2 == Fi1);
        do {
            Fi3 = (int) (Math.random() * 28) + 1;
        } while (Fi3 == Fi1 || Fi3 == Fi2);
        do {
            Fi4 = (int) (Math.random() * 28) + 1;
        } while (Fi4 == Fi1 || Fi4 == Fi2 || Fi4 == Fi3);
        do {
            Fi5 = (int) (Math.random() * 28) + 1;
        } while (Fi5 == Fi1 || Fi5 == Fi2 || Fi5 == Fi3 || Fi5 == Fi4);
        do {
            Fi6 = (int) (Math.random() * 28) + 1;
        } while (Fi6 == Fi1 || Fi6 == Fi2 || Fi6 == Fi3 || Fi6 == Fi4 || Fi6 == Fi5);
        do {
            Fi7 = (int) (Math.random() * 28) + 1;
        } while (Fi7 == Fi1 || Fi7 == Fi2 || Fi7 == Fi3 || Fi7 == Fi4 || Fi7 == Fi5 || Fi7 == Fi6);

        do {
            Fi8 = (int) (Math.random() * 28) + 1;
        } while (Fi8 == Fi1 || Fi8 == Fi2 || Fi8 == Fi3 || Fi8 == Fi4 || Fi8 == Fi5 || Fi8 == Fi6 || Fi8 == Fi7);
        do {
            Fi9 = (int) (Math.random() * 28) + 1;
        } while (Fi9 == Fi1 || Fi9 == Fi2 || Fi9 == Fi3 || Fi9 == Fi4 || Fi9 == Fi5 || Fi9 == Fi6 || Fi9 == Fi7
                || Fi9 == Fi8);
        do {
            Fi10 = (int) (Math.random() * 28) + 1;
        } while (Fi10 == Fi1 || Fi10 == Fi2 || Fi10 == Fi3 || Fi10 == Fi4 || Fi10 == Fi5 || Fi10 == Fi6 || Fi10 == Fi7
                || Fi10 == Fi8 || Fi10 == Fi9);
        do {
            Fi11 = (int) (Math.random() * 28) + 1;
        } while (Fi11 == Fi1 || Fi11 == Fi2 || Fi11 == Fi3 || Fi11 == Fi4 || Fi11 == Fi5 || Fi11 == Fi6 || Fi11 == Fi7
                || Fi11 == Fi8 || Fi11 == Fi9 || Fi11 == Fi10);
        do {
            Fi12 = (int) (Math.random() * 28) + 1;
        } while (Fi12 == Fi1 || Fi12 == Fi2 || Fi12 == Fi3 || Fi12 == Fi4 || Fi12 == Fi5 || Fi12 == Fi6 || Fi12 == Fi7
                || Fi12 == Fi8 || Fi12 == Fi9 || Fi12 == Fi10 || Fi12 == Fi11);
        do {
            Fi13 = (int) (Math.random() * 28) + 1;
        } while (Fi13 == Fi1 || Fi13 == Fi2 || Fi13 == Fi3 || Fi13 == Fi4 || Fi13 == Fi5 || Fi13 == Fi6 || Fi13 == Fi7
                || Fi13 == Fi8 || Fi13 == Fi9 || Fi13 == Fi10 || Fi13 == Fi11 || Fi13 == Fi12);
        do {
            Fi14 = (int) (Math.random() * 28) + 1;
        } while (Fi14 == Fi1 || Fi14 == Fi2 || Fi14 == Fi3 || Fi14 == Fi4 || Fi14 == Fi5 || Fi14 == Fi6 || Fi14 == Fi7
                || Fi14 == Fi8 || Fi14 == Fi9 || Fi14 == Fi10 || Fi14 == Fi11 || Fi14 == Fi12 || Fi14 == Fi13);

        do {
            Fi15 = (int) (Math.random() * 28) + 1;
        } while (Fi15 == Fi1 || Fi15 == Fi2 || Fi15 == Fi3 || Fi15 == Fi4 || Fi15 == Fi5 || Fi15 == Fi6 || Fi15 == Fi7
                || Fi15 == Fi8 || Fi15 == Fi9 || Fi15 == Fi10 || Fi15 == Fi11 || Fi15 == Fi12 || Fi15 == Fi13
                || Fi15 == Fi14);
        do {
            Fi16 = (int) (Math.random() * 28) + 1;
        } while (Fi16 == Fi1 || Fi16 == Fi2 || Fi16 == Fi3 || Fi16 == Fi4 || Fi16 == Fi5 || Fi16 == Fi6 || Fi16 == Fi7
                || Fi16 == Fi8 || Fi16 == Fi9 || Fi16 == Fi10 || Fi16 == Fi11 || Fi16 == Fi12 || Fi16 == Fi13
                || Fi16 == Fi14 || Fi16 == Fi15);
        do {
            Fi17 = (int) (Math.random() * 28) + 1;
        } while (Fi17 == Fi1 || Fi17 == Fi2 || Fi17 == Fi3 || Fi17 == Fi4 || Fi17 == Fi5 || Fi17 == Fi6 || Fi17 == Fi7
                || Fi17 == Fi8 || Fi17 == Fi9 || Fi17 == Fi10 || Fi17 == Fi11 || Fi17 == Fi12 || Fi17 == Fi13
                || Fi17 == Fi14 || Fi17 == Fi15 || Fi17 == Fi16);
        do {
            Fi18 = (int) (Math.random() * 28) + 1;
        } while (Fi18 == Fi1 || Fi18 == Fi2 || Fi18 == Fi3 || Fi18 == Fi4 || Fi18 == Fi5 || Fi18 == Fi6 || Fi18 == Fi7
                || Fi18 == Fi8 || Fi18 == Fi9 || Fi18 == Fi10 || Fi18 == Fi11 || Fi18 == Fi12 || Fi18 == Fi13
                || Fi18 == Fi14 || Fi18 == Fi15 || Fi18 == Fi16 || Fi18 == Fi17);
        do {
            Fi19 = (int) (Math.random() * 28) + 1;
        } while (Fi19 == Fi1 || Fi19 == Fi2 || Fi19 == Fi3 || Fi19 == Fi4 || Fi19 == Fi5 || Fi19 == Fi6 || Fi19 == Fi7
                || Fi19 == Fi8 || Fi19 == Fi9 || Fi19 == Fi10 || Fi19 == Fi11 || Fi19 == Fi12 || Fi19 == Fi13
                || Fi19 == Fi14 || Fi19 == Fi15 || Fi19 == Fi16 || Fi19 == Fi17 || Fi19 == Fi18);
        do {
            Fi20 = (int) (Math.random() * 28) + 1;
        } while (Fi20 == Fi1 || Fi20 == Fi2 || Fi20 == Fi3 || Fi20 == Fi4 || Fi20 == Fi5 || Fi20 == Fi6 || Fi20 == Fi7
                || Fi20 == Fi8 || Fi20 == Fi9 || Fi20 == Fi10 || Fi20 == Fi11 || Fi20 == Fi12 || Fi20 == Fi13
                || Fi20 == Fi14 || Fi20 == Fi15 || Fi20 == Fi16 || Fi20 == Fi17 || Fi20 == Fi18 || Fi20 == Fi19);
        do {
            Fi21 = (int) (Math.random() * 28) + 1;
        } while (Fi21 == Fi1 || Fi21 == Fi2 || Fi21 == Fi3 || Fi21 == Fi4 || Fi21 == Fi5 || Fi21 == Fi6 || Fi21 == Fi7
                || Fi21 == Fi8 || Fi21 == Fi9 || Fi21 == Fi10 || Fi21 == Fi11 || Fi21 == Fi12 || Fi21 == Fi13
                || Fi21 == Fi14 || Fi21 == Fi15 || Fi21 == Fi16 || Fi21 == Fi17 || Fi21 == Fi18 || Fi21 == Fi19
                || Fi21 == Fi20);

        do {
            Fi22 = (int) (Math.random() * 28) + 1;
        } while (Fi22 == Fi1 || Fi22 == Fi2 || Fi22 == Fi3 || Fi22 == Fi4 || Fi22 == Fi5 || Fi22 == Fi6 || Fi22 == Fi7
                || Fi22 == Fi8 || Fi22 == Fi9 || Fi22 == Fi10 || Fi22 == Fi11 || Fi22 == Fi12 || Fi22 == Fi13
                || Fi22 == Fi14 || Fi22 == Fi15 || Fi22 == Fi16 || Fi22 == Fi17 || Fi22 == Fi18 || Fi22 == Fi19
                || Fi22 == Fi20 || Fi22 == Fi21);
        do {
            Fi23 = (int) (Math.random() * 28) + 1;
        } while (Fi23 == Fi1 || Fi23 == Fi2 || Fi23 == Fi3 || Fi23 == Fi4 || Fi23 == Fi5 || Fi23 == Fi6 || Fi23 == Fi7
                || Fi23 == Fi8 || Fi23 == Fi9 || Fi23 == Fi10 || Fi23 == Fi11 || Fi23 == Fi12 || Fi23 == Fi13
                || Fi23 == Fi14 || Fi23 == Fi15 || Fi23 == Fi16 || Fi23 == Fi17 || Fi23 == Fi18 || Fi23 == Fi19
                || Fi23 == Fi20 || Fi23 == Fi21 || Fi23 == Fi22);
        do {
            Fi24 = (int) (Math.random() * 28) + 1;
        } while (Fi24 == Fi1 || Fi24 == Fi2 || Fi24 == Fi3 || Fi24 == Fi4 || Fi24 == Fi5 || Fi24 == Fi6 || Fi24 == Fi7
                || Fi24 == Fi8 || Fi24 == Fi9 || Fi24 == Fi10 || Fi24 == Fi11 || Fi24 == Fi12 || Fi24 == Fi13
                || Fi24 == Fi14 || Fi24 == Fi15 || Fi24 == Fi16 || Fi24 == Fi17 || Fi24 == Fi18 || Fi24 == Fi19
                || Fi24 == Fi20 || Fi24 == Fi21 || Fi24 == Fi22 || Fi24 == Fi23);
        do {
            Fi25 = (int) (Math.random() * 28) + 1;
        } while (Fi25 == Fi1 || Fi25 == Fi2 || Fi25 == Fi3 || Fi25 == Fi4 || Fi25 == Fi5 || Fi25 == Fi6 || Fi25 == Fi7
                || Fi25 == Fi8 || Fi25 == Fi9 || Fi25 == Fi10 || Fi25 == Fi11 || Fi25 == Fi12 || Fi25 == Fi13
                || Fi25 == Fi14 || Fi25 == Fi15 || Fi25 == Fi16 || Fi25 == Fi17 || Fi25 == Fi18 || Fi25 == Fi19
                || Fi25 == Fi20 || Fi25 == Fi21 || Fi25 == Fi22 || Fi25 == Fi23 || Fi25 == Fi24);
        do {
            Fi26 = (int) (Math.random() * 28) + 1;
        } while (Fi26 == Fi1 || Fi26 == Fi2 || Fi26 == Fi3 || Fi26 == Fi4 || Fi26 == Fi5 || Fi26 == Fi6 || Fi26 == Fi7
                || Fi26 == Fi8 || Fi26 == Fi9 || Fi26 == Fi10 || Fi26 == Fi11 || Fi26 == Fi12 || Fi26 == Fi13
                || Fi26 == Fi14 || Fi26 == Fi15 || Fi26 == Fi16 || Fi26 == Fi17 || Fi26 == Fi18 || Fi26 == Fi19
                || Fi26 == Fi20 || Fi26 == Fi21 || Fi26 == Fi22 || Fi26 == Fi23 || Fi26 == Fi24 || Fi26 == Fi25);
        do {
            Fi27 = (int) (Math.random() * 28) + 1;
        } while (Fi27 == Fi1 || Fi27 == Fi2 || Fi27 == Fi3 || Fi27 == Fi4 || Fi27 == Fi5 || Fi27 == Fi6 || Fi27 == Fi7
                || Fi27 == Fi8 || Fi27 == Fi9 || Fi27 == Fi10 || Fi27 == Fi11 || Fi27 == Fi12 || Fi27 == Fi13
                || Fi27 == Fi14 || Fi27 == Fi15 || Fi27 == Fi16 || Fi27 == Fi17 || Fi27 == Fi18 || Fi27 == Fi19
                || Fi27 == Fi20 || Fi27 == Fi21 || Fi27 == Fi22 || Fi27 == Fi23 || Fi27 == Fi24 || Fi27 == Fi25
                || Fi27 == Fi26);
        do {
            Fi28 = (int) (Math.random() * 28) + 1;
        } while (Fi28 == Fi1 || Fi28 == Fi2 || Fi28 == Fi3 || Fi28 == Fi4 || Fi28 == Fi5 || Fi28 == Fi6 || Fi28 == Fi7
                || Fi28 == Fi8 || Fi28 == Fi9 || Fi28 == Fi10 || Fi28 == Fi11 || Fi28 == Fi12 || Fi28 == Fi13
                || Fi28 == Fi14 || Fi28 == Fi15 || Fi28 == Fi16 || Fi28 == Fi17 || Fi28 == Fi18 || Fi28 == Fi19
                || Fi28 == Fi20 || Fi28 == Fi21 || Fi28 == Fi22 || Fi28 == Fi23 || Fi28 == Fi24 || Fi28 == Fi25
                || Fi28 == Fi26 || Fi22 == Fi27);

    }

    // METODOS PARA NOMBRAR LAS FICHAS
    public void Nombrar() {
        fichas[0] = "imagen/Ficha1.png";
        fichas[1] = "imagen/Ficha2.png";
        fichas[2] = "imagen/Ficha3.png";
        fichas[3] = "imagen/Ficha4.png";
        fichas[4] = "imagen/Ficha5.png";
        fichas[5] = "imagen/Ficha6.png";
        fichas[6] = "imagen/Ficha7.png";

        fichas[7] = "imagen/Ficha8.png";
        fichas[8] = "imagen/Ficha9.png";
        fichas[9] = "imagen/Ficha10.png";
        fichas[10] = "imagen/Ficha11.png";
        fichas[11] = "imagen/Ficha12.png";
        fichas[12] = "imagen/Ficha13.png";
        fichas[13] = "imagen/Ficha14.png";

        fichas[14] = "imagen/Ficha15.png";
        fichas[15] = "imagen/Ficha16.png";
        fichas[16] = "imagen/Ficha17.png";
        fichas[17] = "imagen/Ficha18.png";
        fichas[18] = "imagen/Ficha19.png";
        fichas[19] = "imagen/Ficha20.png";
        fichas[20] = "imagen/Ficha21.png";

        fichas[21] = "imagen/Ficha22.png";
        fichas[22] = "imagen/Ficha23.png";
        fichas[23] = "imagen/Ficha24.png";
        fichas[24] = "imagen/Ficha25.png";
        fichas[25] = "imagen/Ficha26.png";
        fichas[26] = "imagen/Ficha27.png";
        fichas[27] = "imagen/Ficha28.png";
    }

    public void Repartir() {
        Fi1 = Fi1 - 1;
        mano1 = fichas[Fi1];
        Fi2 = Fi2 - 1;
        mano2 = fichas[Fi2];
        Fi3 = Fi3 - 1;
        mano3 = fichas[Fi3];
        Fi4 = Fi4 - 1;
        mano4 = fichas[Fi4];
        Fi5 = Fi5 - 1;
        mano5 = fichas[Fi5];
        Fi6 = Fi6 - 1;
        mano6 = fichas[Fi6];
        Fi7 = Fi7 - 1;
        mano7 = fichas[Fi7];

        Fi8 = Fi8 - 1;
        mano8 = fichas[Fi8];
        Fi9 = Fi9 - 1;
        mano9 = fichas[Fi9];
        Fi10 = Fi10 - 1;
        mano10 = fichas[Fi10];
        Fi11 = Fi11 - 1;
        mano11 = fichas[Fi11];
        Fi12 = Fi12 - 1;
        mano12 = fichas[Fi12];
        Fi13 = Fi13 - 1;
        mano13 = fichas[Fi13];
        Fi14 = Fi14 - 1;
        mano14 = fichas[Fi14];
    }

    public void MOSTRAR() {
        sellecionar();
        Nombrar();
        Repartir();
        System.out.println("\t\t\t\t BIENVENIDO");
        System.out.println("fichas 1:" + mano1);
        System.out.println("fichas 2:" + mano2);
        System.out.println("fichas 3:" + mano3);
        System.out.println("fichas 4:" + mano4);
        System.out.println("fichas 5:" + mano5);
        System.out.println("fichas 6:" + mano6);
        System.out.println("fichas 7:" + mano7);

        System.out.println("\nfichas 8:" + mano8);
        System.out.println("fichas 9:" + mano9);
        System.out.println("fichas 10:" + mano10);
        System.out.println("fichas 11:" + mano11);
        System.out.println("fichas 12:" + mano12);
        System.out.println("fichas 13:" + mano13);
        System.out.println("fichas 14:" + mano14);
    }

    public static void main(String args[]) {
        Fichas lasFichas = new Fichas();
        lasFichas.MOSTRAR();

    }

}
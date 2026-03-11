public class OOPSBannerUC6 {

    static String[] createO() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    static String[] createP() {
        return new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    static String[] createS() {
        return new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        String[] O = createO();
        String[] P = createP();
        String[] S = createS();

        for(int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + " " + P[i] + "  " + S[i] );
        }
    }
}
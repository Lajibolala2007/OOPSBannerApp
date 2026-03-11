public class OOPSBannerUC5 {
    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", "    *   ", "    *   ", "   ****    ", "    ***  "),
            String.join(" ", "  *   * ", "  *   * ", "   *     * ", "  **      "),
            String.join(" ", "  *   * ", "  *    * ", "  *     * ", "   **      "),
            String.join(" ", "  *   * ", "  *    * ", "  **  *"   , "      **   "),
            String.join(" ", "  *   * ", "  *    * ", "  *       ", "       **  "),
            String.join(" ", "   *  *  ", "  *   * ", "  *       ", " **    **  "),
            String.join(" ", "    *    ", "    *    ", " *       ", "    **    ")
        };
        

        for(int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }

    }
}
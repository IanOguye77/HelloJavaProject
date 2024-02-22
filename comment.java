public class comment {
    public static void main(String[] args){
        /* Comment in Java
        *  We have three types of comments in java
        * 1 -> C++ Style comments -> //
        * 2 -> C style comments
        * 3 -> Special javadoc comments */

        // 1. C++ comment style
        System.out.println("1. We use // for C++ comment style");

        /* 2. C comment style */
        System.out.println("2. We use /**/ for C comment style");

        /**
         * 3. Special javadoc comment
         */


        System.out.println("3. We use /** */ for javadoc comment style");
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static int add(int x, int y){
        return (x + y);
    }
}

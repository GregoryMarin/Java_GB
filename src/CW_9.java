//public class CW_9 {
//    public static void main(String[] args) {
//        System.out.println();
//    }
    public class CW_9 {
        public static void main(String[] args) {
            String ip = "188.333";
            String[] ipe = ip.split("\\.");
            System.out.println(ipe[0]);
            int q = Integer.parseInt(ipe[0]);
            System.out.println(q + 10);
        }
    }
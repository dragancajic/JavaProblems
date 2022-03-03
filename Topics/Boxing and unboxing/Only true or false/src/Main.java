class Primitive {
    public static boolean toPrimitive(Boolean b) {
        //return b == null || b.equals(false) ? false : true;
        return b != null && !b.equals(false);
    }
    
    public static void main(String[] args) {
        System.out.println(toPrimitive(true));
        System.out.println(toPrimitive(false));
        System.out.println(toPrimitive(null));
    }
}
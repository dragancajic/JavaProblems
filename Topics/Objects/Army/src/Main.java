class Army {

    public static void createArmy() {
        // Create all objects here
        for (int i = 1; i <= 5; i++) {
            //String name = "unit";
            //name += i;
            //System.out.println(name);
            //Object unitObject = name;
            //unitObject = new Unit("unit" + i);
            new Unit("unit" + i);
        }
    
        for (int i = 1; i <= 3; i++) {
            //String name = "knight";
            //name += i;
            //System.out.println(name);
            //Object knightObject = name;
            //knightObject = new Knight("knight" + i);
            new Knight("knight" + i);
        }
        
        //General general = new General("general");
        new General("general");
        //Doctor doctor = new Doctor("doctor");
        new Doctor("doctor");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}
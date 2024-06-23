public class Main {
    public static void main(String[] args) {

        for(int i = 1; i<= 5; i++){
            LPAStudent s = new LPAStudent(
                    switch (i){
                        case 1 -> "Cst4021";
                        case 2 -> "Cst5043";
                        case 3 -> "Cst6098";
                        case 4 -> "Cst6078";
                        default -> "None";
                    },
                    switch(i){
                case 1 -> "Monica";
                case 2 -> "Cobol";
                case 3 -> "Random";
                case 4 -> "Mariam";
                default -> "Nobody";
                    },
                    switch(i){
                        case 1-> "20/8/2001";
                        case 2-> "20/5/2001";
                        case 3-> "20/5/2000";
                        case 4-> "20/5/1999";
                        default -> "Error";
                    },
                    switch(i){

                case 1-> "Python";
                case 2-> " .Net";
                case 3-> "Network Design";
                case 4-> "Data Breaching";
                default -> "Null0";
                    });
            System.out.println(s);
        }
        Student pojoStudent = new Student("jh55859", "Ann","6/6/6","MasterClass");
        LPAStudent recordStudent = new LPAStudent("jh55859", "Ann","6/6/6","MasterClass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName()+" is Taking"+
                pojoStudent.getClassList());
        System.out.println(recordStudent.Name()+" is taking "+
                recordStudent.classList());
    }

}
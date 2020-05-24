package loop;

public class HospitalApp {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        hospital.addPatient(new Patient("Adam","Els",123212L));
        hospital.addPatient(new Patient("Roman","Dos",123223L));
        hospital.addPatient(new Patient("Tedi","Nos",123421L));
        hospital.addPatient(new Patient("Cris","Kos",2131412L));
        hospital.addPatient(new Patient("Ada","Wos",453534L));

        hospital.addPatient(new Patient("Adam","Els",12312112L));
        hospital.addPatient(new Patient("Roman","Dos",123223L));
        hospital.addPatient(new Patient("Tedi","Nos",123421L));
        hospital.addPatient(new Patient("Cris","Kos",2131412L));
        hospital.addPatient(new Patient("Ada","Wos",453534L));


        hospital.showQueue();

    }

}

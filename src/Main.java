import javax.print.Doc;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        /*
        Doctor myDoctor = new Doctor();
        myDoctor.showName();
        myDoctor.showId();

        Doctor.id++;

        Doctor myDoctorAna = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);
        */
        //showMenu();
        Doctor myDoctor = new Doctor("Ana Maria", "Cardiologa");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }

}
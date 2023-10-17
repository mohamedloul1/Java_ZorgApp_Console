import java.util.Scanner;

public class Menus {
    MedicationController medicationController = new MedicationController();

    static final int patientsPage = 1;
    static final int medications = 2;
    static final int roles = 3;
    static final int exit = 4;


    public void mainMenu(){
        Scanner userInput = new Scanner(System.in);
        boolean test = true;
        do {
            try {
                System.out.println("\u001B[34mselecteer uw keuze om door te gaan\u001B[0m \n" +
                        "\n" +
                        "[\u001B[34m1\u001B[0m]Patiënten pagina \n" +
                        "[\u001B[34m2\u001B[0m]Medicijnen \n" +
                        "[\u001B[34m3\u001B[0m]Roles \n" +
                        "[\u001B[34m4\u001B[0m]Sluit het programma");
                int choice = Integer.parseInt(userInput.nextLine());
                switch (choice) {
                    case patientsPage:
                        this.patientMenu();
                        test = false;
                        break;
                    case medications:
                        this.medicationsMenu();
                        test = false;
                        break;
                    case roles:
                        break;
                    case exit:
                        this.programmaExit();
                        test = false;
                    default:
                        break;
                }
            }catch(NumberFormatException e){
                System.err.println("\u001B[31mOngeldige invoer. Voer een geldig getal in.\u001B[0m");
            }
        }while (test);
    }
    static final int viewMedications = 1;
    static final int addMedications = 2;
    static final int removeMedications = 3;
    static final int updateMedications = 4;
    static final int backToTheMainMenu = 5;


    public void medicationsMenu(){
        Scanner userInput = new Scanner(System.in);
        boolean test = true;
        while (test){
            try {
                System.out.println("\u001B[34mselecteer uw keuze om door te gaan\u001B[0m \n" +
                        "\n" +
                        "[\u001B[34m1\u001B[0m]Medicijnen bekijken \n" +
                        "[\u001B[34m2\u001B[0m]Medicijnen Toevoegen \n" +
                        "[\u001B[34m3\u001B[0m]Medicijnen Verwijderen \n" +
                        "[\u001B[34m4\u001B[0m]Medicijnen Bijwerken \n"+
                        "[\u001B[34m5\u001B[0m]Terug naar hoofdmenu");
                int choice = Integer.parseInt(userInput.nextLine());
                switch (choice) {
                    case viewMedications:
                        test = false;
                        medicationController.getAllMedicationsWithNames();
                        break;
                    case addMedications:
                        test = false;
                        medicationController.insertMedications();
                        break;
                    case removeMedications:
                        test = false;
                        medicationController.deleteMedications();
                        break;
                    case updateMedications:
                        test = false;
                        medicationController.updateMedication();
                        break;
                    case backToTheMainMenu:
                        test = false;
                        this.mainMenu();
                        break;
                    default:
                        break;
                }
            }catch(NumberFormatException e){
                System.err.println("\u001B[31mOngeldige invoer. Voer een geldig getal in.\u001B[0m");
            }
        }
    }

    static final int viewPatiënten = 1;
    static final int addPatiënten = 2;
    static final int removePatiënten = 3;
    static final int updatePatiënten = 4;
    static final int BackToTheMainMenu = 5;

    public void patientMenu(){
        PatientController patientController = new PatientController();

        Scanner userInput = new Scanner(System.in);
        boolean runner = true;
        while (runner){
            try {
                System.out.println("\u001B[34mselecteer uw keuze om door te gaan\u001B[0m \n" +
                        "\n" +
                        "[\u001B[34m1\u001B[0m]Patiënten bekijken \n" +
                        "[\u001B[34m2\u001B[0m]Patiënten Toevoegen \n" +
                        "[\u001B[34m3\u001B[0m]Patiënten Verwijderen \n" +
                        "[\u001B[34m4\u001B[0m]Patiënten Bijwerken \n" +
                        "[\u001B[34m5\u001B[0m]Terug naar hoofdmenu");
                int choice = Integer.parseInt(userInput.nextLine());
                switch (choice) {
                    case viewPatiënten:
                        patientController.retrievePatient();
                        runner = false;
                        break;
                    case addPatiënten:
                        runner = false;
                        patientController.insertPatient();
                        break;
                    case removePatiënten:
                        patientController.deletePatient();
                        runner = false;
                        break;
                    case updatePatiënten:
                        patientController.updatePatient();
                        runner = false;
                        break;
                    case BackToTheMainMenu:
                        runner = false;
                        this.mainMenu();
                        break;
                    default:
                        break;
                }
            }catch(NumberFormatException e){
                System.err.println("\u001B[31mOngeldige invoer. Voer een geldig getal in.\u001B[0m");
            }
        }
    }
    public void programmaExit() {
        System.out.println("\u001B[31mHet programma wordt 6 seconden uitgevoerd...\u001B[0m");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\u001B[31mHet programma is afgelopen.\u001B[0m");
    }

}

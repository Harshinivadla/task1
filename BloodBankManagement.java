import java.util.*;

class Donor {
    String d_name;
    String d_phoneNumber;
    String d_bloodGroup;

    public Donor(String d_name, String d_phoneNumber, String d_bloodGroup) {
        this.d_name = d_name;
        this.d_phoneNumber = d_phoneNumber;
        this.d_bloodGroup = d_bloodGroup;
    }
}

class Patient {
    String p_name;
    String p_bloodGroup;
    String priority;
    float unitsNeeded;

    public Patient(String p_name, String p_bloodGroup, String priority, float unitsNeeded) {
        this.p_name = p_name;
        this.p_bloodGroup = p_bloodGroup;
        this.priority = priority;
        this.unitsNeeded = unitsNeeded;
    }
}

class BloodBank {

    Map<String, Queue<Donor>> donors;
    Map<String, Integer> bloodBank;

    public BloodBank() {
        donors = new HashMap<>();
        bloodBank = new HashMap<>();
        bloodBank.put("A", 5);
        bloodBank.put("AB", 3);
        bloodBank.put("B", 1);
        bloodBank.put("O", 4);
    }

    public void addDonor(Donor donor) {
        donors.computeIfAbsent(donor.d_bloodGroup, k -> new LinkedList<>()).add(donor);
    }

    public void addPatient(Patient patient) {
        float unitsNeeded = patient.unitsNeeded;

        Queue<Donor> donorQueue = donors.get(patient.p_bloodGroup);
        if (donorQueue != null) {
            while (unitsNeeded > 0 && !donorQueue.isEmpty()) {
                Donor donor = donorQueue.poll();
                System.out.println(patient.p_name + " : " + donor.d_name);
                unitsNeeded--;
            }
        }

        if (unitsNeeded > 0) {
            int reserve = bloodBank.get(patient.p_bloodGroup);
            if (unitsNeeded <= reserve) {
                System.out.println(patient.p_name + " received " + unitsNeeded + " units from Blood Reserve.");
                bloodBank.put(patient.p_bloodGroup, reserve - (int) unitsNeeded);
            } else {
                System.out.println("Insufficient blood units available for Patient:" + patient.p_name);
            }
        }
    }
}

public class BloodBankManagement {
    public static void main(String[] args) {
        BloodBank bloodBank = new BloodBank();

        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.println("Enter count of donors to add: ");
            int input = inputScanner.nextInt();

            for (int i = 0; i < input; i++) {
                System.out.println("Enter donor name:");
                String name = inputScanner.next();

                System.out.println("Enter donor phone number: ");
                String phoneNumber = inputScanner.next();

                System.out.println("Enter donor blood group: ");
                String bloodGroup = inputScanner.next();

                bloodBank.addDonor(new Donor(name, phoneNumber, bloodGroup));
            }

            System.out.println("Enter count of patients to be added: ");
            int input2 = inputScanner.nextInt();
            for (int j = 0; j < input2; j++) {
                System.out.println("Enter patient name :");
                String p_name = inputScanner.next();

                System.out.println("Enter patient blood group:");
                String bloodGroup = inputScanner.next();

                System.out.println("Enter patient priority number: ");
                String priority = inputScanner.next();

                System.out.println("Enter units of blood needed: ");
                float unitsNeeded = inputScanner.nextFloat();

                bloodBank.addPatient(new Patient(p_name, bloodGroup, priority, unitsNeeded));
            }
        }
    }
}

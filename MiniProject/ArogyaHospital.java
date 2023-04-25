//The management system should have the following features: -
// Add a patient’s details to the system whenever there is a new patient admitted.
// The patient details should include his/her name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian's name, guardian’s address, guardian’s contact number. Assign a unique id to each patient admitted.
// Note: Validate user entered data. Such as
// Number of digits in age is 1 or 2 digits.
// Aadhar card number should contains 12 digits.
// Contact number should contain 10 digits only.
// The system can show the list of patients at any point of time. Basically, the system should be dynamic and a real time system. In other words, it can provide results at any point of time without any delays. Display proper error message if patients list is empty.
// Given the unique id assigned to a patient, provide all the details of that patient.
// In other words, the system should provide details about a patient using his/her unique id or name.
// The system can provide the list of all the patients from a particular city or a state. Also provide the list of patients belonging to a particular age group. For example, you can be asked to give the list of patients in the age group 50-60. Handle NullPointerException if user entered values are empty.
// Mark the patient recovered when he starts working fine.
// The system should be able to delete the information of a patient when asked to. Handle NullPointerException if user entered patient id is not present in list.
// Implement these features using efficient data structures, collections and OOP concepts learnt in the Java Foundation course. Write clean and organized codes using proper objects and methods.
import java.util.*;

class Patient {
    private String name;
    private int age;
    private String gender;
    private long aadharNumber;
    private long contactNumber;
    private String city;
    private String address;
    private String dateOfAdmission;
    private String guardianName;
    private String guardianAddress;
    private long guardianContactNumber;
    private int id;
    private boolean recovered;
  Patient(String name, String gender, String city, String address, int age, long aadharNumber, long contactNumber,String guardianName, String guardianAddress, long guardianContactNumber, int id) {
    this.name = name;
    this.gender = gender;
    this.city = city;
    this.address = address;
    this.age = age;
    this.aadharNumber = aadharNumber;
    this.contactNumber = contactNumber;
    this.guardianName = guardianName;
    this.guardianAddress = guardianAddress;
    this.guardianContactNumber = guardianContactNumber;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public long getAadharNumber() {
    return aadharNumber;
  }

  public void setAadharNumber(long aadharNumber) {
    this.aadharNumber = aadharNumber;
  }

  public long getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(long contactNumber) {
    this.contactNumber = contactNumber;
  }

  public String getGuardianName() {
    return guardianName;
  }

  public void setGuardianName(String guardianName) {
    this.guardianName = guardianName;
  }

  public String getGuardianAddress() {
    return guardianAddress;
  }

  public void setGuardianAddress(String guardianAddress) {
    this.guardianAddress = guardianAddress;
  }

  public long getGuardianContactNumber() {
    return guardianContactNumber;
  }

  public void setGuardianContactNumber(long guardianContactNumber) {
    this.guardianContactNumber = guardianContactNumber;
  }

  public int getId() {
    return id;
  }
  boolean isRecovered() {
    return recovered;
  }
  public void setRecovered(boolean recovered) {
  this.recovered = recovered;
  }
  
}

 class PatientManagementSystem {
  Scanner sc = new Scanner(System.in);
  ArrayList<Patient> patients = new ArrayList<Patient>();
  public void addPatient() {
    Random rand = new Random();
    System.out.println("Enter the patient name:");
    String patientName = sc.next();
    System.out.println("Enter the gender ");
    String gender = sc.next();
      System.out.println("Enter age");
      int age = sc.nextInt();
    System.out.println("Enter address");
    String address = sc.next();
    System.out.println("enter City");
    String city = sc.next();
    System.out.println("Enter Aadhaar number");
    long aadharNum = sc.nextLong();
    if (Long.toString(aadharNum).length() != 12) {
      System.out.println("Aadhar card number should contains 12 digits. ");
    }
    System.out.println("Enter the phone number");
    long phoneNum = sc.nextLong();
    if (Long.toString(phoneNum).length() != 10) {
      System.out.println("Contact number should contain 10 digits only.  ");
    }
    System.out.println("Enter guardian name");
    String guardianName = sc.next();
    System.out.println("Enter Guardian address ");
    String gAddress = sc.next();
    System.out.println("Enter guardian Phone number");
    long gContact = sc.nextLong();
    if (Long.toString(gContact).length() != 10) {
      System.out.println("Contact number should contain 10 digits only.  ");
    }

    if (Integer.toString(age).length() == 2 && Long.toString(aadharNum).length()
    == 12
    && Long.toString(phoneNum).length() == 10) {
    patients.add(new Patient(patientName, gender, city, address, age, aadharNum, phoneNum, guardianName, gAddress,
        gContact, Math.abs(rand.nextInt())));
    System.out.println("Patient added successfully!!");
    } else {
    System.out.println("Please Enter correct details");
    }
  }

  public void viewPatientsList() {
    if (patients.size() == 0) {
      System.out.println("Currently there is no patients here");
      System.out.println("----------------------------");
    }
    System.out.println("Patients details");
    int i = 1;
    for (Patient p : patients) {
      System.out.println("Patient " + i + " Details :");
      System.out.println("Name of the patient : " + p.getName());
      System.out.println("Patient Gender      : " + p.getGender());
      System.out.println("Patient Age         : " + p.getAge());
      System.out.println("Patient Id          : " + p.getId());
      System.out.println("-----------------------------------");
      System.out.println();
      i++;
    }
  }

public void searchById() {
    System.out.println("Enter patient ID to get information of the patient");
    int id = sc.nextInt();
    boolean found = false;
    for (Patient p : patients) {
      if (p.getId() == id) {
        System.out.println("These are the details we found by the information given by you :");
        System.out.println("Name of the patient : " + p.getName());
        System.out.println("Patient Gender      : " + p.getGender());
        System.out.println("Patient Age         : " + p.getAge());
        System.out.println("Patient Address     : " + p.getAddress());
        System.out.println("Patient City        : " + p.getCity());
        System.out.println("Patient AadhaarNumber: " + p.getAadharNumber());
        System.out.println("Patient Phone Number : " + p.getContactNumber());
        System.out.println("Patient Guardian Name :" + p.getGuardianName());
        System.out.println("Patient Guardian Address : " + p.getGuardianAddress());
        System.out.println("Patient Guardian Contact Number :" + p.getGuardianContactNumber());
        System.out.println("--------------------------------------");
        System.out.println();
        found = true;
        break;
      }
    }
    if (!found) {
        System.out.println("Sorry!There is no patient from this id ");
    }
}


 public void searchByCity() {
    System.out.println("Enter patient city name to get information of the patient");
    String cityName = sc.next();
    boolean foundPatient = false;
    for (Patient p : patients) {
        if (p.getCity().equalsIgnoreCase(cityName)) {
          System.out.println("These are the details we found by the information given by you:");
            System.out.println("Name of the patient         : " + p.getName());
            System.out.println("Patient Gender              : " + p.getGender());
            System.out.println("Patient Age                 : " + p.getAge());
            System.out.println("Patient Address             : " + p.getAddress());
            System.out.println("Patient ID                  : " + p.getId());
            System.out.println("Patient Aadhaar Number      : " + p.getAadharNumber());
            System.out.println("Patient Phone Number        : " + p.getContactNumber());
            System.out.println("Patient Guardian Name       : " + p.getGuardianName());
            System.out.println("Patient Guardian Address    : " + p.getGuardianAddress());
            System.out.println("Patient Guardian Contact No.: " + p.getGuardianContactNumber());
            System.out.println("--------------------------------------");
            System.out.println();
            foundPatient = true;
        }
    }
    if (!foundPatient) {
        System.out.println("Sorry! We are unable to find any patient from this city.");
    }
}


public void searchByAge() {
    System.out.println("Enter patients age to get information of the patient");
    int patientAge = sc.nextInt();
    boolean found = false;
    int count = 0;
    for (Patient p : patients) {
        if (p.getAge() == patientAge) {
            if (!found) {
                System.out.println("These are the details we found by the information given by you:");
                found = true;
            }
            count++;
            System.out.println("Name of the patient : " + p.getName());
            System.out.println("Patient Gender      : " + p.getGender());
            System.out.println("Patient Age         : " + p.getAge());
            System.out.println("Patient Id          : " + p.getId());
            System.out.println("Patient Address     : " + p.getAddress());
            System.out.println("Patient City        : " + p.getCity());
            System.out.println("Patient AadhaarNumber: " + p.getAadharNumber());
            System.out.println("Patient Phone Number : " + p.getContactNumber());
            System.out.println("Patient Guardian Name :" + p.getGuardianName());
            System.out.println("Patient Guardian Address : " + p.getGuardianAddress());
            System.out.println("Patient Guardian Contact Number :" + p.getGuardianContactNumber());
            System.out.println("--------------------------------------");
            System.out.println();
        }
    }
    if (!found) {
        System.out.println("Sorry! We are unable to find a person of this age.");
    } else {
        System.out.println("There are " + count + " patients from this age group.");
    }
}


  public void patientRecovery() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter patient ID: ");
    int recoverId = scanner.nextInt();
    for (Patient patient : patients) {
        if (patient.getId() == recoverId && !patient.isRecovered()) {
            patient.setRecovered(true);
            System.out.println("Patient with ID " + recoverId + " has been marked as recovered.");
            return;
        }
    }
    System.out.println("No patient found with ID " + recoverId + " or the patient has already recovered.");
}


  public void deletePatient() {
    System.out.println("Enter patient name to delete");
    String name = sc.next();
    for (Patient p : patients) {
      if (p.getName().equals(name)) {
        patients.remove(p);
        break;
      }
    }
    System.out.println("Remaining patients are :");
    for (Patient p : patients) {
      System.out.println(p.getName());
    }
  }
}

public class ArogyaHospital{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    PatientManagementSystem pms = new PatientManagementSystem();
    int choice;
    System.out.println("Enter the options you want to choose from below :");
    do {
    System.out.println(" 1 for adding a member");
    System.out.println(" 2 to view the list of members");
    System.out.println(" 3 to search member by its ID");
    System.out.println(" 4 to search member from its city");
    System.out.println(" 5 to search member from its age gap");
    System.out.println(" 6 Mark Patient as Recovered");
    System.out.println(" 7 to delete data of a member");
    System.out.println("  0 to exit");
    System.out.println("Enter choice");
    choice = sc.nextInt();
      switch (choice) {
        case 1: {
          pms.addPatient();
          break;
        }
        case 2: {
          pms.viewPatientsList();
          break;
        }
        case 3: {
          pms.searchById();
          break;
        }
        case 4: {
          pms.searchByCity();
        }
        case 5: {
          pms.searchByAge();
          break;
        }
        case 6: {
          pms.patientRecovery();
          break;
        }
          
        case 7: {
          pms.deletePatient();
          break;
        }
        case 0: {
          System.out.println("Danyavadagalu-Shukriya-Thank you");
          break;
        }
      }
    } while (choice != 0);
  }
}
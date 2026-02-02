import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Max grades: ");
        int maxGrades = input.nextInt();
        Archive<Integer> grades = new Archive<>(maxGrades);

        System.out.println("Max absences: ");
        int maxAbcences = input.nextInt();
        Archive<Integer> abcences = new Archive<>(maxAbcences);

        System.out.println("Max notes: ");
        int maxNotes = input.nextInt();
        Archive<String> notes = new Archive<>(maxNotes);


        do {
            System.out.println("MENU\n" +
                    "1] Modify grades\n" +
                    "2] Modify abcences\n" +
                    "3] Modify notes\n" +
                    "4] Exit\n");

            choice = input.nextInt();

            switch (choice){
                case 1:
                    boolean continua = true;

                    while (continua){
                        System.out.println("1] add grade\n" +
                                "2] get grade\n" +
                                "3] stamp grade table\n" +
                                "4] return to the menu");

                        int choice1 = input.nextInt();

                        switch (choice1){
                            case 1:
                                System.out.println("New grade: ");
                                Integer grade = input.nextInt();
                                try {
                                    grades.add(grade);
                                }catch (Exception e){
                                    System.err.println(e.getMessage());
                                }
                                break;

                            case 2:
                                System.out.println("Index: ");
                                int index = input.nextInt();
                                System.out.println(grades.getByIndex(index -1));
                                break;

                            case 3:
                                System.out.println(grades.toString());
                                break;

                            case 4:
                                continua = false;
                                break;
                        }
                    }
                    break;

                case 2:
                    boolean continua2 = true;

                    while (continua2){
                        System.out.println("1] add abcence\n" +
                                "2] get abcence\n" +
                                "3] stamp abcence table\n" +
                                "4] return to the menu");

                        int choice1 = input.nextInt();

                        switch (choice1){
                            case 1:
                                System.out.println("New abcence: ");
                                Integer abcence = input.nextInt();
                                try {
                                    abcences.add(abcence);
                                }catch (Exception e){
                                    System.err.println(e.getMessage());
                                }
                                break;

                            case 2:
                                System.out.println("Index: ");
                                int index = input.nextInt();
                                System.out.println(abcences.getByIndex(index -1));
                                break;

                            case 3:
                                System.out.println(abcences.toString());
                                break;

                            case 4:
                                continua2 = false;
                                break;
                        }
                    }
                    break;

                case 3:
                    boolean continua3 = true;

                    while (continua3){
                        System.out.println("1] add note\n" +
                                "2] get note\n" +
                                "3] stamp notes table\n" +
                                "4] return to the menu");

                        int choice1 = input.nextInt();

                        switch (choice1){
                            case 1:
                                System.out.println("New note: ");
                                String note = input.next();
                                try {
                                    notes.add(note);
                                }catch (Exception e){
                                    System.err.println(e.getMessage());
                                }
                                break;
                            case 2:
                                System.out.println("Index: ");
                                int index = input.nextInt();
                                System.out.println(notes.getByIndex(index -1));
                                break;
                            case 3:
                                System.out.println(notes.toString());
                                break;
                            case 4:
                                continua3 = false;
                                break;
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }while (choice != 4);
    }
}


package ArrayLabs;

import java.util.Scanner;

public class DNASwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a single DNA nucleotide:");
        char dnaSwitch = s.next().charAt(0);

        switch (Character.toUpperCase(dnaSwitch)) {
            case 'A':
                System.out.println("Adenine");
                break;
            case 'C':
                System.out.println("Cytosine");
                break;
            case 'G':
                System.out.println("Guanine");
                break;
            case 'T':
                System.out.println("Thymine");
                break;
            default:
                System.out.println("Unknown");
        }

        int i = 0;
        String result = "";
        while (i < 8) {
            System.out.println("Enter a single DNA nucleotide:");
            dnaSwitch = s.next().charAt(0);

            switch (Character.toUpperCase(dnaSwitch)) {
                case 'A':
                    result += "Adenine ";
                    break;
                case 'C':
                    result += "Cytosine ";
                    break;
                case 'G':
                    result += "Guanine ";
                    break;
                case 'T':
                    result += "Thymine ";
                    break;
                default:
                    result += "Unknown ";
            }
            i++;
        }
        System.out.println(result);
        s.close();
    }
}

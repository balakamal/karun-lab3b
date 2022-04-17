package ArrayLabs;

public class MyArrays {
    public static void main(String[] args) {
        String[] Bollywood = new String[5];
        Bollywood[0] = "Shah Rukh Khan";
        Bollywood[1] = "Amitabh Bachchan";
        Bollywood[2] = "Salman Khan";
        Bollywood[3] = "Deepika Padukone";

        System.out.println(Bollywood[0]);
        System.out.println(Bollywood[1]);
        System.out.println(Bollywood[2]);
        System.out.println(Bollywood[3]);

        for (int i = 0; i < Bollywood.length; i++) {
            System.out.println(Bollywood[i]);
        }

        Bollywood[4] = "Aishwarya Rai";

        for (int i = 0; i < Bollywood.length; i++) {
            if (Bollywood[i].compareTo("Amitabh Bachchan") == 0) {
                System.out.println(i + 1);
                break;
            }
        }

        for (int i = 0; i < Bollywood.length; i++) {
            for (int j = i + 1; j < Bollywood.length; j++) {

                if (Bollywood[i].compareTo(Bollywood[j]) > 0) {
                    String temp = Bollywood[i];
                    Bollywood[i] = Bollywood[j];
                    Bollywood[j] = temp;
                }
            }
        }

        for (int i = 0; i < Bollywood.length; i++) {
            System.out.println(Bollywood[i]);
        }

        int[] Ages = new int[5];
        Ages[0] = 24;
        Ages[1] = 23;
        Ages[2] = 50;
        Ages[3] = 11;
        Ages[4] = 35;

        for (int i = 0; i < Ages.length; i++) {
            System.out.println(Ages[i]);
        }

        for (int i = 0; i < Ages.length; i++) {
            for (int j = i + 1; j < Ages.length; j++) {
                if (Ages[i] > Ages[j]) {
                    int temp = Ages[i];
                    Ages[i] = Ages[j];
                    Ages[j] = temp;
                }
            }
        }

        for (int i = 0; i < Ages.length; i++) {
            System.out.println(Ages[i]);
        }
    }

}

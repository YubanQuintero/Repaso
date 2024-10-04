
public class Anagrama {

    public static void main(String[] args) {
        char[] palabra1 = {'M','O','R','A'};
        char[] palabra2 = {'R','O','M','A'};

        int contador = 0;
        int log_palabra1 = palabra1.length;
        int log_palabra2 = palabra2.length;

        for (int i=0; i<log_palabra1; i++) {
            for (int j = 0; j<log_palabra2; j++ ) {
                if (palabra1[i] == palabra2[j]) {
                    contador ++;
                    palabra2[j] = ' ';
                    break;
                }
            }
        }   
            if (contador == log_palabra1) {
                System.out.println("son anagramas");
                } else {System.out.println("no son");

                 }

    }

}
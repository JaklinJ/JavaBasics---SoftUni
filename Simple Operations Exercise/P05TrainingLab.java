import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* вътрешността си. Залата е разделена на две части – лява и дясна, с коридор приблизително по средата.
        В лявата и в дясната част има редици с бюра. В задната част на залата има голяма входна врата.
         предната част на залата има катедра с подиум за преподавателя. Едно работно място заема
         70 на 120 cm (маса с размер 70 на 40 cm + място за стол и преминаване с размер 70 на 80 cm).
         Коридорът е широк поне 100 cm. Изчислено е, че заради входната врата (която е с отвор 160 cm) се губи
         точно 1 работно място, а заради катедрата (която е с размер 160 на 120 cm) се губят точно 2 работни места.
         Напишете програма, която въвежда размери на учебната зала и изчислява броя работни места в нея
         при описаното разположение
         От конзолата се четат 2 числа, по едно на ред: w (дължина в метри) и h (широчина в метри).
         Ограничения: 3 ≤ h ≤ w ≤ 100.
         Да се отпечата на конзолата едно цяло число: броят места в учебната зала.
         */

        double w = Double.parseDouble(scanner.nextLine()) * 100; // в см
        double h = Double.parseDouble(scanner.nextLine()) * 100 ; // в см

        double hCorridor = h - 100;
        double deskOnRow = Math.floor(hCorridor/70);
        double deskOnLength = Math.floor(w/120);
        double allDesks = deskOnLength * deskOnRow - 3;
        System.out.printf("%.0f", allDesks);


    }
}
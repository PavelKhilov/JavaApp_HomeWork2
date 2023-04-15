package task2;

// 2. Дана строка json:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
public class Main {
    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        String a = json.substring(1);
        a = a.substring(0, a.length() - 1);
//        a = json.substring(1);
//        a = a.substring(0, a.length() - 1);
//        System.out.println(a);
        String[] splitA = a.split(", ");
        String b = null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < splitA.length; i++) {
            splitA[i] = splitA[i].substring(1);
            splitA[i] = splitA[i].substring(0, splitA[i].length() - 1);
//            System.out.println(splitA[i]);
            b = String.valueOf(builder.append(splitA[i]));
        }
//        System.out.println(b);

        String[] splitB = b.split(":");
        String c = null;
        StringBuilder builder1 = new StringBuilder();
        for (int i = 0; i < splitB.length; i++) {
            c = String.valueOf(builder1.append(splitB[i]));
        }
//        System.out.println(c);

        String[] splitC = c.split(",");
        String d = null;
        StringBuilder builder2 = new StringBuilder();
        for (int i = 0; i < splitC.length; i++) {
            d = String.valueOf(builder2.append(splitC[i]));
        }
//        System.out.println(d);

        String[] splitD = d.split("\"");
        String e = null;
        StringBuilder builder3 = new StringBuilder();
        for (int i = 0; i < splitD.length; i++) {
            e = String.valueOf(builder3.append(splitD[i]));
        }
        System.out.println(e);

        for (int i = 3; i < splitD.length; i += 12) {
//            System.out.println("Студент %s получил %s по предмету %s\n", splitD[i], splitD[i+4], splitD[i+8]);
            System.out.println("Студент " + splitD[i] + " получил " + splitD[i] + " по предмету " + splitD[i+8]);
        }
    }
}
/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */
package Grade;

public class GradingDemo {
    public static void main(String[] args) {
        Grading g = new Grading();
        String[] names = {"First Student",
                "Second Student",
                "Third Student",
                "Fourth Student",
                "Fifth Student"};
        g.setStudentNames(names);
        double[][] grades = {{90, 90, 95, 95},
                {85, 75, 89, 90},
                {50, 85, 47, 69},
                {0, 100, 100, 99},
                {55, 65, 74, 95}};

        boolean correctGrades = true;

        for (int i = 0; i < grades[i].length; i++) {
            for (int j = 0; j < grades[j].length; j++) {
                if (!g.validateScores(grades[i][j])) {
                    System.out.println("Wrong score. Please correct.");
                    correctGrades = false;
                    break;
                }
            }
            if(!correctGrades) break;
        }

        String studentName="FOURTH student";
        if (correctGrades) {
            if(g.calculateStudentScore(studentName)[1]!=-1) {
                g.setStudentsGrades(grades);

                double[] studentInfo = g.calculateStudentScore(studentName);
                char gradeLetter = g.getStudentsLetterGrade()[(int) studentInfo[2]];
                System.out.println("Student name: " + names[(int) studentInfo[0]]);
                System.out.println("Student average score: " + studentInfo[1]);
                System.out.println("Student score letter: " + gradeLetter);
            }else {
                System.out.println("Student Not found! ");
            }
        }else
            System.out.println("Gardens Should be corrected! ");
    }
}

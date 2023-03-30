/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */
package Grade;

public class Grading {

    private String[] studentNames = new String[5];
    private char[] studentsLetterGrade = {'A', 'B', 'C', 'D', 'F'};
    private double[][] studentsGrades = new double[5][4];

    //getters and setters
    public String[] getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }

    public char[] getStudentsLetterGrade() {
        return studentsLetterGrade;
    }

    public void setStudentsLetterGrade(char[] studentsLetterGrade) {
        this.studentsLetterGrade = studentsLetterGrade;
    }

    public double[][] getStudentsGrades() {
        return studentsGrades;
    }

    public void setStudentsGrades(double[][] studentsGrades) {
        this.studentsGrades = studentsGrades;
    }

    public double[] calculateStudentScore(String student) {
        int studentIndex = findStudent(student.toLowerCase());
        double[] info = {-1,-1,-1};
        if(studentIndex==-1) return info;
        double totalScore = 0;
        double avg;

        for (int i = 0; i < studentsGrades[studentIndex].length; i++) {
            totalScore += studentsGrades[studentIndex][i];
        }
        avg = totalScore / studentsGrades[studentIndex].length;

        info[0] = studentIndex;
        info[1] = avg;
        info[2] = findScoreLetter(avg);

        return info;
    }

    private int findStudent(String student) {

        for (int i = 0; i < studentNames.length; i++) {
            if (studentNames[i].toLowerCase().equals(student))
                return i;
        }
        return -1;
    }

    private int findScoreLetter(double score) {

        char grade = 'E';

        if(validateScores(score)) {
            if (score >= 90 && score <= 100)
                grade = 'A';
            else if (score >= 80 && score <= 89)
                grade = 'B';
            else if (score >= 70 && score <= 79)
                grade = 'C';
            else if (score >= 60 && score <= 69)
                grade = 'D';
            else if (score >= 0 && score <= 59)
                grade = 'F';


            for (int i = 0; i < studentsLetterGrade.length; i++) {
                if (grade == studentsLetterGrade[i])
                    return i;
            }
        }

        //return 0 if it's not in the grades range
        return -1;
    }

    public boolean validateScores(double score) {
        return score <= 100 && score >= 0;
    }
}

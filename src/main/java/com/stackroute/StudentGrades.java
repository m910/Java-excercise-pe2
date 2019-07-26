package com.stackroute;

public class StudentGrades {
    int max, min;
    float avg;

    @Override
    public String toString() {
        return "StudentGrades{" +
                "minimum=" + min +
                ", maximum=" + max +
                ", average=" + avg +
                '}';
    }

    public String checkingInvalidInput(int num, int[] grades) {

        int sum=0;
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] > 0 && grades[i] < 100)
                    //return "The grades is in range";

                sum = sum + grades[i];
            }

            avg = (float) (sum / num);
            for (int i = 0; i < grades.length - 1; i++) {
                if (grades[i] > grades[i + 1]) {
                    max = grades[i];
                } else {
                    min = grades[i];
                }
            }

                return toString();
    }


}

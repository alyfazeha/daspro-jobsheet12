import java.util.Scanner;

public class AssignmentNum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survey = new int[10][6];
        int respondent, question, answer;
        int totalAnswer[] = new int[10];
        int totalNum[] = new int[10];
        int averageAnswer[] = new int[10];
        int averageNum[] = new int[10];
        int averageAll;
        int totalAll=0;

        for (respondent=0; respondent<=9; respondent++){
            for (question=0; question<=5; question++){
                System.out.print("answer respondent " + (respondent+1) + " number " + (question+1) + " (1-5): ");
                answer = sc.nextInt();
                survey[respondent][question] = answer;
                totalAnswer[respondent] += survey[respondent][question];
            }
            System.out.println();
        }

        for (question=0; question<=5; question++){
            for (respondent=0; respondent<=9; respondent++){
                totalNum[question] += survey[respondent][question];
            }
        }

        for (respondent=0; respondent<survey.length; respondent++){
            for (question=0; question<survey[respondent].length; question++){
                System.out.print(survey[respondent][question] + "\t");
                averageAnswer[respondent] = totalAnswer[respondent]/survey[respondent].length;
            }
            System.out.println();
        }
        System.out.println();

        for (respondent=0; respondent<survey.length; respondent++){
            System.out.println("average value of respondent " + (respondent+1) + " is: " + averageAnswer[respondent]);   
        }
        System.out.println();

        for (question=0; question<survey[question].length; question++){
            averageNum[question] = totalNum[question]/survey.length;
            System.out.println("average value for question number " + (question+1) + " is: " + averageNum[question]);
        }
        System.out.println();

        for (respondent=0; respondent<survey.length; respondent++){
            totalAll += totalAnswer[respondent];
        }
        averageAll = totalAll/60;
        System.out.println("Overall average value is : " + averageAll);
    }
}

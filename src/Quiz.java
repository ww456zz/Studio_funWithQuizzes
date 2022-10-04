import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    private int score = 0;
    private Scanner input = new Scanner(System.in);

     void addQuestion (Question ques) {
         questions.add(ques);
    }

    private String getUserAnswers() {
         String userAnswer = input.nextLine();
         return userAnswer;
    }

    void runQuiz() {
        for (Question question:questions) {
            System.out.println(question.getQuestion());
            boolean questionCorrect = question.answerCheck(getUserAnswers());
            if (questionCorrect) {
                score++;
            }
        }
        double grade = ((double) score / (double) this.questions.size()) * 100;
        System.out.println("User's Grade: " + grade + "%");
    }
}

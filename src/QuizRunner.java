public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoice question1 = new MultipleChoice("What are the 1st 16 digits of pi? (please do NOT round the last digit)\nA: I don't know\nB: 3.141685793428657\nC: 3.141592653589793", "C");
        myQuiz.addQuestion(question1);

        Checkbox que2 = new Checkbox("Which animals are mammals? Select all that apply.\nA: Whales\nB: Koalas\nC: Humans\nD: Vaquitas", "A,C");
        myQuiz.addQuestion(que2);

        TrueFalse que3 = new TrueFalse("True or False: Vaquitas are porpoises.", "True");
        myQuiz.addQuestion(que3);

        MultipleChoice que4 = new MultipleChoice("How do you make cereal? \nA: Bowl,Cereal,Milk \nB: Bowl, Milk, Cereal. \nC: Milk, Cereal, Bowl", "c");
        myQuiz.addQuestion(que4);

        myQuiz.runQuiz();
    }
}

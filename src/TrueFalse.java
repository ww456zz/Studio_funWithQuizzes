public class TrueFalse extends Question {

    protected TrueFalse(String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public boolean answerCheck(String userAnswer) {
        if (userAnswer.toLowerCase().equals(this.getCorrectAnswer().toLowerCase())) {
            return true;
        }
        return false;
    }
}
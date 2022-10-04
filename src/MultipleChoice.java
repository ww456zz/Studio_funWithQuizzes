public class MultipleChoice extends Question{
    protected MultipleChoice(String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public boolean answerCheck(String userAnswer) {
        if (userAnswer.toLowerCase().equals(this.getCorrectAnswer().toLowerCase())) {
            return true;
        } return false;
    }
}

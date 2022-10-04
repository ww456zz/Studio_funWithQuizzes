public abstract class Question {

    private String question;
    private String correctAnswer;
    public abstract boolean answerCheck(String userAnswer);

    protected Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}


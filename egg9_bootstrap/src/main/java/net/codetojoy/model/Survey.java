package net.codetojoy.model;

public class Survey extends Scenario {
    private String answerA;
    private String answerB;

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" answerA: " + answerA);
        builder.append(" answerB: " + answerB);
        builder.append(" scenario: " + super.toString());
        return builder.toString();
    }

    // getters, setters

    public String getAnswerA() { return answerA; }
    public void setAnswerA(String answerA) { this.answerA = answerA; }

    public String getAnswerB() { return answerB; }
    public void setAnswerB(String answerB) { this.answerB = answerB; }
}

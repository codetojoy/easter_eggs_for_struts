package net.codetojoy.model;

public class Scenario {
    private Integer age;
    private Boolean fieldP;
    private Boolean fieldT;

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" age: " + age);
        builder.append(" fieldP: " + fieldP);
        builder.append(" fieldT: " + fieldT);
        return builder.toString();
    }

    // getters, setters

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

	public void setFieldP(boolean fieldP) { this.fieldP = fieldP; }
	public boolean isFieldP() { return fieldP; }

	public void setFieldT(boolean fieldT) { this.fieldT = fieldT; }
	public boolean isFieldT() { return fieldT; }
}

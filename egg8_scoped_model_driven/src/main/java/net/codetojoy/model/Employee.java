package net.codetojoy.model;

public class Employee {
    private String name;
    private Integer id;

    private String part1;
    private String part2;
    private String part3;

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(" id: " + id);
        builder.append(" name: " + name);
        builder.append(" part1: " + part1);
        builder.append(" part2: " + part2);
        builder.append(" part3: " + part3);

        return builder.toString();
    }

    // getters, setters

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

	public void setName(String name) { this.name = name; }
	public String getName() { return name; }

	public void setPart1(String part1) { this.part1 = part1; }
	public String getPart1() { return part1; }

	public void setPart2(String part2) { this.part2 = part2; }
	public String getPart2() { return part2; }

	public void setPart3(String part3) { this.part3 = part3; }
	public String getPart3() { return part3; }
}

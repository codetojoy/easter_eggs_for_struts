package net.codetojoy.model;

public class Employee {
    private Integer id;
    private String name;

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" id: " + id);
        builder.append(" name: " + name);
        return builder.toString();
    }

    // getters, setters

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
}

package cn.di.pojo;

public class District {
    private String id;
    private String name;

    public District(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "District{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

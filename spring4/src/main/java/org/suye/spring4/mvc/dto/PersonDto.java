package org.suye.spring4.mvc.dto;

/**
 * Created by suye on 2017/1/4.
 */
public class PersonDto {
    private Long id;
    private String name;

    public PersonDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public PersonDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

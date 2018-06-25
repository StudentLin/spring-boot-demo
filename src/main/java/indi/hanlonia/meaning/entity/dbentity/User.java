package indi.hanlonia.meaning.entity.dbentity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author by Hanlonia
 * @Email han.meaningful@gmail.com
 * @Date on 2018/6/9
 */

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

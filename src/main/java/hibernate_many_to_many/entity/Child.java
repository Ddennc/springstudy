package hibernate_many_to_many.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

@Entity
@Table(name = "children")
@NoArgsConstructor 
@Getter
@Setter
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private  String firstName;
    @Column(name = "age")
    private  int age;
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.MERGE})
    @JoinTable(name = "child_section",
            joinColumns = @JoinColumn(name = "child_id"),
            inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sections;

    public Child(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }
    public void  addSectionToChild(Section section){
        if(sections == null)
            sections = new ArrayList<>();
        
        sections.add(section);
    }

    @Override
    public String toString() {
        return "Child{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", sections=" + sections +
                '}';
    }
}

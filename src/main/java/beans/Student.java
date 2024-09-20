package beans;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Student")
public class Student extends Person {

    @Column(name = "Student_Course", nullable = true, length = 50)
    private String course;

    @Column(name = "Student_Fee", nullable = true, length = 40)
    private double fees;
}

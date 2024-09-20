package beans;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Employee")
public class Employee extends Person{

    @Column(name = "Employee_Job",nullable = true,length = 50)
    private String job;

    @Column(name = "Employee_Sal",nullable = true,length = 50 )
    private double sal;
}

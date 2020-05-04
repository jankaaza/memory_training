package kg.gamezone.memory_training.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "numbers")
public class Number extends BaseEntity {
    @Column(name = "first_number")
    public Integer firstNumber;
    @Column(name = "second_number")
    public Integer secondNumber;
    @Column(name= "third_number")
    public Integer thirdNumber;
    @Column(name =" fourth_number")
    public Integer fourthNumber;
}

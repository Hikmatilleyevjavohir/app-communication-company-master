package uz.pdp.appcommunicationcompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    private Company parentCompany;
    @ToString.Exclude
    @OrderBy(value = "city asc, street desc")
    @OneToOne(mappedBy = "company", cascade = CascadeType.ALL)
    private Address address;

}

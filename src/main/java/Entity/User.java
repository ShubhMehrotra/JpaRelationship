package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name="user_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_Id;
    private String user_Name;
    private String user_Email;



    @OneToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="user_Id",nullable = false)
    private List<Address> Address = new ArrayList<>();;




}

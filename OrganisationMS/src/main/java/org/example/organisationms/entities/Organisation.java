package org.example.organisationms.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.donationms.dto.Donation;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String description;
    private String address;
    private String date;


}

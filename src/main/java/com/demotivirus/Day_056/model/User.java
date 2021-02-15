package com.demotivirus.Day_056.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            })
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles = new ArrayList<>();

    public void addRole(Role role) {
        roles.add(role);
    }

    public Role getRole(Role role) {
        for (int i = 0; i < roles.size(); i++) {
            if (roles.get(i).equals(role))
                return role;
        }
        return null;
    }

    public void updateUserRole(Role role){
        if (roles.size() == 0)
            addRole(role);
        else {
//            for (int i = 0; i < roles.size(); i++) {
//                if (roles.get(i).equals(role)){
//                    roles.set(i, role);
//                    break;
//                }
//            }
            roles.set(0, role);
        }
    }
}

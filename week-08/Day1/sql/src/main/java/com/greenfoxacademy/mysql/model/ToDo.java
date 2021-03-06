package com.greenfoxacademy.mysql.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String title;
    private Boolean urgent=false;
    private Boolean done=false;

    @ManyToOne
    @JoinColumn(name = "assignee_id", nullable = false)
    private Assignee assignee;

    public ToDo( String title){
        this.title=title;
    }
}

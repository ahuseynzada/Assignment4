package edu.sjsu.cmpe275.lms.entity;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */
@Entity
public class BookComment {

    @Autowired
    @OneToMany(cascade = {CascadeType.ALL})
    public BookComment() {
    }


   
    public BookComment(String comment, String bookID) {
        this.comment = comment;
        this.bookID = bookID;
    }
}

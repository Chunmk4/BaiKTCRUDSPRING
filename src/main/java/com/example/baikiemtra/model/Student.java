package com.example.baikiemtra.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double theoryScore;
    private double practiceScore;
    private String descriptions;
    private String evaluation;
    private String class_id;

    public Student(int id, String name, double theoryScore, double practiceScore, String descriptions, String evaluation, String class_id) {
        this.id = id;
        this.name = name;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
        this.descriptions = descriptions;
        this.evaluation = evaluation;
        this.class_id = class_id;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(double theoryScore) {
        this.theoryScore = theoryScore;
    }

    public double getPracticeScore() {
        return practiceScore;
    }

    public void setPracticeScore(double practiceScore) {
        this.practiceScore = practiceScore;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryScore=" + theoryScore +
                ", practiceScore=" + practiceScore +
                ", descriptions='" + descriptions + '\'' +
                ", evaluation='" + evaluation + '\'' +
                ", class_id='" + class_id + '\'' +
                '}';
    }
}

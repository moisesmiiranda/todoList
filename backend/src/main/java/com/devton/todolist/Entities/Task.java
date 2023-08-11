package com.devton.todolist.Entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

/*Crie uma classe Java representando a entidade "Tarefa" com atributos como título, descrição, data de criação, data de conclusão, etc.
Anote a classe com as anotações do JPA para mapeamento do banco de dados. */
@Entity
@Table(name = "tb_task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Date createDate;

    private Date finishDate;


    public Task() {
    }


    public Task(Long id, String title, String description, Date createDate, Date finishDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createDate = createDate;
        this.finishDate = finishDate;
    }
     

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getFinishDate() {
        return this.finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Task task = (Task) object;
        return java.util.Objects.equals(id, task.id) && java.util.Objects.equals(title, task.title) && java.util.Objects.equals(description, task.description) && java.util.Objects.equals(createDate, task.createDate) && java.util.Objects.equals(finishDate, task.finishDate);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id, title, description, createDate, finishDate);
    }
}

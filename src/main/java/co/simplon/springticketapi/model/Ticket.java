package co.simplon.springticketapi.model;

import java.time.LocalDateTime;

public class Ticket {
    private Long id;
    private LocalDateTime date;
    private String description;
    private String firstname;
    private String lastname;
    private boolean open;
    private int idLearner;

    public Ticket(LocalDateTime localDateTime) {
        this.date = localDateTime;
    }

/*    public Ticket(Long id, LocalDateTime localDateTime) {
        this.id = id;
        this.date = localDateTime;
    }*/

    public Ticket(Long id, LocalDateTime localDateTime, String description, String firstname, String lastname, boolean open, int idLearner) {
        this.id = id;
        this.date = localDateTime;
        this.description = description;
        this.firstname = firstname;
        this.lastname = lastname;
        this.open = open;
        this.idLearner = idLearner;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public boolean isOpen() {
        return open;
    }

    public int getIdLearner() {
        return idLearner;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", open=" + open +
                ", idLearner=" + idLearner +
                '}';
    }
}

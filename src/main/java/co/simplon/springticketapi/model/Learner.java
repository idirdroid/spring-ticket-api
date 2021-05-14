package co.simplon.springticketapi.model;

public class Learner {
    private int idLearner;
    private String lastname;
    private String firstname;

    public Learner(int idLearner, String lastname, String firstname) {
        this.idLearner = idLearner;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public int getIdLearner() {
        return idLearner;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public String toString() {
        return "Learner{" +
                "id=" + idLearner +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}

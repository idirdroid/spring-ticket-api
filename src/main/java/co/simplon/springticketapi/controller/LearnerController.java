package co.simplon.springticketapi.controller;


import co.simplon.springticketapi.dao.LearnerDao;
import co.simplon.springticketapi.model.Learner;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/learner")
@CrossOrigin(origins = "*")

public class LearnerController {

    private final LearnerDao learnerDao;

    public LearnerController(LearnerDao learnerDao) {
        this.learnerDao = learnerDao;
    }

    @GetMapping
    public List<Learner> getAllLearners() {
        return learnerDao.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void insertLearner(@RequestBody Learner learner){
        System.out.println(learner.toString());
        learnerDao.save(learner);
    }
}

package co.simplon.springticketapi.controller;

import co.simplon.springticketapi.dao.PromotionDao;
import co.simplon.springticketapi.model.Promotion;
import co.simplon.springticketapi.model.Ticket;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/promotion")
@CrossOrigin(origins = "*")

public class PromotionController {

    private final PromotionDao promotionDao;


    public PromotionController(PromotionDao promotionDao) {
        this.promotionDao = promotionDao;
    }

    @GetMapping
    public List<Promotion> getAllPromotions() { return promotionDao.getAll();}

    @GetMapping("/{id}")
    public Promotion getPromotion(@PathVariable Long id) {

        return promotionDao.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void insertPromotion(@RequestBody Promotion promotion){
        System.out.println(promotion.toString());
        //Insertion en BDD
        promotionDao.save(promotion);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletePromotion(@RequestBody Long id){
        System.out.println("Suppression de la promotion n°"+ id);
        promotionDao.delete(id);
    }
}

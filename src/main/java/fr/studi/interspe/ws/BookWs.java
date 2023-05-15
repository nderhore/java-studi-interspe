package fr.studi.interspe.ws;


import fr.studi.interspe.pojo.Livre;
import fr.studi.interspe.pojo.Status;
import fr.studi.interspe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // -> bookWs va recevoir et envoyer du JSON
@RequestMapping(ApiRegistration.API_REST
        + ApiRegistration.BOOK) // -> localhost:8080/api/book
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class BookWs {

    @Autowired
    private BookService bookService;

    @GetMapping(ApiRegistration.STATUS + "{status}") // -> localhost:8080/api/book/status/DISPONIBLE
    public List<Livre> getAllBooksByState(@PathVariable Status status){
        return bookService.getAllBooksByState(status);
    }

    @GetMapping
    public List<Livre> getAllLivres(){
        return bookService.getAllLivres();
    }

    @GetMapping("{id}")
    public Livre getLivreById(@PathVariable Long id){
        return bookService.getLivreById(id);
    }




}

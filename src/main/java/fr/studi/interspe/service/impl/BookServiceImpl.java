package fr.studi.interspe.service.impl;

import fr.studi.interspe.pojo.Livre;
import fr.studi.interspe.pojo.Status;
import fr.studi.interspe.repository.BookRepository;
import fr.studi.interspe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Livre> getAllBooksByState(Status status) {
        List<Livre> books = new ArrayList<>();

        /**switch (status){
            case TOUS -> books = (List<Livre>) bookRepository.findAll();
            case LOUER ->
            case ARCHIVED -> books = bookRepository.findLivresByArchive(true);
            case NON_LOUER ->
        }**/
        return books;
    }

    @Override
    public List<Livre> getAllLivres() {
        return (List<Livre>) bookRepository.findAll();
    }

    @Override
    public Livre getLivreById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}

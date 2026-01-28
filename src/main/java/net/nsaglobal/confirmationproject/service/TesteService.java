package net.nsaglobal.confirmationproject.service;

import net.nsaglobal.confirmationproject.entitys.EntidadeTeste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.nsaglobal.confirmationproject.repositorys.TesteRepository;
import net.nsaglobal.confirmationproject.dtos.teste.RequestTest;
import net.nsaglobal.confirmationproject.dtos.teste.ResponseTest;

@Service
public class TesteService {

//Attribute

    private TesteRepository repo;

//Constructor - Dependency Injection

    @Autowired
    public TesteService(TesteRepository repo) {
        this.repo = repo;
    }

//Methods - DataBase

    private EntidadeTeste createOrUpdateRepo(EntidadeTeste entidade) {
        return repo.save(entidade);
    }

    private EntidadeTeste getEntidadeTesteById(long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found"));
    }

//Methods

    public ResponseTest saveEntity(RequestTest request) {
        EntidadeTeste entity = new EntidadeTeste();
        entity.setName(request.getName());
        entity.setDescription(request.getDescription());
        entity.setValue(request.getValue());
        EntidadeTeste finalEntity = createOrUpdateRepo(entity);
        return new ResponseTest(finalEntity.getId(), finalEntity.getName(), finalEntity.getDescription(), finalEntity.getValue());
    }

    public ResponseTest searchEntity(long id) {
        EntidadeTeste entidadeTeste = getEntidadeTesteById(id);
        return new ResponseTest(entidadeTeste.getId(), entidadeTeste.getName(), entidadeTeste.getDescription(), entidadeTeste.getValue());
    }

    public ResponseTest doubleValue(long id) {
        EntidadeTeste entity = getEntidadeTesteById(id);
        entity.doubleValue();
        return new ResponseTest(entity.getId(), entity.getName(), entity.getDescription(), entity.getValue());
    }
}
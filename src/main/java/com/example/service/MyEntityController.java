package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/myentities")  // Ось шлях, за яким будуть доступні ваші HTTP-ендпоінти
public class MyEntityController {

    private final MyEntityService myEntityService;  // Ви будете взаємодіяти із сервісом

    @Autowired
    public MyEntityController(MyEntityService myEntityService) {
        this.myEntityService = myEntityService;
    }

    // Отримати всі екземпляри сутності
    @GetMapping
    public List<MyEntity> getAllMyEntities() {
        return myEntityService.getAllEntities();
    }

    // Отримати екземпляр сутності за ID
    @GetMapping("/{id}")
    public MyEntity getMyEntity(@PathVariable int id) {
        return myEntityService.getEntityById(id);
    }

    // Створити новий екземпляр сутності
    @PostMapping
    public MyEntity createMyEntity(@RequestBody MyEntity myEntity) {
        return myEntityService.createEntity(myEntity);
    }

    // Оновити існуючий екземпляр сутності
    @PutMapping("/{id}")
    public MyEntity updateMyEntity(@PathVariable int id, @RequestBody MyEntity myEntity) {
        return myEntityService.updateEntity(id, myEntity);
    }

    // Видалити екземпляр сутності за ID
    @DeleteMapping("/{id}")
    public void deleteMyEntity(@PathVariable int id) {
        myEntityService.deleteEntity(id);
    }
}

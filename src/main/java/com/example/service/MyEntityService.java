package com.example.service;

import com.example.repository.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MyEntityService {
    private final MyEntityRepository myEntityRepository;

    @Autowired
    public MyEntityService(MyEntityRepository myEntityRepository) {
        this.myEntityRepository = myEntityRepository;
    }

    public MyEntity saveMyEntity(MyEntity myEntity) {
        return myEntityRepository.save(myEntity);
    }

    public MyEntity findMyEntityById(int id) {
        return myEntityRepository.findById((long) id).orElse(null);
    }

    public List<MyEntity> findAllMyEntities() {
        return myEntityRepository.findAll();
    }

    public void deleteMyEntity(int id) {
        myEntityRepository.deleteById((long) id);
    }

    public List<MyEntity> getAllEntities() {
        return myEntityRepository.findAll();
    }

    public MyEntity getEntityById(int id) {
        return myEntityRepository.findById((long) id).orElse(null);
    }

    public MyEntity createEntity(MyEntity myEntity) {
        return myEntityRepository.save(myEntity);
    }

    public MyEntity updateEntity(int id, MyEntity myEntity) {
        // Знайдіть існуючу сутність за ID
        MyEntity existingEntity = myEntityRepository.findById((long) id).orElse(null);

        // Перевірте, чи існує сутність
        if (existingEntity != null) {
            // Оновіть властивості існуючої сутності на основі myEntity
            existingEntity.setProperty1(myEntity.getProperty1());
            existingEntity.setProperty2(myEntity.getProperty2());
            // і так далі для всіх властивостей, які ви хочете оновити

            // Збережіть оновлену сутність
            MyEntity updatedEntity = myEntityRepository.save(existingEntity);

            // Поверніть оновлену сутність
            return updatedEntity;
        }

        return null; // або інший код помилки, якщо не знайдено існуючий запис
    }


    public void deleteEntity(int id) {
        myEntityRepository.deleteById((long) id);
    }

}

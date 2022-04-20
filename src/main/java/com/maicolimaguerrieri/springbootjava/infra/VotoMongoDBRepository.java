package com.maicolimaguerrieri.springbootjava.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maicolimaguerrieri.springbootjava.domain.Voto;

@Repository
public interface VotoMongoDBRepository extends MongoRepository<Voto, UUID>{

}

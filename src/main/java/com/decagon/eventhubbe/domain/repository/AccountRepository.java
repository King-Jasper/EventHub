package com.decagon.eventhubbe.domain.repository;import com.decagon.eventhubbe.domain.entities.Account;import org.springframework.data.mongodb.repository.MongoRepository;public interface AccountRepository extends MongoRepository<Account,String> {}
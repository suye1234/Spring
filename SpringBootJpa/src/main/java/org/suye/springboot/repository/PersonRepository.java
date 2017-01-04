package org.suye.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.suye.springboot.entity.Person;

import java.util.List;

/**
 * Created by suye on 2017/1/3.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByAddress(String address);

    Person findByNameAndAddress(String name, String address);

    @Query("select p from Person p where p.name = :name and p.address = :address")
    Person withNameAndAddressQuery(@Param("name") String name, @Param("address") String addressQuery);

    List<Person> withNameAndAddressNamedQuery(String name, String addressNamedQuery);
}

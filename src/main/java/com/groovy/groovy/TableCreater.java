package com.groovy.groovy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.TableGenerator;


@Repository
public interface TableCreater extends JpaRepository<TableGenrator,String>
{

}

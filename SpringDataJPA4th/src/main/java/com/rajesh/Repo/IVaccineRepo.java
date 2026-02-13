package com.rajesh.Repo;


import com.rajesh.Entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IVaccineRepo extends JpaRepository<Vaccine , Integer>
{

}

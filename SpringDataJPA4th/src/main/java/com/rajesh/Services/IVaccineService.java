package com.rajesh.Services;
import com.rajesh.Entity.Vaccine;

import java.util.List;


public interface IVaccineService
{
     public Vaccine SearchVaccineById(Integer id);
     public List<Vaccine> SearchVaccineByInfo(Vaccine vac);

     public String DeleteAllByIdInBatch(Iterable<Integer> id);
}
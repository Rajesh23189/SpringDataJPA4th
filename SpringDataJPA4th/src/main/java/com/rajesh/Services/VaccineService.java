
package com.rajesh.Services;


import com.rajesh.Entity.Vaccine;
import com.rajesh.Repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineService implements IVaccineService {
    private IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo)
    {

        this.repo = repo;
    }

    @Override
    public Vaccine SearchVaccineById(Integer id)
    {
        Vaccine vaccine = repo.getReferenceById(id);
        return vaccine;
    }

    public List<Vaccine> SearchVaccineByInfo(Vaccine vac)
    {

        /** Create Sort Object
        Sort sort = Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC,parameter);
        **/

        Example<Vaccine> vaccineExample  = Example.of(vac);
        return repo.findAll(vaccineExample);


    }

    public String DeleteAllByIdInBatch(Iterable<Integer> ids)
    {
        List<Vaccine> list =  repo.findAllById(ids);

        if(list.size() != 0) // of Change Condition list.size() > 0 then Which vaccine Avalable Those Are deleted
        {
            repo.deleteAllByIdInBatch(ids);
            return "Records Deleted For Given Ids";
        }
        else
        {
            return "Unable To Deleted Records";
        }
    }




    @Override
    public String toString() {
        return "VaccineService{" +
                "repo=" + repo +
                '}';
    }
}

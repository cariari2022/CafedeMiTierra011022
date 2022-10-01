package com.backend.tierracafe.repositories;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.backend.tierracafe.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long>{
    //public abstract Optional<ArrayList<UsuarioModel>> findByCedula(Float Cedula);
    //public abstract Optional<ArrayList<UsuarioModel>> findByCiudad(String Ciudad);
}

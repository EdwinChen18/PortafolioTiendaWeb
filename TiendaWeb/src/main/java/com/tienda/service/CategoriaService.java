package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
 
    //Se obtiene una categoria a partir del id de una categoria 
    public Categoria getCategoria(Categoria categoria);
    
    //Se inserta una nueva categoria si el id de la ccategoria esta vacio
    //Se actualiza una categoria si el di de categoria NO esta vacio
    public void save (Categoria categoria);
    
    //Se elimina el categoria que tiene el id pasado por parametro  
    public void delete(Categoria categoria);
}

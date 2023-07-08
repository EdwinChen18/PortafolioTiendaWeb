package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
    
    public List<Producto> getCategorias(boolean activos);
    
    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
}

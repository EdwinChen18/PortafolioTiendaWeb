package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {
    
    public String cargaItem(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com#"
    final String BucketName = "techshop-3320f.appspot.com";
    
    //Esta es la ruta basica de este proyecto TechShop
    final String rutaSuperiorStorage = "techshop";
    
    //Ubicacion en donde se encuentra el archivo de configuracion Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-3320f-firebase-adminsdk-nrfen-e89205185c";
 
            
}

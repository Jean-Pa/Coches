package com.project.coches.coches.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import com.project.coches.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.coches.persistence.entity.MarcaCocheEntity;

@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {
    /*
     * Convierte una entidad a un pojo de marca Coche
     */
    /*
     * @Mappings({
     * 
     * @Mapping(source = "id", target = "id"),
     * 
     * @Mapping(source = "description", target = "description")
     * })
     */

    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")

    MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaCocheEntity);

    /*
     * Convierte un pojo a una entidad de marca coche
     */
    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaCochePojo);

}
